package sghospitalar;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class bd_ListarFunc extends JFrame implements ActionListener{
    
    JLabel labelBuscar;
    JTextPane pane1, sombraPane1;
    JTextField textBuscar;
    JTable tableLista;
    JButton bBuscar, bVoltar;
    
    public bd_ListarFunc(){
        
        Container c = this.getContentPane();
        c.setLayout(null);
        
        bBuscar = new JButton();
        bBuscar.setText("Buscar");
        bBuscar.setBounds(650, 10, 130, 35);
        bBuscar.setBackground(Color.decode("#FDF5E6"));
        bBuscar.setBorder(new LineBorder(Color.BLACK));
        bBuscar.setFocusPainted(false);
        add(bBuscar);
        
        bVoltar = new JButton();
        bVoltar.setText("Voltar");
        bVoltar.setForeground(Color.WHITE);
        bVoltar.setBounds(280, 404, 220, 45);
        bVoltar.setBackground(Color.decode("#FF6347"));
        bVoltar.setBorder(new LineBorder(Color.BLACK));
        bVoltar.setFocusPainted(false);
        bVoltar.addActionListener(this);
        add(bVoltar);
        
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
        
        tableLista = new JTable();
        tableLista.setBounds(10, 60, 780, 330);
        tableLista.setBackground(Color.WHITE);
        tableLista.setBorder(new LineBorder(Color.BLACK));
        add(tableLista);
        
        setTitle("Listar Funcionarios");
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
