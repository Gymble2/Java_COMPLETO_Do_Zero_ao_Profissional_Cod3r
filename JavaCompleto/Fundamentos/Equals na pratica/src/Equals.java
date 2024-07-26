public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "jessica";
        u1.email = "JessicaNovinha@.com";
        Usuario u2 = new Usuario();
        u2.nome = "jessica";
        u2.email = "JessicaNovinha@.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u1));
    }
}
