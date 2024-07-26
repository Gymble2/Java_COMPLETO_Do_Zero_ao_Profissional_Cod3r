package JavaCompleto.TratamentoDeExecao.PersonalizadoErros;

import JavaCompleto.TratamentoDeExecao.Aluno;


public class PersonalizadaA extends RuntimeException {
    public static void main(String[] args) {
      try {
        Aluno  aluno = new Aluno ("Ana", (double) 7);

        Validar.usuario(aluno);
        
        Validar.usuario(null);

        System.out.println("Fim !!");
      } catch (StringVaziaException | NumeroForaDoIntervalo | IllegalArgumentException e) {
        // TODO Auto-generated catch block
        System.out.println(e.getMessage());
      }
    }
}
