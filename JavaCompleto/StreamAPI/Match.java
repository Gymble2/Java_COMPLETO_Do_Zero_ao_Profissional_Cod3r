package JavaCompleto.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1= new Aluno("Ana", 12.0);
        Aluno a2= new Aluno("Josefa", 3.5);
        Aluno a3= new Aluno("Amanda", 7.2);
        Aluno a4= new Aluno("Rodrigo",8.2);

        List<Aluno> testeAlunosAprovados = Arrays.asList(a1,a2,a3,a4);
        
        Predicate<Aluno> verificaNota = aluno -> aluno.nota >= 7;

        System.out.println(testeAlunosAprovados.stream().allMatch(verificaNota));
        System.out.println(testeAlunosAprovados.stream().anyMatch(verificaNota));
        System.out.println(testeAlunosAprovados.stream().noneMatch(verificaNota));
    }
    
}
