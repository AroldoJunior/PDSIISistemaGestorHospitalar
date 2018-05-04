package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class ca_MenuFunc extends JFrame implements ActionListener{
    
    JTextPane areaInstrucao, areaInstrucao2, areaMenu, areaSombra1;
    JButton bCadastrar, bListar, bSituacao, bAlterar, bExcluir, bSair;
    
    public ca_MenuFunc(){
        
        Container c = this.getContentPane();
        c.setLayout(null);
        
        bCadastrar = new JButton();
        bCadastrar.setText("Cadastrar");
        bCadastrar.setBounds(91, 54, 200, 40);
        bCadastrar.setBackground(Color.decode("#FDF5E6"));
        bCadastrar.setBorder(new LineBorder(Color.BLACK));
        bCadastrar.addActionListener(this);
        bCadastrar.setFocusPainted(false);
        add(bCadastrar);
        
        bListar = new JButton();
        bListar.setText("Listar");
        bListar.setBounds(91, 114, 200, 40);
        bListar.setBackground(Color.decode("#FDF5E6"));
        bListar.setBorder(new LineBorder(Color.BLACK));
        bListar.addActionListener(this);
        bListar.setFocusPainted(false);
        add(bListar);
        
        bSituacao = new JButton();
        bSituacao.setText("Situção");
        bSituacao.setBounds(91, 174, 200, 40);
        bSituacao.setBackground(Color.decode("#FDF5E6"));
        bSituacao.setBorder(new LineBorder(Color.BLACK));
        bSituacao.addActionListener(this);
        bSituacao.setFocusPainted(false);
        add(bSituacao);
        
        bAlterar = new JButton();
        bAlterar.setText("Alterar");
        bAlterar.setBounds(91, 234, 200, 40);
        bAlterar.setBackground(Color.decode("#FDF5E6"));
        bAlterar.setBorder(new LineBorder(Color.BLACK));
        bAlterar.addActionListener(this);
        bAlterar.setFocusPainted(false);
        add(bAlterar);
        
        bExcluir = new JButton();
        bExcluir.setText("Excluir");
        bExcluir.setBounds(91, 294, 200, 40);
        bExcluir.setBackground(Color.decode("#FDF5E6"));
        bExcluir.setBorder(new LineBorder(Color.BLACK));
        bExcluir.addActionListener(this);
        bExcluir.setFocusPainted(false);
        add(bExcluir);
        
        bSair = new JButton();
        bSair.setText("Sair");
        bSair.setForeground(Color.WHITE);
        bSair.setBounds(91, 380, 200, 40);
        bSair.setBackground(Color.decode("#FF6347"));
        bSair.setBorder(new LineBorder(Color.BLACK));
        bSair.setFocusPainted(false);
        bSair.addActionListener(this);
        add(bSair);
        
        areaMenu = new JTextPane();
        areaMenu.setBounds(50, 25, 283, 413);
        areaMenu.setBackground(Color.WHITE);
        areaMenu.setBorder(new LineBorder(Color.BLACK));
        areaMenu.setEditable(false);
        add(areaMenu);

        areaSombra1 = new JTextPane();
        areaSombra1.setBounds(55, 30, 283, 413);
        areaSombra1.setBackground(Color.GRAY);
        areaSombra1.setEditable(false);
        add(areaSombra1);
        
        areaInstrucao2 = new JTextPane();
        areaInstrucao2.setContentType( "text/html" );
        areaInstrucao2.setText("<br>\0\0<b>Necessaria autenticação do Func. Master</b><br><br>"
                + "\0<b>Alterar:</b> alterar dados de um determinado \0paciente cdastrado.<br><br>"
                + "\0<b>Excluir:</b> excluir dados de um determinado \0paciente cadastrado.<br><br>");
        areaInstrucao2.setBounds(400, 230, 382, 160);
        areaInstrucao2.setBackground(Color.WHITE);
        areaInstrucao2.setBorder(new LineBorder(Color.RED));
        areaInstrucao2.setEditable(false);
        add(areaInstrucao2);
        
        areaInstrucao = new JTextPane();
        areaInstrucao.setContentType( "text/html" );
        areaInstrucao.setText("<br><b>\0\0\0\0\0\0\0\0\0\0\0\0GUIA</b><br><br>"
                + "<b>\0Cadastrar:</b> onde atendente poderá dar entrada do \0paciente no sistema.<br><br>"
                + "<b>\0Listar:</b> serão listados todos os pacientes inseridos no \0sistema.<br><br>"
                + "<b>\0Situação:</b> Mostra o estado do paciente bem como \0sera possivel acessar de forma mais agil a ficha do \0paciente.<br><br>"
                + "<br><br><br><br><br><b><br><br><br><br><br>\0Sair:</b> volta a tela de loguin.<br><br>");
        areaInstrucao.setBounds(391, 10, 400, 443);
        areaInstrucao.setBackground(Color.WHITE);
        areaInstrucao.setBorder(new LineBorder(Color.BLACK));
        areaInstrucao.setEditable(false);
        add(areaInstrucao);
        
        setTitle("Menu Funcionario");
        setSize(800, 500);
        getContentPane().setBackground(Color.decode("#E0EEEE"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == bCadastrar){

             bc_CadastroFunc telacadastro = new bc_CadastroFunc();
             dispose();

        }
        if(e.getSource() == bListar){

             bd_ListarFunc telalista = new bd_ListarFunc();
             dispose();

        }
        if(e.getSource() == bSituacao){

             //bd_ListarFunc telalista = new bd_ListarFunc();
             //dispose();

        }
        
        if(e.getSource() == bAlterar){

              be_AlterarFunc telaaltera = new be_AlterarFunc();
             dispose();

        }
        if(e.getSource() == bExcluir){

             bf_ExcluirFunc telaexclui = new bf_ExcluirFunc();
             dispose();

        }
        
        if(e.getSource() == bSair){
            
            ac_LoginFunc telalogin = new ac_LoginFunc();
            dispose();
            
        }
        
    }
    
}
