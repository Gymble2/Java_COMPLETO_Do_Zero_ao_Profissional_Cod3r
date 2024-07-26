package JavaCompleto.Lambda;
import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        Predicate<Produto> isCaro = 
            prod -> (prod.preco)*1 - prod.desconto <= 150;

        Produto produto = new Produto("notebook",10,150.00);
        System.out.println(isCaro.test(produto));
    }
}
