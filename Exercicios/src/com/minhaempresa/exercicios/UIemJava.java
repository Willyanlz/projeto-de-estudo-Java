package com.minhaempresa.exercicios;
import javax.swing.*;
import java.awt.*;
public class UIemJava {

    public static class InterfaceSimples extends JFrame {

        private JButton btnOkay;

        public InterfaceSimples() {
            super("Teste de UI Java");

            // Cria o botão "okay"
            btnOkay = new JButton("OKAY");
            btnOkay.setBackground(Color.BLUE);

            // Define o layout da interface
            setLayout(new BorderLayout());

            // Adiciona o botão "okay" ao centro da tela
            add(btnOkay, BorderLayout.CENTER);

            // Configura o background da janela da interface para azul claro
            getContentPane().setBackground(new Color(222, 34, 34));

            // Configura a janela da interface
            setSize(350, 650);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);
        }

        public static void main(String[] args) {
            new InterfaceSimples();
        }
    }
}
