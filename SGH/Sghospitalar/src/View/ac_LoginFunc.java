package View;

import BancoDeDados.zc_Banco_de_Dados;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.sql.SQLException;

public class ac_LoginFunc extends JFrame implements ActionListener{
    
    zc_Banco_de_Dados bd = new zc_Banco_de_Dados();
 
    JLabel labelLogin, labelSenha, labelLogo, labelEntrar;
    JTextField textLogin, textSenha;
    JTextPane areaLogin,areaSombra;
    JButton bEntrar, bMaster;
    
    public ac_LoginFunc(){
        
        ImageIcon icon = new ImageIcon("sghLogo.png");
        ImageIcon icon2 = new ImageIcon("sghLogin.png");
        
        icon.setImage(icon.getImage().getScaledInstance(500, 450, 100));
        icon2.setImage(icon2.getImage().getScaledInstance(300, 150, 80));
        
        Container c = this.getContentPane();
        c.setLayout(null);
        
        labelLogo = new JLabel(icon);
        labelLogo.setBounds(343, 20, 458, 430);
        add(labelLogo);
        
        labelEntrar = new JLabel(icon2);
        labelEntrar.setBounds(27, 0, 300, 300);
        add(labelEntrar);
        
        labelLogin = new JLabel();
        labelLogin.setText("Login:");
        labelLogin.setBounds(20, 210, 50, 30);
        add(labelLogin);
        
        textLogin = new JTextField();
        textLogin.setBounds(20, 235, 314, 30);
        textLogin.setBorder(new LineBorder(Color.BLACK));
        add(textLogin);
        
        labelSenha = new JLabel();
        labelSenha.setText("Senha:");
        labelSenha.setBounds(20, 280, 50, 30);
        add(labelSenha);
        
        textSenha = new JTextField();
        textSenha.setBounds(20, 305, 314, 30);
        textSenha.setBorder(new LineBorder(Color.BLACK));
        add(textSenha);
        
        bEntrar = new JButton();
        bEntrar.setText("Entrar");
        bEntrar.setBounds(98, 372, 150, 45);
        bEntrar.setBackground(Color.decode("#00FF7F"));
        bEntrar.setBorder(new LineBorder(Color.BLACK));
        bEntrar.setFocusPainted(false);
        bEntrar.addActionListener(this);
        add(bEntrar);
        
        bMaster = new JButton();
        bMaster.setText("M");
        bMaster.setBounds(20, 20, 45, 45);
        bMaster.setBackground(Color.decode("#6495ED"));
        bMaster.setBorder(new LineBorder(Color.BLACK));
        bMaster.setFocusPainted(false);
        bMaster.addActionListener(this);
        add(bMaster);
        
        areaLogin = new JTextPane();
        areaLogin.setBounds(10, 10, 335, 443);
        areaLogin.setBackground(Color.decode("#D1EEEE"));
        areaLogin.setBorder(new LineBorder(Color.BLACK));
        areaLogin.setEditable(false);
        add(areaLogin);
        
        areaSombra = new JTextPane();
        areaSombra.setBounds(15, 15, 335, 443);
        areaSombra.setBackground(Color.GRAY);
        areaSombra.setEditable(false);
        add(areaSombra);
        
        setTitle("Login");
        setSize(800, 500);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
    }

     public boolean  login(String login, String senha) throws SQLException {
       
        boolean certo = false;
      
        bd.connection();
        bd.executaSQL("SELECT * FROM Login");
        
            if ( bd.rs.first()) {
                
                 String l = bd.rs.getString("usuario");
                 String s = bd.rs.getString("senha");
               
                
                    if(login.equals(l)&&senha.equals(s)){
                         
                        certo = true;
                        
                    }else{
                       
                    }
            }
          
        return certo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == bEntrar){
            
            try {
                
                String usu = textLogin.getText();
                String sen = textSenha.getText();
               
                boolean resposta = login(usu,sen);
                
                if (resposta == true) {
                  
                    ca_MenuFunc telamenu = new ca_MenuFunc();
                    dispose();
                    
                } else {
                    JOptionPane.showMessageDialog(rootPane, "login não realizado!\n Favor conferir o usuario e senha digitado!");
                }
            } catch (SQLException ex) {
                    System.out.println("Ocorreu erro ao conectar");
            }
            
        }
        
        if(e.getSource() == bMaster){
            
           /*ba_MenuMaster telamenumaster = new ba_MenuMaster();
            dispose();
            */
      
        final JFrame frame = new JFrame("JDialog Demo");
       
 
    
                        //LoginDialog loginDlg = new LoginDialog(frame);
                        //loginDlg.setVisible(true);
                        // if logon successfully
                       
 
       
    }
}
    
}
