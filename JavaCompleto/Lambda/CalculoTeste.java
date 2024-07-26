package JavaCompleto.Lambda;

public class CalculoTeste {
    public static void main(String[] args) {
        Calculo executar = new Multiply();
        
        int a = 14;
        int b = 20; 

        System.out.println(executar.executar(a, b));

        executar = new Soma();
        System.out.println(executar.executar(a, b));


        
    }
}
