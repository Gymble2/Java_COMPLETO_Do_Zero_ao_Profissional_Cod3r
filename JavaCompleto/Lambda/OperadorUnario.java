package JavaCompleto.Lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = valor -> valor + 2;
        UnaryOperator<Integer> vezesDois = valor -> valor * 2;
        UnaryOperator<Integer> aoQuadrado = valor -> valor * valor;

        int resultado =maisDois
            .andThen(vezesDois)
            .andThen(aoQuadrado)
            .apply(2);

        System.out.println(resultado);


    }
}
