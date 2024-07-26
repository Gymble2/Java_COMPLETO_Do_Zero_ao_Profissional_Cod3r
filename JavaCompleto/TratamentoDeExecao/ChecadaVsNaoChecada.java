package JavaCompleto.TratamentoDeExecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }
    
    //Exceção não checada ou não verificada
    static void geraErro1() {
        // TODO Auto-generated method stub
        // Run time é sempre uma não checada e não é obrigado a ser tratado
        // Você escolhe em qual "Camada" você vai tratar o erro com um try catch ou tratando o erro
        throw new RuntimeException("Ocorreu um erro bem legal #02");
    }

    //Exceção checada ou verificada
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro bem legal #01");
    }
}
