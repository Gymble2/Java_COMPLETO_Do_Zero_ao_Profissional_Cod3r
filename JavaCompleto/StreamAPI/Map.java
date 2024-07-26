package JavaCompleto.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;

        List<String> marcas= Arrays.asList("Honda ", "Bmw ", "Doritos ");

       // marcas.stream().map(m -> m.toUpperCase()).forEach(print);;

        UnaryOperator<String> maiusucla = n -> n.toUpperCase(); 
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) +"";
        UnaryOperator<String> grito = n -> n +"!!!!";

        //System.out.println(maiusucla.andThen(primeiraLetra).andThen(grito).apply("bmw"));

        System.out.println("\n\nUsando Composição...");
        marcas.stream()
            .map(maiusucla)
            .map(primeiraLetra)
            .map(grito)
            .forEach(print);
    }
}
