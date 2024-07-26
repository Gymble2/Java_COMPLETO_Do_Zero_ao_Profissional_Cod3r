package ProjetoObserver;

import java.util.Date;

/**
 * EventoChallengeAniversariante
 */
public class EventoChallengeAniversariante {
    private final Date momento;

    public EventoChallengeAniversariante(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }
    
}