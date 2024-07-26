package JavaCompleto.TratamentoDeExecao.PersonalizadoErros;

import JavaCompleto.TratamentoDeExecao.Aluno;


public class Validar {
    
    private Validar(){}

    public static void usuario (Aluno aluno){
        if(aluno == null){
            throw new IllegalArgumentException("Aluno esta nulo!!");
        }

        if (aluno.nome ==null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("Nome");
        }

        if (aluno.nota<0 || aluno.nota >10) {
            throw new NumeroForaDoIntervalo("Nota");
        }
    }
    
}
