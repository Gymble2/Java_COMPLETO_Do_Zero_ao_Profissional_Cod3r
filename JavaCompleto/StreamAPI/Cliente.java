package JavaCompleto.StreamAPI;

public class Cliente {
    final String nome;
    final Double preco;
    boolean vaga;
    String extra = "";

    public Cliente(String nome,Double preco,boolean vaga) {
        this.nome = nome;
        this.preco = preco;
        this.vaga = vaga;
    }    
    public Cliente(String nome,Double preco,boolean vaga, String extra) {
        this.nome = nome;
        this.preco = preco;
        this.vaga = vaga;
        this.extra = extra;
    }    
}
