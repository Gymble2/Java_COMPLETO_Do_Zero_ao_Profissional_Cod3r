public class Main {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2= new Data(23,03,2024);

        data1.anoEscolhido = 2004;

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());
        /*
        data1.ano=2024;
        data1.dia=23;
        data1.mes=03;
        Data data2= new Data();
        data2.dia=19;
        data2.mes=02;
        data2.ano=2022;
        System.out.printf("%d %d %d",data1.ano, data1.dia, data1.mes);
        */
    }
}