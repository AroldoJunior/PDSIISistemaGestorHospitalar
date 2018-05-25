package View.telasMaster;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.border.LineBorder;

public final class telaExcluirFuncionario implements ActionListener {

    JFrame frame;
    JPanel panel, panel1, panel1Sombra, panel2, panel2Sombra, panelMenu, panelMenuSombra, sombraBExcluir, sombraBSair;
    JLabel nome, cpf, rg, cargo, telefone, email, senha, confirmarSenha, excluir;
    JTextField textNome, textCpf, textRg, textCargo, textTelefone, textEmail;
    JPasswordField textSenha, textConfirmarSenha;
    JSeparator separadorNome, separadorCpf, separadorRg, separadorCargo, separadorTelefone, separadorSenha, separadorConfirmarSenha, separadorEmail, separadorPane1, separadorPane2, separadorBotao, separadorMenu, separadorExcluir;
    JButton bExcluir, bSair;

    public telaExcluirFuncionario() {

        gui();

    }

    public void gui() {

        excluir = new JLabel("Excluir");
        excluir.setBounds(10, 10, 150, 20);
        excluir.setFont(new Font("Urbandub", Font.BOLD, 20));
        excluir.setForeground(Color.RED);

        separadorExcluir = new JSeparator();
        separadorExcluir.setBounds(10, 34, 880, 1);
        separadorExcluir.setBorder(new LineBorder(Color.BLACK));

        nome = new JLabel("Nome ");
        nome.setBounds(10, 10, 70, 20);
        nome.setFont(new Font("Urbandub", Font.BOLD, 16));
        nome.setForeground(Color.RED);

        textNome = new JTextField();
        textNome.setBounds(10, 30, 410, 20);
        textNome.setBorder(new LineBorder(Color.WHITE));
        textNome.setFont(new Font("Urbandub", Font.BOLD, 12));
        textNome.setBackground(Color.WHITE);
        textNome.setEditable(false);

        separadorNome = new JSeparator();
        separadorNome.setBounds(10, 51, 410, 2);
        separadorNome.setBorder(new LineBorder(Color.RED));

        cpf = new JLabel("CPF ");
        cpf.setBounds(10, 80, 50, 20);
        cpf.setFont(new Font("Urbandub", Font.BOLD, 16));
        cpf.setForeground(Color.RED);

        textCpf = new JTextField();
        textCpf.setBounds(10, 100, 410, 20);
        textCpf.setBorder(new LineBorder(Color.WHITE));
        textCpf.setFont(new Font("Urbandub", Font.BOLD, 12));
        textCpf.setBackground(Color.WHITE);
        textCpf.setEditable(false);

        separadorCpf = new JSeparator();
        separadorCpf.setBounds(10, 121, 410, 2);
        separadorCpf.setBorder(new LineBorder(Color.RED));

        rg = new JLabel("RG ");
        rg.setBounds(10, 150, 50, 20);
        rg.setFont(new Font("Urbandub", Font.BOLD, 16));
        rg.setForeground(Color.RED);

        textRg = new JTextField();
        textRg.setBounds(10, 170, 410, 20);
        textRg.setBorder(new LineBorder(Color.WHITE));
        textRg.setFont(new Font("Urbandub", Font.BOLD, 12));
        textRg.setBackground(Color.WHITE);
        textRg.setEditable(false);

        separadorRg = new JSeparator();
        separadorRg.setBounds(10, 191, 410, 2);
        separadorRg.setBorder(new LineBorder(Color.RED));

        cargo = new JLabel("Cargo ");
        cargo.setBounds(460, 10, 70, 20);
        cargo.setFont(new Font("Urbandub", Font.BOLD, 16));
        cargo.setForeground(Color.RED);

        textCargo = new JTextField();
        textCargo.setBounds(460, 30, 410, 20);
        textCargo.setBorder(new LineBorder(Color.WHITE));
        textCargo.setFont(new Font("Urbandub", Font.BOLD, 12));
        textCargo.setBackground(Color.WHITE);
        textCargo.setEditable(false);

        separadorCargo = new JSeparator();
        separadorCargo.setBounds(460, 51, 410, 2);
        separadorCargo.setBorder(new LineBorder(Color.RED));

        email = new JLabel("Email ");
        email.setBounds(460, 80, 70, 20);
        email.setFont(new Font("Urbandub", Font.BOLD, 16));
        email.setForeground(Color.RED);

        textEmail = new JTextField();
        textEmail.setBounds(460, 100, 410, 20);
        textEmail.setBorder(new LineBorder(Color.WHITE));
        textEmail.setFont(new Font("Urbandub", Font.BOLD, 12));
        textEmail.setBackground(Color.WHITE);
        textEmail.setEditable(false);

        separadorEmail = new JSeparator();
        separadorEmail.setBounds(460, 121, 410, 2);
        separadorEmail.setBorder(new LineBorder(Color.RED));

        telefone = new JLabel("Telefone ");
        telefone.setBounds(460, 150, 100, 20);
        telefone.setFont(new Font("Urbandub", Font.BOLD, 16));
        telefone.setForeground(Color.RED);

        textTelefone = new JTextField();
        textTelefone.setBounds(460, 170, 410, 20);
        textTelefone.setBorder(new LineBorder(Color.WHITE));
        textTelefone.setFont(new Font("Urbandub", Font.BOLD, 12));
        textTelefone.setBackground(Color.WHITE);
        textTelefone.setEditable(false);
      
        separadorTelefone = new JSeparator();
        separadorTelefone.setBounds(460, 191, 410, 2);
        separadorTelefone.setBorder(new LineBorder(Color.RED));

        senha = new JLabel("Senha ");
        senha.setBounds(10, 10, 70, 20);
        senha.setFont(new Font("Urbandub", Font.BOLD, 14));
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

        separadorBotao = new JSeparator();
        separadorBotao.setBounds(10, 270, 880, 1);
        separadorBotao.setBorder(new LineBorder(Color.BLACK));

        bExcluir = new JButton("Excluir");
        bExcluir.setBounds(95, 20, 250, 50);
        bExcluir.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bExcluir.setFocusPainted(false);
        bExcluir.setForeground(Color.WHITE);
        bExcluir.setBackground(Color.decode("#ff0000"));
        bExcluir.setBorder(new LineBorder(Color.BLACK));
        bExcluir.addActionListener(this);
        bExcluir.addMouseListener(new MouseListener() {
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
                bExcluir.setBounds(95, 20, 250, 50);
                sombraBExcluir.setBounds(95, 20, 250, 52);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bExcluir.setBounds(92, 17, 255, 56);
                sombraBExcluir.setBounds(96, 20, 247, 56);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        sombraBExcluir = new JPanel();
        sombraBExcluir.setBackground(Color.GRAY);
        sombraBExcluir.setBounds(95, 20, 250, 52);

        bSair = new JButton("Sair");
        bSair.setBounds(550, 20, 250, 50);
        bSair.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bSair.setFocusPainted(false);
        bSair.setBackground(Color.WHITE);
        bSair.setForeground(Color.BLACK);
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
        panelMenu.setBounds(0, 285, 900, 90);
        panelMenu.setLayout(null);
        panelMenu.setBorder(new LineBorder(Color.BLACK));

        panelMenuSombra = new JPanel();
        panelMenuSombra.setBackground(Color.LIGHT_GRAY);
        panelMenuSombra.setBounds(0, 282, 900, 90);

        panel = new JPanel();
        panel.setBackground(Color.decode("#d1e0e0"));
        panel.setLayout(null);

        panel.add(excluir);
        panel.add(separadorExcluir);

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

        panel.add(panel1);
        panel.add(panel1Sombra);
        
        panel.add(separadorBotao);

        panelMenu.add(separadorMenu);
        panelMenu.add(bExcluir);
        panelMenu.add(sombraBExcluir);
        panelMenu.add(bSair);
        panelMenu.add(sombraBSair);

        panel.add(panelMenu);
        panel.add(panelMenuSombra);

        frame = new JFrame();
        frame.setTitle("Excluir - Funcionário");
        frame.setSize(900, 412);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bExcluir) {
            
        }
        
        if (e.getSource() == bSair) {
            frame.dispose();
        }
        
    }

    public static void main(String args[]) {

        telaExcluirFuncionario telaExcluirFuncionario = new telaExcluirFuncionario();

    }

}
