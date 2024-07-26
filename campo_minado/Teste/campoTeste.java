package Teste;


import static org.junit.Assume.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import excecao.ExplosaoException;
import modelo.Campo;

public class campoTeste {
    
    private Campo campo = new Campo(3, 3);


    @Test
    public void testeVizinhoDistancia1Direita(){
        Campo vizinhoDireita = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinho(vizinhoDireita);
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoDistancia1Esquerda(){
        Campo vizinhoEsquerda = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinhoEsquerda);
        assertTrue(resultado);

    }

    @Test
    public void testeVizinhoDistancia1Cima(){
        Campo vizinhoCima = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinhoCima);
        assertTrue(resultado);

    }

    @Test
    public void testeVizinhoDistancia1Abaixo(){
        Campo vizinhoBaixo = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinhoBaixo);
        assertTrue(resultado);

    }

    @Test
    public void testeVizinhoDistancia2(){
        Campo vizinhoBaixo = new Campo(2, 2);
        boolean resultado = campo.adicionarVizinho(vizinhoBaixo);
        assertTrue(resultado);
    }

    @Test
    public void vizinhoTesteNaoVizinho(){
        Campo vizinhoBaixo = new Campo(1,1);
        boolean resultado = campo.adicionarVizinho(vizinhoBaixo);
        assertFalse(resultado);
    }

    @Test
    public void testelAlternarMarcacao(){
        campo.alternarMarcado();
        assumeTrue(campo.isMarcado());
    }

    @Test
    public void testeValorPadraoAtributoMarcacao(){
        assumeFalse(campo.isMarcado());
    }

    @Test
    public void testeAlternarMarcacaoDuasChamadas(){
        campo.alternarMarcado();
        campo.alternarMarcado();
        assumeFalse(campo.isMarcado());
    }

    @Test
    public void testeAbriNaoMinadoNaoMarcado(){
       assumeTrue(campo.abrir());
    }

    @Test
    public void testeNaoMinadoMarcado(){
        campo.alternarMarcado();
       assertFalse(campo.abrir());
    }

   @Test
   public void testeMinadoMarcado(){
    campo.alternarMarcado();
    campo.minar();
    assertFalse(campo.abrir());
   }

   @Test
   public void testeMinadoNaoMarcado(){
        campo.minar();

        assertThrows(ExplosaoException.class, ( ) -> {
            assertFalse(campo.abrir());
        } );
   }

   @Test
   public void testeAbrirVizinho1(){
        Campo campo11 = new Campo(1,1);
        Campo campo22 = new Campo(2, 2);
        

        campo22.adicionarVizinho(campo11);

        campo.adicionarVizinho(campo22);
        campo.abrir();

        assertTrue(campo11.isAberto() && campo22.isAberto());
   }

   public void testeAbrirVizinho2(){
    Campo campo11 = new Campo(1,1);
    Campo campo12 = new Campo(1,2);
    campo12.minar();

    Campo campo22 = new Campo(2, 2);
    

    campo22.adicionarVizinho(campo11);
    campo22.adicionarVizinho(campo12);

    campo.adicionarVizinho(campo22);
    campo.abrir();

    assertTrue(campo11.isFechado() && campo22.isAberto());
    }

    @Test
    public void testeFechadoVizinho(){
        if(campo.isFechado()){
            assertTrue(campo.vizinhancaSegura() && campo.isFechado());
        }else{
            assertFalse(!campo.vizinhancaSegura() && campo.isFechado());
        }
    }
    
}
