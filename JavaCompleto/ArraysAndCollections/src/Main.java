import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> fila= new LinkedList<>();// primeiro que entra é o primeiro que sai

        fila.add("Ana");// se tiver restrição de tamanho ele retorna uma exceção
        fila.offer("Bia"); // se tiver restrição de tamanho ele retorna falso

        System.out.println(fila.peek()); // retorna o primeiro valor e se estiver vazio ele retorna null
        System.out.println(fila.element());//se estiver vazio ele retorna uma exceção

        //fila.size();
        //fila.cler();
        //fila;isEmpty();

        System.out.println(fila.poll());//retorna false
        System.out.println(fila.remove()); // lança uma exceção
    }
}