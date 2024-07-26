package JavaCompleto.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;

        Aluno a1= new Aluno("Ana", 12.0);
        Aluno a2= new Aluno("Josefa", 6.5);
        Aluno a3= new Aluno("Amanda", 4.2);
        Aluno a4= new Aluno("Rodrigo",8.2);

        List<Aluno> testeAlunosAprovados = Arrays.asList(a1,a2,a3,a4);
        
        Predicate<Aluno> verificaNota = aluno -> aluno.nota >= 7;
        Function<Aluno, String> stringPraNota = s -> "Parabéns " + s.nome + " Você foi aprovado!!\n";

        testeAlunosAprovados.stream()
            .filter(verificaNota) //Filter é um ""predicate""
            .map(stringPraNota) //map é um ""function""
            .forEach(print);
    }
}
