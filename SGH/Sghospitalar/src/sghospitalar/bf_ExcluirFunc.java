package sghospitalar;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class bf_ExcluirFunc extends JFrame implements ActionListener{
    
    JLabel labelBuscar, labelInstrucao, labelNome, labelCpf, labelRg, labelCargo, labelSenha, labelEmail, labelNumCell;
    JTextPane pane1, sombraPane1, pane2, paneAux1, paneAux2, paneAux3, paneAux4;
    JTextField textBuscar, textNome, textCpf, textRg, textCargo, textSenha, textEmail, textNumbCell;
    JButton bBuscar, bVoltar, bConfirmar;
    
    public bf_ExcluirFunc(){
        
        Container c = this.getContentPane();
        c.setLayout(null);
        
        labelInstrucao = new JLabel();
        labelInstrucao.setText("Confira os dados para confirmar a exclusão!");
        labelInstrucao.setForeground(Color.red);
        labelInstrucao.setBounds(230, 70, 400, 20);
        add(labelInstrucao);
        
        labelNome = new JLabel();
        labelNome.setText("Nome completo:");
        labelNome.setBounds(20, 110, 150, 20);
        add(labelNome);
        
        labelCpf = new JLabel();
        labelCpf.setText("CPF:");
        labelCpf.setBounds(20, 150, 150, 20);
        add(labelCpf);
        
        labelRg = new JLabel();
        labelRg.setText("RG:");
        labelRg.setBounds(20, 190, 150, 20);
        add(labelRg);
        
        labelCargo = new JLabel();
        labelCargo.setText("Cargo:");
        labelCargo.setBounds(20, 230, 150, 20);
        add(labelCargo);
        
        labelSenha = new JLabel();
        labelSenha.setText("Senha:");
        labelSenha.setBounds(20, 270, 150, 20);
        add(labelSenha);
        
        labelEmail = new JLabel();
        labelEmail.setText("Email:");
        labelEmail.setBounds(20, 310, 150, 20);
        add(labelEmail);
        
        labelNumCell = new JLabel();
        labelNumCell.setText("Cell:");
        labelNumCell.setBounds(20, 350, 150, 20);
        add(labelNumCell);
        
        textNome = new JTextField();
        textNome.setBounds(139, 111, 642, 21);
        textNome.setBackground(Color.WHITE);
        textNome.setBorder(new LineBorder(Color.WHITE));
        textNome.setEditable(false);
        add(textNome);
        
        textCpf = new JTextField();
        textCpf.setBounds(55, 151, 642, 21);
        textCpf.setBackground(Color.WHITE);
        textCpf.setBorder(new LineBorder(Color.WHITE));
        textCpf.setEditable(false);
        add(textCpf);
        
        textRg = new JTextField();
        textRg.setBounds(48, 191, 642, 21);
        textRg.setBackground(Color.WHITE);
        textRg.setBorder(new LineBorder(Color.WHITE));
        textRg.setEditable(false);
        add(textRg);
        
        textCargo = new JTextField();
        textCargo.setBounds(72, 231, 642, 21);
        textCargo.setBackground(Color.WHITE);
        textCargo.setBorder(new LineBorder(Color.WHITE));
        textCargo.setEditable(false);
        add(textCargo);
        
        
        textSenha = new JTextField();
        textSenha.setBounds(74, 271, 642, 21);
        textSenha.setBackground(Color.WHITE);
        textSenha.setBorder(new LineBorder(Color.WHITE));
        textSenha.setEditable(false);
        add(textSenha);
        
        textEmail = new JTextField();
        textEmail.setBounds(66, 311, 642, 21);
        textEmail.setBackground(Color.WHITE);
        textEmail.setBorder(new LineBorder(Color.WHITE));
        textEmail.setEditable(false);
        add(textEmail);
        
        textNumbCell = new JTextField();
        textNumbCell.setBounds(55, 351, 642, 21);
        textNumbCell.setBackground(Color.WHITE);
        textNumbCell.setBorder(new LineBorder(Color.WHITE));
        textNumbCell.setEditable(false);
        add(textNumbCell);
        
        paneAux1 = new JTextPane();
        paneAux1.setBounds(10, 60, 780, 42);
        paneAux1.setBackground(Color.WHITE);
        paneAux1.setBorder(new LineBorder(Color.BLACK));
        paneAux1.setEditable(false);
        add(paneAux1);
        
        paneAux2 = new JTextPane();
        paneAux2.setBounds(10, 140, 780, 42);
        paneAux2.setBackground(Color.WHITE);
        paneAux2.setBorder(new LineBorder(Color.BLACK));
        paneAux2.setEditable(false);
        add(paneAux2);
            
        paneAux3 = new JTextPane();
        paneAux3.setBounds(10, 220, 780, 42);
        paneAux3.setBackground(Color.WHITE);
        paneAux3.setBorder(new LineBorder(Color.BLACK));
        paneAux3.setEditable(false);
        add(paneAux3);
        
        paneAux4 = new JTextPane();
        paneAux4.setBounds(10, 300, 780, 42);
        paneAux4.setBackground(Color.WHITE);
        paneAux4.setBorder(new LineBorder(Color.BLACK));
        paneAux4.setEditable(false);
        add(paneAux4);
        
        bBuscar = new JButton();
        bBuscar.setText("Buscar");
        bBuscar.setBounds(650, 10, 130, 35);
        bBuscar.setBackground(Color.decode("#FDF5E6"));
        bBuscar.setBorder(new LineBorder(Color.BLACK));
        bBuscar.setFocusPainted(false);
        add(bBuscar);
        
        bVoltar = new JButton();
        bVoltar.setText("Cancelar");
        bVoltar.setForeground(Color.WHITE);
        bVoltar.setBounds(450, 401, 220, 45);
        bVoltar.setBackground(Color.decode("#FF6347"));
        bVoltar.setBorder(new LineBorder(Color.BLACK));
        bVoltar.setFocusPainted(false);
        bVoltar.addActionListener(this);
        add(bVoltar);
        
        bConfirmar = new JButton();
        bConfirmar.setText("Confirmar");
        bConfirmar.setBounds(116, 401, 220, 45);
        bConfirmar.setBackground(Color.decode("#00FF7F"));
        bConfirmar.setBorder(new LineBorder(Color.BLACK));
        bConfirmar.setFocusPainted(false);
        add(bConfirmar);
        
        labelBuscar = new JLabel();
        labelBuscar.setText("Buscar:");
        labelBuscar.setBounds(20, 15, 150, 20);
        add(labelBuscar);
        
        textBuscar = new JTextField();
        textBuscar.setBounds(75, 16, 550, 20);
        textBuscar.setBackground(Color.WHITE);
        textBuscar.setBorder(new LineBorder(Color.WHITE));
        add(textBuscar);
        
        pane1 = new JTextPane();
        pane1.setBounds(10, 10, 623, 32);
        pane1.setBackground(Color.WHITE);
        pane1.setBorder(new LineBorder(Color.BLACK));
        pane1.setEditable(false);
        add(pane1);
        
        sombraPane1 = new JTextPane();
        sombraPane1.setBounds(15, 15, 623, 32);
        sombraPane1.setBackground(Color.GRAY);
        sombraPane1.setEditable(false);
        add(sombraPane1);
        
        pane2 = new JTextPane();
        pane2.setBounds(10, 60, 780, 323);
        pane2.setBackground(Color.WHITE);
        pane2.setBorder(new LineBorder(Color.BLACK));
        pane2.setEditable(false);
        add(pane2);
        
        setTitle("Excluir Funcionario");
        setSize(800, 500);
        getContentPane().setBackground(Color.decode("#D1EEEE"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bVoltar){
            ba_MenuMaster telamenumaster = new ba_MenuMaster();
            dispose();
            
        }
        
    }
    
}
