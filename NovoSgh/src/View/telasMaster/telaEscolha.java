package View.telasMaster;

import View.telasAtendente.telaLoginAtendente;
import View.telasAtendente.telaPrincipalAtendente;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.border.LineBorder;

public final class telaEscolha implements ActionListener {

    JFrame frame;
    JPanel panel, panelSBMaster, panelSBAtendente;
    JSeparator separador;
    JButton bMaster, bAtendente;

    public telaEscolha() {
        gui();

    }

    public void gui() {

        bMaster = new JButton("ÁREA DO GERENTE");
        bMaster.setBounds(10, 10, 380, 445);
        bMaster.setFont(new Font("Century Gothic", Font.BOLD, 20));
        bMaster.setFocusPainted(false);
        bMaster.setBackground(Color.decode("#005c99"));
        bMaster.setForeground(Color.WHITE);
        bMaster.setBorder(new LineBorder(Color.BLACK));
        bMaster.addActionListener(this);
        bMaster.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                bMaster.setBounds(10, 10, 380, 445);
                panelSBMaster.setBounds(10, 10, 380, 446);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bMaster.setBounds(7, 7, 385, 451);
                panelSBMaster.setBounds(11, 10, 377, 451);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        bAtendente = new JButton("ÁREA DO ATENDENTE");
        bAtendente.setBounds(411, 10, 379, 445);
        bAtendente.setFont(new Font("Century Gothic", Font.BOLD, 20));
        bAtendente.setFocusPainted(false);
        bAtendente.setBackground(Color.decode("#206040"));
        bAtendente.setForeground(Color.WHITE);
        bAtendente.setBorder(new LineBorder(Color.BLACK));
        bAtendente.addActionListener(this);
        bAtendente.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                bAtendente.setBounds(411, 10, 379, 445);
                panelSBAtendente.setBounds(411, 10, 379, 446);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bAtendente.setBounds(409, 7, 384, 451);
                panelSBAtendente.setBounds(412, 10, 376, 451);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        panelSBMaster = new JPanel();
        panelSBMaster.setBounds(10, 10, 380, 446);
        panelSBMaster.setBackground(Color.GRAY);
        panelSBMaster.setBorder(new LineBorder(Color.BLACK));

        panelSBAtendente = new JPanel();
        panelSBAtendente.setBounds(411, 10, 379, 446);
        panelSBAtendente.setBackground(Color.GRAY);
        panelSBAtendente.setBorder(new LineBorder(Color.BLACK));

        separador = new JSeparator();
        separador.setBounds(400, 10, 1, 445);
        separador.setBorder(new LineBorder(Color.BLACK));

        panel = new JPanel();
        panel.setBackground(Color.decode("#f0f5f5"));
        panel.setLayout(null);

        panel.add(separador);
        panel.add(bMaster);
        panel.add(bAtendente);
        panel.add(panelSBMaster);
        panel.add(panelSBAtendente);

        frame = new JFrame();
        frame.setTitle("Inicio");
        frame.setSize(800, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bAtendente) {

            telaLoginAtendente telaLoginMaster = new telaLoginAtendente();
            frame.dispose();

        }

        if (e.getSource() == bMaster) {

            telaLoginMaster telaLoginMaster = new telaLoginMaster();
            frame.dispose();
        }

    }

    public static void main(String args[]) {

        telaEscolha telaescolha = new telaEscolha();

    }

}
