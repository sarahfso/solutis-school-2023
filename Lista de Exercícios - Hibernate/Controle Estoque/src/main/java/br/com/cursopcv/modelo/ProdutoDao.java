package br.com.cursopcv.modelo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ProdutoDao<E> {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> entidade;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("contestoque");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public ProdutoDao(Class<E> entidade) {
		this.entidade = entidade;
		em = emf.createEntityManager();
	}

	public ProdutoDao<E> abrir() {
		em.getTransaction().begin();
		return this;
	}
	
	public ProdutoDao<E> fechar() {
		em.getTransaction().commit();
		return this;
	}

	public ProdutoDao<E> create(E entidade) {
		em.persist(entidade);
		return this;
	}

	@SuppressWarnings("unchecked")
	public List<Produto> findAll() {
        Query query = em.createQuery("SELECT p FROM Produto p");
        return query.getResultList();
    }

	public E findById(Object id) {
		return em.find(entidade, id);
	}

	public Produto update(int id, String nome, String descricao, double preco ) {
		ProdutoDao<E> dao = new ProdutoDao<E>(entidade);
		dao.abrir();
		
		Produto produto = (Produto) dao.findById(id);
		produto.setNome(nome);
		produto.setDescricao(descricao);
		produto.setPreco(preco);
		
		em.merge(produto);
		
		dao.fechar();
		
		return produto;
	}

	public ProdutoDao<E> delete(int id) {
		ProdutoDao<E> dao = new ProdutoDao<E>(entidade);
		E objEncontrado = dao.findById(id);
		em.remove(em.contains(objEncontrado) ? objEncontrado : em.merge(objEncontrado));
		return this;
	}
}

