package JavaCompleto.lPOO.Jogo;

public class Jogador {

    int vida  = 100;
    int x = 10;
    int y = 20;

        boolean atacar(Jogador oponente){
            int deltaX =  Math.abs(x - oponente.x);
            int deltay =  Math.abs(y - oponente.y);

            if (deltaX == 0 && deltay == 1){
                oponente.vida -= 10;
                return true;
            }else if( deltaX == 1 && deltay == 0){
            oponente.vida -= 10;   
            return true;
            }else{
                return false;
            }
        
        }

        /**
         * @param direcao
        * @return
        */
        boolean andar(Direcao direcao){
            switch (direcao) {
                case NORTE:
                    y++;
                    break;

                case LESTE:
                    x++;
                    break;
                
                case SUL:
                    y--;
                
                case OESTE:
                    x--;
            
                default:
                return true;
                
        }
        return false;
    }
}
