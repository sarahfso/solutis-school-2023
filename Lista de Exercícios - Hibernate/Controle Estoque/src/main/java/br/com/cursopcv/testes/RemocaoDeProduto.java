package br.com.cursopcv.testes;

import br.com.cursopcv.modelo.Produto;
import br.com.cursopcv.modelo.ProdutoDao;

public class RemocaoDeProduto {
    public static void main(String[] args) {
        ProdutoDao<Produto> daoProduto = new ProdutoDao<>(Produto.class);
        
        daoProduto.abrir()
			.delete(3)
			.fechar();
    }
}
