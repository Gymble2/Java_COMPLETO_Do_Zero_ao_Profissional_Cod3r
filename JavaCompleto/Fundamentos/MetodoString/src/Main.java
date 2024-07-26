public class Main {
    public static void main(String[] args) {
        System.out.println("Ara so".charAt(2)); // pega uma letra da String

        String s = "Boa tarde";

        System.out.println(s.concat("!!!!"));// adiciona após
        System.out.println(s.startsWith("Boa"));// verifica se inicia com
        System.out.println(s.length());//tamanho da string
        System.out.println(s.endsWith(""));// verifica o final
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12341.23;

        System.out.println("Nome:" + nome +"\nSobrenome: " + sobrenome);
        //.substring(6) .substring(6,10) // Pega um espaço da String de um ponto até outro

    }
}