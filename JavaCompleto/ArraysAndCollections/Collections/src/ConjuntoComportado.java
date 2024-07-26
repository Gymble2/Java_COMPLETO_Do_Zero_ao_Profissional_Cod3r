

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> lista = new HashSet<>();//conjunto organizado com informações
        SortedSet<String> lista = new TreeSet<>();//conjunto organizado e organizado por ordem alfabetica e de outras maneiras

        lista.add("Bianca");
        lista.add("Pedro");
        lista.add("Jessica");
        lista.add("Ana");
        lista.add("Diametro");
        System.out.println(lista);

        for (String candidado:
             lista) {
            System.out.println(candidado);
        }

        lista.clear();

        Set<Integer> lista2 = new TreeSet<>(); //Conjunto só aceita tipos referencias ou tipo objetos para a sua criação

        lista2.add(1);
        lista2.add(2);
        lista2.add(3);

        for (Integer nums:
             lista2) {
            System.out.println(nums);
        }
    }
}
