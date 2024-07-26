package JavaCompleto.TratamentoDeExecao.PersonalizadoErros;

public class NumeroForaDoIntervalo extends RuntimeException {
    
    String nomeDoAtributos;

    NumeroForaDoIntervalo(String nomeDoAtributo){
        this.nomeDoAtributos =  nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %S esta fora do intervalo", nomeDoAtributos);
    }
}
