package Observador;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(400, 250);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null);

        JButton botao = new JButton("Clicar!!");

        janela.add(botao);

        botao.addActionListener(l -> {
            System.out.println("Evento Ocorreu!!");
        });

        janela.setVisible(true);
    }
}
