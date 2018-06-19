package View.telasAtendente;

import Controller.inserePessoa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.border.LineBorder;

public final class telaExcluirPaciente implements ActionListener {

    JFrame frame;
    JPanel panel, panel1, panel1Sombra, panel2, panel2Sombra, panelMenu, panelMenuSombra, sombraBExcluir, sombraBSair;
    JLabel nome, cpf, rg, plano, telefone, nascimento, senha, confirmarSenha, excluir;
    JTextField textNome, textCpf, textRg, textPlano, textTelefone, textNascimento;
    JPasswordField textSenha, textConfirmarSenha;
    JSeparator separadorNome, separadorCpf, separadorRg, separadorPlano, separadorTelefone, separadorSenha, separadorConfirmarSenha, separadorNascimento, separadorPane1, separadorPane2, separadorBotao, separadorMenu, separadorExcluir;
    JButton bExcluir, bSair;
    private String CodigoTabela;

    public void SetCodigoTabela(String CodigoTabela) {
        this.CodigoTabela = CodigoTabela;

    }
    // Metodos Get's

    public String getCodigoTabela() {
        return CodigoTabela;

    }

    public telaExcluirPaciente() {

        gui();

    }

    public void gui() {

        excluir = new JLabel("Excluir");
        excluir.setBounds(10, 10, 150, 20);
        excluir.setFont(new Font("Urbandub", Font.BOLD, 20));
        excluir.setForeground(Color.BLACK);

        separadorExcluir = new JSeparator();
        separadorExcluir.setBounds(10, 34, 880, 1);
        separadorExcluir.setBorder(new LineBorder(Color.BLACK));

        nome = new JLabel("Nome");
        nome.setBounds(10, 10, 70, 20);
        nome.setFont(new Font("Urbandub", Font.BOLD, 14));
        nome.setForeground(Color.RED);

        textNome = new JTextField();
        textNome.setBounds(10, 30, 410, 20);
        textNome.setBorder(new LineBorder(Color.WHITE));
        textNome.setFont(new Font("Urbandub", Font.BOLD, 12));
        textNome.setBackground(Color.WHITE);
        textNome.setEditable(false);

        separadorNome = new JSeparator();
        separadorNome.setBounds(10, 51, 410, 1);
        separadorNome.setBorder(new LineBorder(Color.RED));

        cpf = new JLabel("CPF");
        cpf.setBounds(10, 80, 50, 20);
        cpf.setFont(new Font("Urbandub", Font.BOLD, 14));
        cpf.setForeground(Color.RED);

        textCpf = new JTextField();
        textCpf.setBounds(10, 100, 410, 20);
        textCpf.setBorder(new LineBorder(Color.WHITE));
        textCpf.setFont(new Font("Urbandub", Font.BOLD, 12));
        textCpf.setBackground(Color.WHITE);
        textCpf.setEditable(false);

        separadorCpf = new JSeparator();
        separadorCpf.setBounds(10, 121, 410, 1);
        separadorCpf.setBorder(new LineBorder(Color.RED));

        rg = new JLabel("RG");
        rg.setBounds(10, 150, 50, 20);
        rg.setFont(new Font("Urbandub", Font.BOLD, 14));
        rg.setForeground(Color.RED);

        textRg = new JTextField();
        textRg.setBounds(10, 170, 410, 20);
        textRg.setBorder(new LineBorder(Color.WHITE));
        textRg.setFont(new Font("Urbandub", Font.BOLD, 12));
        textRg.setBackground(Color.WHITE);
        textRg.setEditable(false);

        separadorRg = new JSeparator();
        separadorRg.setBounds(10, 191, 410, 1);
        separadorRg.setBorder(new LineBorder(Color.RED));

        plano = new JLabel("Plano");
        plano.setBounds(460, 10, 70, 20);
        plano.setFont(new Font("Urbandub", Font.BOLD, 14));
        plano.setForeground(Color.RED);

        textPlano = new JTextField();
        textPlano.setBounds(460, 30, 410, 20);
        textPlano.setBorder(new LineBorder(Color.WHITE));
        textPlano.setFont(new Font("Urbandub", Font.BOLD, 12));
        textPlano.setBackground(Color.WHITE);
        textPlano.setEditable(false);

        separadorPlano = new JSeparator();
        separadorPlano.setBounds(460, 51, 410, 1);
        separadorPlano.setBorder(new LineBorder(Color.RED));

        nascimento = new JLabel("Data de nascimento");
        nascimento.setBounds(460, 80, 200, 20);
        nascimento.setFont(new Font("Urbandub", Font.BOLD, 14));
        nascimento.setForeground(Color.RED);

        textNascimento = new JTextField();
        textNascimento.setBounds(460, 100, 410, 20);
        textNascimento.setBorder(new LineBorder(Color.WHITE));
        textNascimento.setFont(new Font("Urbandub", Font.BOLD, 12));
        textNascimento.setBackground(Color.WHITE);
        textNascimento.setEditable(false);

        separadorNascimento = new JSeparator();
        separadorNascimento.setBounds(460, 121, 410, 1);
        separadorNascimento.setBorder(new LineBorder(Color.RED));

        telefone = new JLabel("Telefone");
        telefone.setBounds(460, 150, 100, 20);
        telefone.setFont(new Font("Urbandub", Font.BOLD, 14));
        telefone.setForeground(Color.RED);

        textTelefone = new JTextField();
        textTelefone.setBounds(460, 170, 410, 20);
        textTelefone.setBorder(new LineBorder(Color.WHITE));
        textTelefone.setFont(new Font("Urbandub", Font.BOLD, 12));
        textTelefone.setBackground(Color.WHITE);
        textTelefone.setEditable(false);

        separadorTelefone = new JSeparator();
        separadorTelefone.setBounds(460, 191, 410, 1);
        separadorTelefone.setBorder(new LineBorder(Color.RED));

        senha = new JLabel("Senha");
        senha.setBounds(10, 10, 70, 20);
        senha.setFont(new Font("Urbandub", Font.BOLD, 14));
        senha.setForeground(Color.BLACK);

        textSenha = new JPasswordField();
        textSenha.setBounds(10, 30, 410, 20);
        textSenha.setBorder(new LineBorder(Color.WHITE));
        textSenha.setFont(new Font("Urbandub", Font.PLAIN, 12));

        separadorSenha = new JSeparator();
        separadorSenha.setBounds(10, 51, 410, 1);
        separadorSenha.setBorder(new LineBorder(Color.BLACK));

        confirmarSenha = new JLabel("Confirmar senha");
        confirmarSenha.setBounds(10, 80, 150, 20);
        confirmarSenha.setFont(new Font("Urbandub", Font.PLAIN, 14));
        confirmarSenha.setForeground(Color.BLACK);

        textConfirmarSenha = new JPasswordField();
        textConfirmarSenha.setBounds(10, 100, 410, 20);
        textConfirmarSenha.setBorder(new LineBorder(Color.WHITE));
        textConfirmarSenha.setFont(new Font("Urbandub", Font.BOLD, 12));

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
        panel.setBackground(Color.decode("#c6ecd9"));
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

        panel1.add(plano);
        panel1.add(textPlano);
        panel1.add(separadorPlano);

        panel1.add(nascimento);
        panel1.add(textNascimento);
        panel1.add(separadorNascimento);

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
        frame.setTitle("Excluir - Paciente");
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

            inserePessoa exclui = new inserePessoa();

            int CodigoInt = Integer.parseInt(getCodigoTabela());

            if (exclui.Deletar(CodigoInt) == true) {

                textNome.setText("");
                textCpf.setText("");
                textRg.setText("");
                textPlano.setText("");
                textTelefone.setText("");
                textNascimento.setText("");

                JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso!");

                frame.dispose();

            } else {

                JOptionPane.showMessageDialog(null, "Erro ao excluir funcionario!");

            }

        }

        if (e.getSource() == bSair) {
            frame.dispose();
        }

    }

    public static void main(String args[]) {

        telaExcluirPaciente telaExcluirPaciente = new telaExcluirPaciente();

    }

}
