package JavaCompleto.Lambda;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer , String> parOuImpar = 
            numero  -> numero % 2 == 0 ? "par": "impar";

        System.out.println(parOuImpar.apply(32));

        Function<String , String> oResultadoE =
            valor -> "Esse valor é " + valor;

        String ResultadoFinal1 = parOuImpar
                .andThen(oResultadoE)
                .apply(32);

        System.out.println(ResultadoFinal1);

        String ResultadoFinal2 = parOuImpar
                .andThen(oResultadoE)
                .apply(33);

        System.out.println(ResultadoFinal2);
    }
}
