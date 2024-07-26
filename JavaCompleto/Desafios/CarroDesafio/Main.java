package JavaCompleto.Desafios.CarroDesafio;

public class Main {
    public static void main(String[] args) {
        Civic civic = new Civic();

        System.out.println(civic.velocidadeAtual);
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        System.out.println(civic.velocidadeAtual);
        
        Fusca fusca = new Fusca();

        System.out.println(fusca.velocidadeAtual = 15);
        fusca.acelerar();
        System.out.println(fusca.velocidadeAtual);
    }
}
