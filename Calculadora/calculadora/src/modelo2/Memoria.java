package modelo2;

import java.util.List;
import java.util.ArrayList;

public class Memoria {

    private enum TipoComando {
        ZERAR, NUMERO, DIVISAO, MUTIPLICACAO, SOMA, SUB , IGUAL, VIRGULA, INVERTE ;
    };

    private static Memoria instancia = new Memoria();

    private final List<MemoriaObservador> observadores
                = new ArrayList<>();


    private boolean substituir = false;
    private TipoComando ultimaOperacao = null;
    private String textoAtual = "";
    private String textoBuffer = "";


    private Memoria(){

    }

    public void adicionarObeservador(MemoriaObservador observador){
        observadores.add(observador);
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty()? "0": textoAtual;
    }

    public static Memoria getInstancia(){
        return instancia;
    }

    public void processarComando(String texto){

        TipoComando tipoComando = detectarTipoComando(texto);

        if(tipoComando == null){
            return;
        }else if(tipoComando == TipoComando.ZERAR){
            textoAtual = "";
            textoBuffer = "";
            ultimaOperacao = null;
            substituir = false;
        }else if (tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
            textoAtual = substituir ? texto : textoAtual + texto;
            substituir = false;
        }else if(tipoComando == TipoComando.INVERTE && textoAtual.contains("-")){
            textoAtual = textoAtual.substring(1);
        }else if(tipoComando == TipoComando.INVERTE && !textoAtual.contains("-")){
            textoAtual = "-" + textoAtual;
        }else{
          substituir = true;
          textoAtual = obterResultadoOperacao();
          textoBuffer = textoAtual;
          ultimaOperacao = tipoComando;
        }

        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }

    private String obterResultadoOperacao() {
        if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL){
            return textoAtual;
        }

        double numeroBuffer =
         Double.parseDouble(textoBuffer.replace(",","."));
        double numeroAtual =
         Double.parseDouble(textoAtual.replace(",","."));

        double resultado = 0;

        if(ultimaOperacao == TipoComando.SOMA){
            resultado = numeroBuffer + numeroAtual;
        }else if(ultimaOperacao == TipoComando.SUB){
            resultado = numeroBuffer - numeroAtual;
        }else if(ultimaOperacao == TipoComando.MUTIPLICACAO){
            resultado = numeroBuffer * numeroAtual;
        }else if(ultimaOperacao == TipoComando.DIVISAO){
            resultado = numeroBuffer / numeroAtual;
        }

        String texto = Double.toString(resultado).replace(".",",");
        boolean inteiro = texto.endsWith(",0");
        return inteiro ? texto.replace(",0","") : texto;
    }

    private TipoComando detectarTipoComando(String texto) {
        
        if(textoAtual.isEmpty() && texto =="0"){
            return null;
        }

        try {
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
        } catch (NumberFormatException e) {
            //Quando não for numero faz outros testes
            if("AC".equals(texto)){
                return TipoComando.ZERAR;
            }else if("*".equals(texto)){
                return TipoComando.MUTIPLICACAO;
            }else if("+".equals(texto)){
                return TipoComando.SOMA;
            }else if("-".equals(texto)){
                return TipoComando.SUB;
            }else if("=".equals(texto)){
                return TipoComando.IGUAL;
            }else if(",".equals(texto) && !textoAtual.contains(",")){
                return TipoComando.VIRGULA;
            }else if("/".equals(texto)){
                return TipoComando.DIVISAO;
            }else if("±".equals(texto)){
                return TipoComando.INVERTE;
            }else{
                return null;
            }
            
        }
    }
}
