import javax.swing.*;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

                        //Caixa de dialogo para receber infos
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String valor2 = JOptionPane.showInputDialog("Digite o Segundo número");

        System.out.println(valor1 + valor2);

                            //Transofrma String para valor double
        double numero1 =    Double.parseDouble(valor1);
        double numero2 =    Double.parseDouble(valor1);

        double soma = numero1+numero2;
        System.out.println(soma);

    }
}