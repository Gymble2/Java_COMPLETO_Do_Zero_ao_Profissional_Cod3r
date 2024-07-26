import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios= new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Jessica"));
        usuarios.add(new Usuario("Kleber"));

        boolean resultado = usuarios.contains(new Usuario("Pedro"));
        System.out.println(resultado);

    }
}