package br.com.cursopcv.testes;

import java.util.List;

import br.com.cursopcv.modelo.Produto;
import br.com.cursopcv.modelo.ProdutoDao;

public class ListaTodosProdutos {
    public static void main(String[] args) {
        ProdutoDao<Produto> daoProduto = new ProdutoDao<>(Produto.class);
        
        List<Produto> produtos = daoProduto.abrir().findAll();

        System.out.println();
        System.out.println("OUTPUT --------------------------------------------");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - " + produto.getDescricao() + " - " + produto.getPreco());
        }

        daoProduto.fechar();
    }
}
