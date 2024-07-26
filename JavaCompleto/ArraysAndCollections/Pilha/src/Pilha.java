import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros= new ArrayDeque<>();

        livros.add("Kleber");// retorna verdadeiro o falso
        livros.push("Kleberzão");//retorna exceção
        livros.push("Zezao");

        System.out.println(livros.peek());// retorna verdadeiro o fals
        System.out.println(livros.element());//retorna exceção


        System.out.println(livros.pop());// retorna verdadeiro o fals
        System.out.println(livros.poll());// retorna verdadeiro o fals
        System.out.println(livros.poll());// retorna verdadeiro o fals
        System.out.println(livros.poll());// retorna verdadeiro o fals
        System.out.println(livros.poll());// retorna verdadeiro o fals
        //System.out.println(livros.remove());//retorna exceção

    }
}