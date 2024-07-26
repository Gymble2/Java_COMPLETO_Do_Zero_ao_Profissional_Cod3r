package JavaCompleto.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir =
            produto -> System.out.println(produto.nome);

        Produto p1 = new Produto("Televisão", 8.0, 321.12);
        imprimir.accept(p1);

        Produto p2 = new Produto("Kiko", 25.0,89.90);
        Produto p3 = new Produto("Computador", 8.0, 150.00);
        Produto p4 = new Produto("Geladeira", 8.0, 100.00);
        

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);
        produtos.forEach(imprimir);
        produtos.forEach(
            produto -> System.out.println(produto.preco - produto.desconto));
    }
}
