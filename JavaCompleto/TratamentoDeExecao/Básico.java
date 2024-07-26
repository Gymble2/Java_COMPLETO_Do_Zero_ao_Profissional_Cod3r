package JavaCompleto.TratamentoDeExecao;

public class Básico {


    public static void main(String[] args) {
        Aluno a1 = null;

        imprimirAluno(a1);

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e ) {
            //ArithmeticException.printStackTrace();
            System.out.println("Erro na divisão" + e.getMessage());
        }

        System.out.println("Fim :)");
    }

    public static void imprimirAluno(Aluno aluno){
        try {
            System.out.println(aluno.nome);
        } catch (NullPointerException e) {
            System.out.println("Erro na impressão de aluno"+ e.getMessage()); 
        }
        
    }
}
