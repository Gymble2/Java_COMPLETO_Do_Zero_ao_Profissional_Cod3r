package JavaCompleto.lPOO.Jogo;

public class Heroi extends Jogador {
    
    private static String playerAtribute;
    Atributos atributos = new Atributos();

    void setPlayerAtribute(String choice){
        playerAtribute = choice;
        adicionarVida(playerAtribute);
    }


    int adicionarVida(String playerAtribute){
            if (playerAtribute.equalsIgnoreCase(atributos.setChoicesAtributes(playerAtribute.toLowerCase()))){
                vida += 10;
            }else{
                System.out.println(atributos.setChoicesAtributes(playerAtribute.toLowerCase()));
            }
            return 0;
    }
}
