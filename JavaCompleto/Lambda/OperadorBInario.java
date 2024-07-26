package JavaCompleto.Lambda;

import java.util.function.BinaryOperator;

public class OperadorBInario {
    public static void main(String[] args) {

        BinaryOperator<Double> media = (nota1,nota2) -> (nota1 + nota2) / 2;

        System.out.println(media.apply(9.8, 5.7));
    }
}
