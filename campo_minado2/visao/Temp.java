package visao;

import modelo.Tabuleiro;

public class Temp {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(3, 3, 9);

        

        tabuleiro.regirtrarObservador(e ->{
            if(e.isGanhou()){
                System.out.println("Ganhou");
            }else{
                System.out.println("Perdeu");
            }

        });

        tabuleiro.abrir(2, 2);

        
    }
}
