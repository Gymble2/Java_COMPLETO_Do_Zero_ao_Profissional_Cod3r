package visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;


public class Botao extends JButton{

    public Botao(String label,Color cor){
        setText(label);
        setFont(new Font("courier" , Font.PLAIN, 18));

        setOpaque(true);
        setBackground(cor);
        setForeground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
