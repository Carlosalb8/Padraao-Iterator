package iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Estoque implements Iterable<Produto> {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public Iterator<Produto> iterator() {
        return produtos.iterator();
    }
}