package View;

import Implementação.zc_EnviaDados_Banco_Funcionario;
import Implementação.zc_Funcionario;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class telaAlterarFunc extends JFrame implements ActionListener {

    zc_EnviaDados_Banco_Funcionario zz = new zc_EnviaDados_Banco_Funcionario();

    JLabel labelCodigo, labelInstrucao, labelNome, labelCpf, labelRg, labelCargo, labelSenha, labelEmail, labelNumCell;
    JTextPane pane1, sombraPane1, pane2, paneAux1, paneAux2, paneAux3, paneAux4;
    JTextField textCodigo, textNome, textCpf, textRg, textCargo, textSenha, textEmail, textNumbCell;
    JButton bVoltar, bConfirmar;

    int CodigoInt;

    public telaAlterarFunc() {

        Container c = this.getContentPane();
        c.setLayout(null);

        labelInstrucao = new JLabel();
        labelInstrucao.setText("Caso não queira alterar um campo, deixe-o como está!");
        labelInstrucao.setForeground(Color.red);
        labelInstrucao.setBounds(195, 70, 400, 20);
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
        add(textNome);

        textCpf = new JTextField();
        textCpf.setBounds(55, 151, 642, 21);
        textCpf.setBackground(Color.WHITE);
        textCpf.setBorder(new LineBorder(Color.WHITE));
        add(textCpf);

        textRg = new JTextField();
        textRg.setBounds(48, 191, 642, 21);
        textRg.setBackground(Color.WHITE);
        textRg.setBorder(new LineBorder(Color.WHITE));
        add(textRg);

        textCargo = new JTextField();
        textCargo.setBounds(72, 231, 642, 21);
        textCargo.setBackground(Color.WHITE);
        textCargo.setBorder(new LineBorder(Color.WHITE));
        add(textCargo);

        textSenha = new JTextField();
        textSenha.setBounds(74, 271, 642, 21);
        textSenha.setBackground(Color.WHITE);
        textSenha.setBorder(new LineBorder(Color.WHITE));
        add(textSenha);

        textEmail = new JTextField();
        textEmail.setBounds(66, 311, 642, 21);
        textEmail.setBackground(Color.WHITE);
        textEmail.setBorder(new LineBorder(Color.WHITE));
        add(textEmail);

        textNumbCell = new JTextField();
        textNumbCell.setBounds(55, 351, 642, 21);
        textNumbCell.setBackground(Color.WHITE);
        textNumbCell.setBorder(new LineBorder(Color.WHITE));
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
        bConfirmar.addActionListener(this);
        bConfirmar.setFocusPainted(false);
        add(bConfirmar);

        labelCodigo = new JLabel();
        labelCodigo.setText("Codigo:");
        labelCodigo.setBounds(20, 15, 150, 20);
        add(labelCodigo);

        textCodigo = new JTextField();
        textCodigo.setBounds(75, 16, 550, 20);
        textCodigo.setBackground(Color.WHITE);
        textCodigo.setBorder(new LineBorder(Color.WHITE));
        textCodigo.setEditable(false);
        add(textCodigo);

        pane1 = new JTextPane();
        pane1.setBounds(10, 10, 780, 32);
        pane1.setBackground(Color.WHITE);
        pane1.setBorder(new LineBorder(Color.BLACK));
        pane1.setEditable(false);
        add(pane1);

        sombraPane1 = new JTextPane();
        sombraPane1.setBounds(15, 15, 770, 32);
        sombraPane1.setBackground(Color.GRAY);
        sombraPane1.setEditable(false);
        add(sombraPane1);

        pane2 = new JTextPane();
        pane2.setBounds(10, 60, 780, 323);
        pane2.setBackground(Color.WHITE);
        pane2.setBorder(new LineBorder(Color.BLACK));
        pane2.setEditable(false);
        add(pane2);

        setTitle("Alterar Funcionario");
        setSize(800, 500);
        getContentPane().setBackground(Color.decode("#D1EEEE"));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == bVoltar) {
            dispose();

        }

        if (e.getSource() == bConfirmar) {

            if (textNome.getText().isEmpty() || textCargo.getText().isEmpty() || textSenha.getText().isEmpty() || textNumbCell.getText().isEmpty() || textEmail.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Existe um campo obrigatorio vazio!");
                requestFocus();

            } else {

                zc_Funcionario funcionario = new zc_Funcionario(
                        textNome.getText(),
                        Integer.parseInt(textCpf.getText()),
                        Integer.parseInt(textRg.getText()),
                        textCargo.getText(),
                        textSenha.getText(),
                        textEmail.getText(),
                        textNumbCell.getText()
                );

                if (zz.Alterar(funcionario, CodigoInt) == true) {

                    textNome.setText("");
                    //textCpf.setText(zz.BuscarCpf(CodigoInt));
                    //textRg.setText(zz.BuscarRg(CodigoInt));
                    textCargo.setText("");
                    textSenha.setText("");
                    textNumbCell.setText("");
                    textEmail.setText("");

                    textCodigo.setText("");

                    JOptionPane.showMessageDialog(null, "Funcionario alterado com sucesso!");

                } else {

                    JOptionPane.showMessageDialog(null, "Erro ao alterar funcionario!");

                }

            }

        }

    }

    public static void main(String[] args) {
        new telaAlterarFunc();
    }

}
