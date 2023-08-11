package br.com.cursopcv.testes;

import br.com.cursopcv.modelo.Produto;
import br.com.cursopcv.modelo.ProdutoDao;

public class InclusaoDeProduto {
    public static void main(String[] args) {
        Produto prop1 = new Produto("Panela", "Panela de Pressão 10 Litros", 56.80);
        Produto prop2 = new Produto("Cama", "Cama de casal Big", 450.68);
        Produto prop3 = new Produto("Caixa Som", "Caixa de Som JBL", 160.00);
     
        ProdutoDao<Produto> daoProduto = new ProdutoDao<>(Produto.class);

        daoProduto.abrir()
			.create(prop1)
			.create(prop2)
            .create(prop3)
			.fechar();
    }
}