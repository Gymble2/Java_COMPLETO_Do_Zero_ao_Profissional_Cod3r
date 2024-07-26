import java.util.ArrayList;
import java.util.List;

public class ListasEstudos {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Kaio"));
        lista.add(new Usuario("Felipe"));
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Pedro"));

        System.out.println(lista.get(3));//Accessa pelo indicec

        lista.remove(2);//remove pelo indice
        lista.remove(new Usuario("Felipe"));

        for (Usuario pessoa:
             lista) {
            System.out.println(pessoa);
        }
    }
}