public class Data {
    int diaEscolhido;
    int mesEscolhido;
    int anoEscolhido;

    Data(int dia,int mes, int ano){
        diaEscolhido = dia;
        mesEscolhido = mes;
        anoEscolhido= ano;
    }
    Data(){
        diaEscolhido = 01;
        mesEscolhido = 01;
        anoEscolhido = 1970;
    }

    String obterDataFormatada(){
        return String.format("%d %d %d", diaEscolhido, mesEscolhido, anoEscolhido);
    }
}

