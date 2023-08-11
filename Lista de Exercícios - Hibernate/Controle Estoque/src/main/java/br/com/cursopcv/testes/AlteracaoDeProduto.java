package br.com.cursopcv.testes;

import br.com.cursopcv.modelo.Produto;
import br.com.cursopcv.modelo.ProdutoDao;

public class AlteracaoDeProduto {
    public static void main(String[] args) {
        ProdutoDao<Produto> daoProduto = new ProdutoDao<>(Produto.class);

        daoProduto.update(2, "Cama", "Cama de casal Big", 345.00);
    }
}
