package JavaCompleto.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MineMax {
    public static void main(String[] args) {
        Aluno a1= new Aluno("Ana", 12.0);
        Aluno a2= new Aluno("Josefa", 3.5);
        Aluno a3= new Aluno("Amanda", 7.2);
        Aluno a4= new Aluno("Rodrigo",8.2);

        List<Aluno> testeAlunosAprovados = Arrays.asList(a1,a2,a3,a4);

        Comparator<Aluno> melhorNota = (aluno1,aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota > aluno2.nota) return -1;
            return 0;   
        };

        System.out.println(testeAlunosAprovados
                .stream()
                .max(melhorNota)
                .get() +"\n");

        System.out.println(testeAlunosAprovados
                .stream()
                .min(melhorNota)
                .get());
    }
}
