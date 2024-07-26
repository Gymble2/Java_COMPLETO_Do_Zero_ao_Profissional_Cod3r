package JavaCompleto.lPOO.Jogo;


public class Jogo {
    public static void main(String[] args) {
        Monstro j1 = new Monstro();
        j1.x = 10;
        j1.y = 10;
        
        Heroi j2 = new Heroi();
        j2.x = 10;
        j2.y = 11 ;
        
        //j2.setPlayerAtribute("Vida");


        j1.atacar(j2);
        
        //j2.andar(Direcao.OESTE);

        j1.atacar(j2);

        System.out.println("vida j2->" + j2.vida);
        System.out.println("vida j1->" + j1.vida);

        j2.setPlayerAtribute("Vida");

        System.out.println("vida j2->" + j2.vida);
    }
}
