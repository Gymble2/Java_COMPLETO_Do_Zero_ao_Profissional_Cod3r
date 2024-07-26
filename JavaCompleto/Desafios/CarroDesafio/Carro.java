package JavaCompleto.Desafios.CarroDesafio;

public class Carro {
    int velocidadeAtual = 0;

    public void acelerar(){
        velocidadeAtual += 5;
    }

    public void frear(){
        if(velocidadeAtual > 0){
            velocidadeAtual -= 15;
        }
    }
}
