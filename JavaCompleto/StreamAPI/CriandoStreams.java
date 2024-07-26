package JavaCompleto.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::print;

        //Valores literais
        Stream<String> langs = Stream.of("Java ", "Lua ","Js \n");
        langs.forEach(print);

        //passando com um array
        String[] maisLangs = {"Py ", "Lisp ", "Pearl ", "Go\n"};
        Stream.of(maisLangs).forEach(print);

        //Passando com um array
        Arrays.stream(maisLangs).forEach(print);
        //Imprime apenas Lisp mostra o "1" e vai até o 2 - 1 = 1
        Arrays.stream(maisLangs,1,2).forEach(print);

        //Imprimir com base na List
        List<String> outrasLangs = Arrays.asList("C++ ","PHP ","C# \n ");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        //Imprime infinitamente com generate sem ordenação (No exemplo usando lambda supplier)
        //Stream.generate(() -> "a").forEach(print);;

        //Imprime infinitamente usando iterate com ordenação (Usando lambda com unaryOperator)
        //Stream.iterate(0,n -> n+1).forEach(print);
    }
}
