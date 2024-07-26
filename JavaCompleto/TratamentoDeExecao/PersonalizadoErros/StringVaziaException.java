package JavaCompleto.TratamentoDeExecao.PersonalizadoErros;


public class StringVaziaException extends RuntimeException {
    
    String nomeDoAtributos;

    StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributos =  nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %S esta vazio", nomeDoAtributos);
    }
}
