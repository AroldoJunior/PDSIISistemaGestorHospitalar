package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.border.LineBorder;

public final class telaAlterarFuncionario implements ActionListener {

    JFrame frame;
    JPanel panel, panel1, panel1Sombra, panel2, panel2Sombra, panel3, panelMenu, panelMenuSombra, sombraBAlterar, sombraBSair, sombraBMudarSenha;
    JLabel nome, cpf, rg, cargo, telefone, email, senha, confirmarSenha, alterar;
    JTextField textNome, textCpf, textRg, textCargo, textTelefone, textEmail;
    JPasswordField textSenha, textConfirmarSenha;
    JSeparator separadorNome, separadorCpf, separadorRg, separadorCargo, separadorTelefone, separadorSenha, separadorConfirmarSenha, separadorEmail, separadorPane1, separadorPane2, separadorBotao, separadorMenu, separadorAlterar;
    JButton bAlterar, bSair, bMudarSenha;

    public telaAlterarFuncionario() {

        gui();

    }

    public void gui() {

        alterar = new JLabel("Alterar dados");
        alterar.setBounds(10, 10, 150, 20);
        alterar.setFont(new Font("Urbandub", Font.PLAIN, 20));
        alterar.setForeground(Color.BLACK);

        separadorAlterar = new JSeparator();
        separadorAlterar.setBounds(10, 34, 880, 1);
        separadorAlterar.setBorder(new LineBorder(Color.BLACK));

        nome = new JLabel("Nome *");
        nome.setBounds(10, 10, 70, 20);
        nome.setFont(new Font("Urbandub", Font.PLAIN, 14));
        nome.setForeground(Color.BLACK);

        textNome = new JTextField();
        textNome.setBounds(10, 30, 410, 20);
        textNome.setBorder(new LineBorder(Color.WHITE));
        textNome.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textNome.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                nome.setFont(new Font("Urbandub", Font.BOLD, 15));
                textNome.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textNome.setCaretColor(Color.decode("#005c99"));
                nome.setForeground(Color.decode("#005c99"));
                separadorNome.setBounds(10, 51, 410, 2);
                separadorNome.setBorder(new LineBorder(Color.decode("#005c99")));

            }

