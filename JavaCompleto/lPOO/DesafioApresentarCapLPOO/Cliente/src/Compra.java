package JavaCompleto.lPOO.DesafioApresentarCapLPOO.Cliente.src;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int qnt ){
        this.itens.add(new Item(p,qnt));
    }

    void adicionarItem(String nome,double preco, int qnt ){
        var produto = new  Produto(nome , preco);
        this.itens.add(new Item(produto, qnt));
    }
    
    double obterValorTotal(){
        double total = 0;

        for (Item itens:
             itens) {
            total += itens.qnt * itens.produto.preço;
        }
        return total;
    }

}