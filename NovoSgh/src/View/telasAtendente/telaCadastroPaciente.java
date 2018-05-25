package View.telasAtendente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.border.LineBorder;

public final class telaCadastroPaciente implements ActionListener {

    JFrame frame;
    JPanel panel, panel1, panel1Sombra, panel2, panel2Sombra, panelMenu, panelMenuSombra, sombraBCadastrar, sombraBSair;
    JLabel nome, cpf, rg, plano, telefone, nascimento, descricao, cadastro;
    JTextField textNome, textCpf, textRg, textTelefone, textNascimento;
    JTextArea textDescricao;
    JScrollPane barraDescricao;
    JSeparator separadorNome, separadorCpf, separadorRg, separadorPlano, separadorTelefone, separadorNascimento, separadorPane1, separadorPane2, separadorBotao, separadorMenu, separadorCadastro;
    JButton bCadastrar, bSair;
    JComboBox planoComboBox;

    public telaCadastroPaciente() {

        gui();

    }

    public void gui() {

        cadastro = new JLabel("Cadastro");
        cadastro.setBounds(10, 10, 150, 20);
        cadastro.setFont(new Font("Urbandub", Font.PLAIN, 20));
        cadastro.setForeground(Color.BLACK);

        separadorCadastro = new JSeparator();
        separadorCadastro.setBounds(10, 34, 880, 1);
        separadorCadastro.setBorder(new LineBorder(Color.BLACK));

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

        plano = new JLabel("Plano de saude *");
        plano.setBounds(460, 10, 150, 20);
        plano.setFont(new Font("Urbandub", Font.PLAIN, 14));
        plano.setForeground(Color.BLACK);
        
        String[] opcoesCombo = {"Nenhum", "Para gravidas", "Para recem-nascidos", "Familiar", "Para idosos", "Coparticipação", "Appai", "Empresarial/Colaborador", "Aposentadoria por invalidez", "Universitário",};
        
        planoComboBox = new JComboBox(opcoesCombo);
        planoComboBox.setBounds(460, 28, 410, 20);
        planoComboBox.setFont(new Font("Urbandub", Font.PLAIN, 12));
        planoComboBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                plano.setFont(new Font("Urbandub", Font.BOLD, 15));
                plano.setForeground(Color.decode("#005c99"));
                separadorPlano.setBounds(460, 51, 410, 2);
                separadorPlano.setBorder(new LineBorder(Color.decode("#005c99")));

            }