            @Override
            public void focusLost(FocusEvent e) {

                nome.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textNome.setFont(new Font("Urbandub", Font.PLAIN, 12));
                textNome.setCaretColor(Color.BLACK);
                nome.setForeground(Color.BLACK);
                separadorNome.setBounds(10, 51, 410, 1);
                separadorNome.setBorder(new LineBorder(Color.BLACK));

            }

        });

        separadorNome = new JSeparator();
        separadorNome.setBounds(10, 51, 410, 1);
        separadorNome.setBorder(new LineBorder(Color.BLACK));

        cpf = new JLabel("CPF *");
        cpf.setBounds(10, 80, 50, 20);
        cpf.setFont(new Font("Urbandub", Font.PLAIN, 14));
        cpf.setForeground(Color.BLACK);

        textCpf = new JTextField();
        textCpf.setBounds(10, 100, 410, 20);
        textCpf.setBorder(new LineBorder(Color.WHITE));
        textCpf.setFont(new Font("Urbandub", Font.BOLD, 12));
        textCpf.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                cpf.setFont(new Font("Urbandub", Font.BOLD, 15));
                textCpf.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textCpf.setCaretColor(Color.decode("#005c99"));
                cpf.setForeground(Color.decode("#005c99"));
                separadorCpf.setBounds(10, 121, 410, 2);
                separadorCpf.setBorder(new LineBorder(Color.decode("#005c99")));

            }

            @Override
            public void focusLost(FocusEvent e) {

                cpf.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textCpf.setFont(new Font("Urbandub", Font.PLAIN, 12));
                textCpf.setCaretColor(Color.BLACK);
                cpf.setForeground(Color.BLACK);
                separadorCpf.setBounds(10, 121, 410, 1);
                separadorCpf.setBorder(new LineBorder(Color.BLACK));

            }

        });

        separadorCpf = new JSeparator();
        separadorCpf.setBounds(10, 121, 410, 1);
        separadorCpf.setBorder(new LineBorder(Color.BLACK));

        rg = new JLabel("RG *");
        rg.setBounds(10, 150, 50, 20);
        rg.setFont(new Font("Urbandub", Font.PLAIN, 14));
        rg.setForeground(Color.BLACK);

        textRg = new JTextField();
        textRg.setBounds(10, 170, 410, 20);
        textRg.setBorder(new LineBorder(Color.WHITE));
        textRg.setFont(new Font("Urbandub", Font.BOLD, 12));
        textRg.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                rg.setFont(new Font("Urbandub", Font.BOLD, 15));
                textRg.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textRg.setCaretColor(Color.decode("#005c99"));
                rg.setForeground(Color.decode("#005c99"));
                separadorRg.setBounds(10, 191, 410, 2);
                separadorRg.setBorder(new LineBorder(Color.decode("#005c99")));

            }

            @Override
            public void focusLost(FocusEvent e) {

                rg.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textRg.setFont(new Font("Urbandub", Font.PLAIN, 12));
                textRg.setCaretColor(Color.BLACK);
                rg.setForeground(Color.BLACK);
                separadorRg.setBounds(10, 191, 410, 1);
                separadorRg.setBorder(new LineBorder(Color.BLACK));

            }

        });

        separadorRg = new JSeparator();
        separadorRg.setBounds(10, 191, 410, 1);
        separadorRg.setBorder(new LineBorder(Color.BLACK));

        cargo = new JLabel("Cargo *");
        cargo.setBounds(460, 10, 70, 20);
        cargo.setFont(new Font("Urbandub", Font.PLAIN, 14));
        cargo.setForeground(Color.BLACK);

        textCargo = new JTextField();
        textCargo.setBounds(460, 30, 410, 20);
        textCargo.setBorder(new LineBorder(Color.WHITE));
        textCargo.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textCargo.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                cargo.setFont(new Font("Urbandub", Font.BOLD, 15));
                textCargo.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textCargo.setCaretColor(Color.decode("#005c99"));
                cargo.setForeground(Color.decode("#005c99"));
                separadorCargo.setBounds(460, 51, 410, 2);
                separadorCargo.setBorder(new LineBorder(Color.decode("#005c99")));

            }

            @Override
            public void focusLost(FocusEvent e) {

                cargo.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textCargo.setFont(new Font("Urbandub", Font.PLAIN, 12));
                textCargo.setCaretColor(Color.BLACK);
                cargo.setForeground(Color.BLACK);
                separadorCargo.setBounds(460, 51, 410, 1);
                separadorCargo.setBorder(new LineBorder(Color.BLACK));

            }

        });

        separadorCargo = new JSeparator();
        separadorCargo.setBounds(460, 51, 410, 1);
        separadorCargo.setBorder(new LineBorder(Color.BLACK));

        email = new JLabel("Email *");
        email.setBounds(460, 80, 70, 20);
        email.setFont(new Font("Urbandub", Font.PLAIN, 14));
        email.setForeground(Color.BLACK);

        textEmail = new JTextField();
        textEmail.setBounds(460, 100, 410, 20);
        textEmail.setBorder(new LineBorder(Color.WHITE));
        textEmail.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textEmail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                email.setFont(new Font("Urbandub", Font.BOLD, 15));
                textEmail.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textEmail.setCaretColor(Color.decode("#005c99"));
                email.setForeground(Color.decode("#005c99"));
                separadorEmail.setBounds(460, 121, 410, 2);
                separadorEmail.setBorder(new LineBorder(Color.decode("#005c99")));

            }

            @Override
            public void focusLost(FocusEvent e) {

                email.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textEmail.setFont(new Font("Urbandub", Font.PLAIN, 12));
                textEmail.setCaretColor(Color.BLACK);
                email.setForeground(Color.BLACK);
                separadorEmail.setBounds(460, 121, 410, 1);
                separadorEmail.setBorder(new LineBorder(Color.BLACK));

            }

        });

        separadorEmail = new JSeparator();
        separadorEmail.setBounds(460, 121, 410, 1);
        separadorEmail.setBorder(new LineBorder(Color.BLACK));

        telefone = new JLabel("Telefone *");
        telefone.setBounds(460, 150, 100, 20);
        telefone.setFont(new Font("Urbandub", Font.PLAIN, 14));
        telefone.setForeground(Color.BLACK);

        textTelefone = new JTextField();
        textTelefone.setBounds(460, 170, 410, 20);
        textTelefone.setBorder(new LineBorder(Color.WHITE));
        textTelefone.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textTelefone.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                telefone.setFont(new Font("Urbandub", Font.BOLD, 15));
                textTelefone.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textTelefone.setCaretColor(Color.decode("#005c99"));
                telefone.setForeground(Color.decode("#005c99"));
                separadorTelefone.setBounds(460, 191, 410, 2);
                separadorTelefone.setBorder(new LineBorder(Color.decode("#005c99")));

            }

            @Override
            public void focusLost(FocusEvent e) {

                telefone.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textTelefone.setFont(new Font("Urbandub", Font.PLAIN, 12));
                telefone.setForeground(Color.BLACK);
                separadorTelefone.setBounds(460, 191, 410, 1);
                separadorTelefone.setBorder(new LineBorder(Color.BLACK));

            }

        });

        separadorTelefone = new JSeparator();
        separadorTelefone.setBounds(460, 191, 410, 1);
        separadorTelefone.setBorder(new LineBorder(Color.BLACK));

        senha = new JLabel("Senha *");
        senha.setBounds(10, 10, 70, 20);
        senha.setFont(new Font("Urbandub", Font.PLAIN, 14));
        senha.setForeground(Color.BLACK);

        textSenha = new JPasswordField();
        textSenha.setBounds(10, 30, 410, 20);
        textSenha.setBorder(new LineBorder(Color.WHITE));
        textSenha.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textSenha.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                senha.setFont(new Font("Urbandub", Font.BOLD, 15));
                textSenha.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textSenha.setCaretColor(Color.decode("#005c99"));
                senha.setForeground(Color.decode("#005c99"));
                separadorSenha.setBounds(10, 51, 410, 2);
                separadorSenha.setBorder(new LineBorder(Color.decode("#005c99")));

            }

            @Override
            public void focusLost(FocusEvent e) {

                senha.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textSenha.setFont(new Font("Urbandub", Font.PLAIN, 12));
                textSenha.setCaretColor(Color.BLACK);
                senha.setForeground(Color.BLACK);
                separadorSenha.setBounds(10, 51, 410, 1);
                separadorSenha.setBorder(new LineBorder(Color.BLACK));

            }

        });

        separadorSenha = new JSeparator();
        separadorSenha.setBounds(10, 51, 410, 1);
        separadorSenha.setBorder(new LineBorder(Color.BLACK));

        confirmarSenha = new JLabel("Confirmar senha *");
        confirmarSenha.setBounds(10, 80, 150, 20);
        confirmarSenha.setFont(new Font("Urbandub", Font.PLAIN, 14));
        confirmarSenha.setForeground(Color.BLACK);

        textConfirmarSenha = new JPasswordField();
        textConfirmarSenha.setBounds(10, 100, 410, 20);
        textConfirmarSenha.setBorder(new LineBorder(Color.WHITE));
        textConfirmarSenha.setFont(new Font("Urbandub", Font.BOLD, 12));
        textConfirmarSenha.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                confirmarSenha.setFont(new Font("Urbandub", Font.BOLD, 15));
                textConfirmarSenha.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textConfirmarSenha.setCaretColor(Color.decode("#005c99"));
                confirmarSenha.setForeground(Color.decode("#005c99"));
                separadorConfirmarSenha.setBounds(10, 121, 410, 2);
                separadorConfirmarSenha.setBorder(new LineBorder(Color.decode("#005c99")));

            }

            @Override
            public void focusLost(FocusEvent e) {

                confirmarSenha.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textConfirmarSenha.setFont(new Font("Urbandub", Font.PLAIN, 12));
                textConfirmarSenha.setCaretColor(Color.BLACK);
                confirmarSenha.setForeground(Color.BLACK);
                separadorConfirmarSenha.setBounds(10, 121, 410, 1);
                separadorConfirmarSenha.setBorder(new LineBorder(Color.BLACK));

            }

        });

        separadorConfirmarSenha = new JSeparator();
        separadorConfirmarSenha.setBounds(10, 121, 410, 1);
        separadorConfirmarSenha.setBorder(new LineBorder(Color.BLACK));

        bMudarSenha = new JButton("Mudar senha");
        bMudarSenha.setBounds(315, 45, 250, 50);
        bMudarSenha.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bMudarSenha.setFocusPainted(false);
        bMudarSenha.setForeground(Color.WHITE);
        bMudarSenha.setBackground(Color.decode("#9999ff"));
        bMudarSenha.setBorder(new LineBorder(Color.BLACK));
        bMudarSenha.addActionListener(this);
        bMudarSenha.addMouseListener(new MouseListener() {
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
                bMudarSenha.setBounds(315, 45, 250, 50);
                sombraBMudarSenha.setBounds(315, 45, 250, 52);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bMudarSenha.setBounds(312, 42, 255, 56);
                sombraBMudarSenha.setBounds(316, 45, 247, 56);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        sombraBMudarSenha = new JPanel();
        sombraBMudarSenha.setBackground(Color.GRAY);
        sombraBMudarSenha.setBounds(315, 45, 250, 52);

        // PAINEIS //
        panel1 = new JPanel();
        panel1.setBounds(10, 49, 880, 207);
        panel1.setBorder(new LineBorder(Color.BLACK));
        panel1.setBackground(Color.WHITE);
        panel1.setLayout(null);

        separadorPane1 = new JSeparator();
        separadorPane1.setBounds(440, 10, 1, 187);
        separadorPane1.setBorder(new LineBorder(Color.BLACK));

        panel1Sombra = new JPanel();
        panel1Sombra.setBounds(12, 49, 876, 209);
        panel1Sombra.setBackground(Color.GRAY);

        panel2 = new JPanel();
        panel2.setBounds(10, 269, 880, 138);
        panel2.setBorder(new LineBorder(Color.BLACK));
        panel2.setBackground(Color.WHITE);
        panel2.setVisible(true);
        panel2.setLayout(null);

        panel3 = new JPanel();
        panel3.setBounds(10, 269, 880, 138);
        panel3.setBorder(new LineBorder(Color.BLACK));
        panel3.setBackground(Color.WHITE);
        panel3.setVisible(false);
        panel3.setLayout(null);

        separadorPane2 = new JSeparator();
        separadorPane2.setBounds(440, 10, 1, 118);
        separadorPane2.setBorder(new LineBorder(Color.BLACK));

        panel2Sombra = new JPanel();
        panel2Sombra.setBounds(12, 269, 876, 140);
        panel2Sombra.setBackground(Color.GRAY);

        separadorBotao = new JSeparator();
        separadorBotao.setBounds(10, 419, 880, 1);
        separadorBotao.setBorder(new LineBorder(Color.BLACK));

        bAlterar = new JButton("Alterar");
        bAlterar.setBounds(95, 20, 250, 50);
        bAlterar.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bAlterar.setFocusPainted(false);
        bAlterar.setForeground(Color.WHITE);
        bAlterar.setBackground(Color.decode("#40bf40"));
        bAlterar.setBorder(new LineBorder(Color.BLACK));
        bAlterar.addActionListener(this);
        bAlterar.addMouseListener(new MouseListener() {
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
                bAlterar.setBounds(95, 20, 250, 50);
                sombraBAlterar.setBounds(95, 20, 250, 52);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bAlterar.setBounds(92, 17, 255, 56);
                sombraBAlterar.setBounds(96, 20, 247, 56);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        sombraBAlterar = new JPanel();
        sombraBAlterar.setBackground(Color.GRAY);
        sombraBAlterar.setBounds(95, 20, 250, 52);

        bSair = new JButton("Sair");
        bSair.setBounds(550, 20, 250, 50);
        bSair.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bSair.setFocusPainted(false);
        bSair.setBackground(Color.decode("#ff0000"));
        bSair.setForeground(Color.WHITE);
        bSair.setBorder(new LineBorder(Color.BLACK));
        bSair.addActionListener(this);
        bSair.addMouseListener(new MouseListener() {
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
                bSair.setBounds(550, 20, 250, 50);
                sombraBSair.setBounds(549, 20, 250, 52);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bSair.setBounds(547, 17, 255, 56);
                sombraBSair.setBounds(551, 20, 247, 56);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        sombraBSair = new JPanel();
        sombraBSair.setBackground(Color.GRAY);
        sombraBSair.setBounds(549, 20, 250, 52);

        separadorMenu = new JSeparator();
        separadorMenu.setBounds(450, 10, 1, 70);
        separadorMenu.setBorder(new LineBorder(Color.BLACK));

        panelMenu = new JPanel();
        panelMenu.setBackground(Color.decode("#669999"));
        panelMenu.setBounds(0, 432, 900, 90);
        panelMenu.setLayout(null);
        panelMenu.setBorder(new LineBorder(Color.BLACK));

        panelMenuSombra = new JPanel();
        panelMenuSombra.setBackground(Color.LIGHT_GRAY);
        panelMenuSombra.setBounds(0, 429, 900, 90);

        panel = new JPanel();
        panel.setBackground(Color.decode("#d1e0e0"));
        panel.setLayout(null);

        panel.add(alterar);
        panel.add(separadorAlterar);

        panel1.add(nome);
        panel1.add(textNome);
        panel1.add(separadorNome);

        panel1.add(cpf);
        panel1.add(textCpf);
        panel1.add(separadorCpf);

        panel1.add(rg);
        panel1.add(textRg);
        panel1.add(separadorRg);

        panel1.add(cargo);
        panel1.add(textCargo);
        panel1.add(separadorCargo);

        panel1.add(email);
        panel1.add(textEmail);
        panel1.add(separadorEmail);

        panel1.add(separadorPane1);
        panel1.add(telefone);
        panel1.add(textTelefone);
        panel1.add(separadorTelefone);

        panel2.add(bMudarSenha);
        panel2.add(sombraBMudarSenha);

        //panel2.add(separadorPane2);
        panel3.add(senha);
        panel3.add(textSenha);
        panel3.add(separadorSenha);

        panel3.add(confirmarSenha);
        panel3.add(textConfirmarSenha);
        panel3.add(separadorConfirmarSenha);

        panel.add(panel1);
        panel.add(panel1Sombra);
        
        panel.add(panel3);
        
        panel.add(panel2);
        panel.add(panel2Sombra);
 
        panel.add(separadorBotao);

        panelMenu.add(separadorMenu);
        panelMenu.add(bAlterar);
        panelMenu.add(sombraBAlterar);
        panelMenu.add(bSair);
        panelMenu.add(sombraBSair);

        panel.add(panelMenu);
        panel.add(panelMenuSombra);

        frame = new JFrame();
        frame.setTitle("Alterar - Funcionário");
        frame.setSize(900, 559);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bMudarSenha) {
            panel2.setVisible(false);
            panel3.setVisible(true);

        }

        if (e.getSource() == bSair) {
            frame.dispose();
        }

    }

     public static void main(String args[]) {

        telaAlterarFuncionario telaAlterarFuncionario = new telaAlterarFuncionario();

    }
    
}
