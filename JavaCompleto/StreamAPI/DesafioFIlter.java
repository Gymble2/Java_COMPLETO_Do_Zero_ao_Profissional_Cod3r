package JavaCompleto.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFIlter {
    
    public static void main(String[] args) {
        Consumer<Object> print = System.out::println;

    Cliente c1= new Cliente("Pedro", 32.00, true);
    Cliente c2= new Cliente("Gabriel", 35.50,false);
    Cliente c3= new Cliente("Cleiton", 25.00,false);
    Cliente c4= new Cliente("Ryan",60.00,true,"Luzes");
    Cliente c5= new Cliente("Jefersson",55.00,false, "Tinta");

    Function<Cliente, String> lucroCorte = 
            corte -> corte.nome+ " R$" + (corte.preco-30) ;
    
    Predicate<Cliente> soOsLucros = lucro -> lucro.preco >= 30 ;
    Predicate<Cliente> apenasComVagas = lucro -> lucro.vaga == true ;
        
    //Function<Cliente, String> tipoExtra = extra ->  extra.extra.toString() ;

    List<Cliente> clientes = Arrays.asList(c1,c2,c3,c4,c5);

    clientes.stream()
        .filter(soOsLucros)
        .filter(apenasComVagas)
        .map(lucroCorte)
        .forEach(print)
        ;
    }
}