            @Override
            public void focusLost(FocusEvent e) {

                plano.setFont(new Font("Urbandub", Font.PLAIN, 14));
                plano.setForeground(Color.BLACK);
                separadorPlano.setBounds(460, 51, 410, 1);
                separadorPlano.setBorder(new LineBorder(Color.BLACK));

            }

        });
        
        separadorPlano = new JSeparator();
        separadorPlano.setBounds(460, 51, 410, 1);
        separadorPlano.setBorder(new LineBorder(Color.BLACK));

        nascimento = new JLabel("Data de nascimento *");
        nascimento.setBounds(460, 80, 180, 20);
        nascimento.setFont(new Font("Urbandub", Font.PLAIN, 14));
        nascimento.setForeground(Color.BLACK);

        textNascimento = new JTextField();
        textNascimento.setBounds(460, 100, 410, 20);
        textNascimento.setBorder(new LineBorder(Color.WHITE));
        textNascimento.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textNascimento.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                nascimento.setFont(new Font("Urbandub", Font.BOLD, 15));
                textNascimento.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textNascimento.setCaretColor(Color.decode("#005c99"));
                nascimento.setForeground(Color.decode("#005c99"));
                separadorNascimento.setBounds(460, 121, 410, 2);
                separadorNascimento.setBorder(new LineBorder(Color.decode("#005c99")));

            }

            @Override
            public void focusLost(FocusEvent e) {

                nascimento.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textNascimento.setFont(new Font("Urbandub", Font.PLAIN, 12));
                textNascimento.setCaretColor(Color.BLACK);
                nascimento.setForeground(Color.BLACK);
                separadorNascimento.setBounds(460, 121, 410, 1);
                separadorNascimento.setBorder(new LineBorder(Color.BLACK));

            }

        });

        separadorNascimento = new JSeparator();
        separadorNascimento.setBounds(460, 121, 410, 1);
        separadorNascimento.setBorder(new LineBorder(Color.BLACK));

        telefone = new JLabel("Telefone");
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

        descricao = new JLabel("Descrição *");
        descricao.setBounds(10, 10, 100, 20);
        descricao.setFont(new Font("Urbandub", Font.PLAIN, 14));
        descricao.setForeground(Color.BLACK);
        
        textDescricao = new JTextArea();
        textDescricao.setBorder(new LineBorder(Color.WHITE));
        textDescricao.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textDescricao.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                descricao.setFont(new Font("Urbandub", Font.BOLD, 15));
                textDescricao.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textDescricao.setCaretColor(Color.decode("#005c99"));
                descricao.setForeground(Color.decode("#005c99"));
                barraDescricao.setBorder(new LineBorder(Color.decode("#005c99"), 2));                

            }

            @Override
            public void focusLost(FocusEvent e) {

                descricao.setFont(new Font("Urbandub", Font.PLAIN, 14));
                textDescricao.setFont(new Font("Urbandub", Font.PLAIN, 12));
                textDescricao.setCaretColor(Color.BLACK);
                descricao.setForeground(Color.BLACK);
                barraDescricao.setBorder(new LineBorder(Color.BLACK));

            }

        });
    
        
        barraDescricao = new JScrollPane(textDescricao);
        barraDescricao.setBounds(10, 30, 860, 100);
        barraDescricao.setBorder(new LineBorder(Color.BLACK));
        
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
        panel2.setLayout(null);

        separadorPane2 = new JSeparator();
        separadorPane2.setBounds(440, 10, 1, 118);
        separadorPane2.setBorder(new LineBorder(Color.BLACK));

        panel2Sombra = new JPanel();
        panel2Sombra.setBounds(12, 269, 876, 140);
        panel2Sombra.setBackground(Color.GRAY);

        separadorBotao = new JSeparator();
        separadorBotao.setBounds(10, 419, 880, 1);
        separadorBotao.setBorder(new LineBorder(Color.BLACK));

        bCadastrar = new JButton("Cadastrar");
        bCadastrar.setBounds(95, 20, 250, 50);
        bCadastrar.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bCadastrar.setFocusPainted(false);
        bCadastrar.setForeground(Color.WHITE);
        bCadastrar.setBackground(Color.decode("#40bf40"));
        bCadastrar.setBorder(new LineBorder(Color.BLACK));
        bCadastrar.addActionListener(this);
        bCadastrar.addMouseListener(new MouseListener() {
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
                bCadastrar.setBounds(95, 20, 250, 50);
                sombraBCadastrar.setBounds(95, 20, 250, 52);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bCadastrar.setBounds(92, 17, 255, 56);
                sombraBCadastrar.setBounds(96, 20, 247, 56);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        sombraBCadastrar = new JPanel();
        sombraBCadastrar.setBackground(Color.GRAY);
        sombraBCadastrar.setBounds(95, 20, 250, 52);

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
        panel.setBackground(Color.decode("#c6ecd9"));
        panel.setLayout(null);

        panel.add(cadastro);
        panel.add(separadorCadastro);

        panel1.add(nome);
        panel1.add(textNome);
        panel1.add(separadorNome);

        panel1.add(cpf);
        panel1.add(textCpf);
        panel1.add(separadorCpf);

        panel1.add(rg);
        panel1.add(textRg);
        panel1.add(separadorRg);

        panel1.add(plano);
        panel1.add(planoComboBox);
        panel1.add(separadorPlano);

        panel1.add(nascimento);
        panel1.add(textNascimento);
        panel1.add(separadorNascimento);

        panel1.add(separadorPane1);
        panel1.add(telefone);
        panel1.add(textTelefone);
        panel1.add(separadorTelefone);

        //panel2.add(separadorPane2);
        panel2.add(descricao);
        panel2.add(barraDescricao);
      
        
        panel.add(panel1);
        panel.add(panel1Sombra);

        panel.add(panel2);
        panel.add(panel2Sombra);

        panel.add(separadorBotao);

        panelMenu.add(separadorMenu);
        panelMenu.add(bCadastrar);
        panelMenu.add(sombraBCadastrar);
        panelMenu.add(bSair);
        panelMenu.add(sombraBSair);

        panel.add(panelMenu);
        panel.add(panelMenuSombra);

        frame = new JFrame();
        frame.setTitle("Cadastro - Paciente");
        frame.setSize(900, 559);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
   
    }
    
     // Blindagens (Testes) //
  
    public static void main(String args[]) {

        telaCadastroPaciente telaCadastroPaciente = new telaCadastroPaciente();

    }

}