import modelo.Tabuleiro;

public class aplicação {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6,6);
        new TabuleiroConsole(tabuleiro);

    }
}
