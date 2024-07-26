package visao;



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo2.Memoria;
import modelo2.MemoriaObservador;

public class Display extends JPanel implements MemoriaObservador {

    private final  JLabel label;

    public Display(){

        Memoria.getInstancia().adicionarObeservador(this);

        setBackground(new Color(47,48,51));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.white);
        label.setFont(new Font("cartier" , Font.PLAIN, 23));

        

        setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 26));

        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
      label.setText(novoValor);
    }
}
