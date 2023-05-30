package Test;

import iterator.Estoque;
import iterator.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class EstoqueTest {

    @Test
    public void testAdicionarProduto() {
        Produto p1 = new Produto("Camiseta", 29.99);
        Produto p2 = new Produto("Calça Jeans", 79.99);

        Estoque estoque = new Estoque();
        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);

        Iterator<Produto> iterator = estoque.iterator();
        Assertions.assertEquals(p1, iterator.next());
        Assertions.assertEquals(p2, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorVazio() {
        Estoque estoque = new Estoque();
        Iterator<Produto> iterator = estoque.iterator();
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorUmProduto() {
        Produto p1 = new Produto("Camiseta", 29.99);

        Estoque estoque = new Estoque();
        estoque.adicionarProduto(p1);

        Iterator<Produto> iterator = estoque.iterator();
        Assertions.assertEquals(p1, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
}
