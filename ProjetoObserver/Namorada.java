package ProjetoObserver;

public class Namorada implements ChegadaAniversarianteObservador {

    @Override
    public void chegou(EventoChallengeAniversariante evento) {
        System.out.println("Avisar os convidades...");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar...");
        System.out.println("Surpresaaaa!!!!");
    }
    
}
