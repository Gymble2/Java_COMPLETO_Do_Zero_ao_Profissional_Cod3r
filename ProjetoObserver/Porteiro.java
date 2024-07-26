package ProjetoObserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Porteiro
 */
public class Porteiro {

    private List<ChegadaAniversarianteObservador> observadores 
            = new ArrayList<>();

    public void registraObservador
        (ChegadaAniversarianteObservador observador)
        { 
            observadores.add(observador);
        }

    public void monitorar (){
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!"Sair".equalsIgnoreCase(valor)) {
            System.out.println("Aniversariante chegou? ");
            valor = entrada.nextLine();

            if("Sim".equalsIgnoreCase(valor)){
                //Criar evento
                EventoChallengeAniversariante evento = 
                    new EventoChallengeAniversariante(new Date());

                //Notifica os observadoeres;
                observadores.stream()
                    .forEach(o -> o.chegou(evento));
                valor = "sair";
            }else{
                System.out.println("Alarme Falso");
            }
        }

        entrada.close();
    }
}