package JavaCompleto.Lambda;

import java.util.Arrays;
import java.util.List;

public class ForeachFuncional {
    public static void main(String[] args) {
        List<String> aprovados = Arrays
        .asList("Jessica","Pedro", "Fundamentalmente", "Diametro");

        System.out.println("....Forma tradicional....");
        for (String estudantes : aprovados) {
            System.out.println(estudantes);
        }

        System.out.println("\n...Lambda #01...");
        //Caso tenha um parametro n precisa de parenteses
        aprovados.forEach(estudantes -> System.out.println(estudantes +" !!!"));

        System.out.println("\n ...Method reference...");
        aprovados.forEach(System.out::println);

        System.out.println("\n...Lambda #02...");
        //Caso tenha um parametro n precisa de parenteses
        aprovados.forEach(nome -> meuImprimir(nome));
            
        System.out.println("\n ...Method reference #02...");
        aprovados.forEach(ForeachFuncional::meuImprimir);

    }  

    static void meuImprimir(String nome){
        System.out.println("oi meu nme é " + nome);
    }
}
