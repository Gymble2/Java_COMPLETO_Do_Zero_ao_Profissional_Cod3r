package JavaCompleto.Desafios.CarroDesafio;

public class Fusca extends Carro {
    @Override
    public void acelerar() {
        velocidadeAtual = velocidadeAtual * 15;
    }

    @Override
    public void frear() {
        velocidadeAtual -= 10;
    }
}
