package JavaCompleto.Lambda.DesafioBinaryOperator;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class desafioBinaryOperator {
    public static void main(String[] args) {
        Produto p = new Produto ("iPad", 3235.89, 0.13);
        
        Function<Produto, Double> precoComDesconto = 
                produto -> produto.preco * (1 - produto.desconto);  
        
        UnaryOperator<Double> impostoMunicipal = 
                preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete = 
                preco -> preco >=3000? preco+100: preco + 50;

        UnaryOperator<Double> arredondar =
            preco -> Double.parseDouble(String.format("%.2f", preco).replace(",","."));

        Function<Double, String> formatacaoDinheiro =
            valor -> (("R$" + valor).replace(".", ","));

        String preco = precoComDesconto
            .andThen(impostoMunicipal)
            .andThen(frete)
            .andThen(arredondar)
            .andThen(formatacaoDinheiro)
            .apply(p);

        System.out.println("O preco final é "+ preco);
    }
}
