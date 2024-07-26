import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import excecao.ExplosaoException;
import excecao.SairException;
import modelo.Tabuleiro;

public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        executarJogo();
    }

    private void executarJogo(){
        try {
            boolean continuar = true;
            
            while(continuar){

                cilcoDojogo();

                System.out.println("Outra Partido? (S/n) ");
                String respostas = entrada.nextLine();

                if("n".equalsIgnoreCase(respostas)){
                    continuar = false;
                }else{
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairException e) {
            System.out.println("Tchau");
        }finally{
            entrada.close();
        }
    }

    private void cilcoDojogo(){
        try {
            while(!tabuleiro.obetivoAlcancado()){
                System.out.println(tabuleiro);
                
                String digitado = capturarValorDigitado("Digite (x,y): ");

                Iterator<Integer> xy = Arrays.stream(digitado.split(","))
                    .map(e -> Integer.parseInt(e.trim())).iterator();

                //System.out.println("linha " + xy.next());
                //System.out.println("coluna " + xy.next());

                digitado = capturarValorDigitado("\n1 - Para abrir / 2 - Para marcar:");
                
                if("1".equalsIgnoreCase(digitado)){
                    tabuleiro.abrir(xy.next(),xy.next());
                }else if("2".equalsIgnoreCase(digitado)){
                    tabuleiro.alternarMarcado(xy.next(),xy.next());
                }
            }
            System.out.println("Você ganhou!!");
        } catch (ExplosaoException e) {
            System.out.println(tabuleiro);
            System.out.println("Você perdeu") ;
        }
    }

    private String capturarValorDigitado(String texto){
        System.out.println(texto);
        String valorDigitado = entrada.nextLine();

        if("sair".equalsIgnoreCase(valorDigitado)){
         throw new SairException();   
        }

        return valorDigitado;
    }
}
