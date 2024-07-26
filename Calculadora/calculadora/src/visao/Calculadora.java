package visao;

import java.awt.BorderLayout;
import java.awt.Dimension;


import javax.swing.JFrame;

public class Calculadora extends JFrame {

    public Calculadora(){

        organizarLayout();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(232,305);
        setLocationRelativeTo(null);
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());    

        Display  display = new Display();
        display.setPreferredSize(new Dimension(233, 60));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calculadora();
    }

}
