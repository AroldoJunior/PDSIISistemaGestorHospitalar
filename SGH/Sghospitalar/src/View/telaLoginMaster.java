package View;

import BancoDeDados.zc_Banco_de_Dados;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.sql.SQLException;

public class telaLoginMaster extends JFrame implements ActionListener {

    zc_Banco_de_Dados bd = new zc_Banco_de_Dados();

    JLabel labelLogin, labelSenha, labelLogo, labelEntrar;
    JTextField textLogin, textSenha;
    JTextPane areaLogin, areaSombra;
    JButton bEntrar, bMaster;

    // Construtor //
    
    public telaLoginMaster() {

        ImageIcon icon = new ImageIcon("sghLogin.png");
        //ImageIcon icon2 = new ImageIcon("sghLogin.png");

        icon.setImage(icon.getImage().getScaledInstance(500, 450, 100));
        //icon2.setImage(icon2.getImage().getScaledInstance(300, 150, 80));

        Container c = this.getContentPane();
        c.setLayout(null);

        labelLogo = new JLabel(icon);
        labelLogo.setBounds(343, 20, 458, 430);
        add(labelLogo);

        //labelEntrar = new JLabel(icon2);
        //labelEntrar.setBounds(27, 0, 300, 300);
        //add(labelEntrar);
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
        bMaster.setText("<-");
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

    // Função que executa o login //
    
    public boolean login(String login, String senha) throws SQLException {

        boolean certo = false;

        bd.connection();
        bd.executaSQL("SELECT * FROM Mogin");

        if (bd.rs.first()) {

            String s = bd.rs.getString("senha");
            String l = bd.rs.getString("usuario");

            if (login.equals(s) && senha.equals(l)) {

                certo = true;

            } else {

            }
        }

        return certo;
    }
    
    // Blindagens (Testes) //
    
    public boolean loginEmBranco(String login){
       
        boolean resposta = false;
        
        if(login.isEmpty())
            resposta = true;
       
        return resposta;
        
    }
    
    public boolean senhaEmBranco(String senha){
       
        boolean resposta = false;
        
        if(senha.isEmpty())
            resposta = true;
       
        return resposta;
        
    }
    
    public boolean loginNaoTemCaracteresEspeciais(String login){
	
        boolean resposta = false;
        
        if (login.matches("[a-zA-Z_][a-zA-Z0-9_]*"))
            return true;
        
        return resposta;
        
    }
    
    public boolean senhaNaoTemCaracteresEspeciais(String senha){
	
        boolean resposta = false;
        
        if (senha.matches("[a-zA-Z_][a-zA-Z0-9_]*"))
            return true;
        
        return resposta;
        
    }
    
    public boolean loginSemEspaco(String login){
        
        boolean resposta = false;
        
        if (login.contains(" "))
	    resposta = true;

        return resposta;
            
    }
    
    public boolean senhaSemEspaco(String senha){
        
        boolean resposta = false;
        
        if (senha.contains(" "))
	    resposta = true;

        return resposta;
            
    }
    
    public boolean loginTamanho(String login){
        
        boolean valida = false;
        
        if (login.length() >= 6 && login.length() <=8 )
            valida = true;
        
        return valida;
        
    }
    
    public boolean senhaTamanho(String senha){
        
        boolean valida = false;
        
        if (senha.length() >= 6 && senha.length() <=8 )
            valida = true;
        
        return valida;
        
    }
    
    // Ações //
    
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean resposta = false;
        
        if (e.getSource() == bEntrar) {
            try {
                
                String usu = textLogin.getText();
                String sen = textSenha.getText();

                if (loginEmBranco(usu) == false)
                    if(loginEmBranco(sen) == false)
                        resposta = login(usu, sen);
                else
                    System.out.println("Ta errado");
                    
                if (resposta == true) {

                    telaPrincipalMaster telaprincipalmaster = new telaPrincipalMaster();
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Login não realizado!\n Confira o usuário e senha digitados.");
                    
                }
                
            } catch (SQLException ex) {
                System.out.println("Ocorreu erro ao conectar");
                
            }

        }

        if (e.getSource() == bMaster) {
            telaLoginFunc telamenufunc = new telaLoginFunc();
            dispose();

        }

    }

}
