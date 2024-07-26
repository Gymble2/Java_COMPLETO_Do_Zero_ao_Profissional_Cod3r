package ProjetoObserver;


public class FestaSurpresa {
    public static void main(String[] args) {
        //Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        //porteiro.registraObservador(namorada);
        porteiro.registraObservador(e -> System.out.println("Surpresa via lambda"));
        porteiro.monitorar();
    }
}
