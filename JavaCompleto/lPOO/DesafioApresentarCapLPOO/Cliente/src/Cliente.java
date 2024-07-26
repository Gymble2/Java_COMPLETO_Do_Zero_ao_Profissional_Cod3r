package JavaCompleto.lPOO.DesafioApresentarCapLPOO.Cliente.src;
import java.util.ArrayList;
import java.util.List;
public class Cliente {

    String nome;
    String cpf;

    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

   double obterValorTotal(){
        double total = 0;

       for (Compra compra:
            compras) {
           total += compra.obterValorTotal();
       }
       return total;
   }


}