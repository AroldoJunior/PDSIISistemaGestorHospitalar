package View.telasAtendente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.border.LineBorder;

public final class telaSituacao implements ActionListener{

    private JFrame frame;
    private JPanel panel, panel1, panelSombra1, panel2, panelSombra2, panel3, panelSombra3, sombraBGerarFicha, sombraBVoltar;
    private JLabel dados, nome, cpf, rg, dataNasc, telefone, planoDeSaude, descricao;
    private JSeparator separadorDados, separadorNome, separadorCpf, separadorRg, separadorDataNasc, separadorTel, separadorPlano, separadorBotao;
    private JTextField textNome, textCpf, textRg, textDataNasc, textTel, textPlano;
    private JTextArea textDescricao;
    private JScrollPane barraDescricao;
    private JButton bGerarFicha, bVoltar;

    public telaSituacao() {

        gui();

    }

    public void gui() {

        dados = new JLabel("Dados");
        dados.setBounds(10, 10, 130, 20);
        dados.setFont(new Font("Urbandub", Font.PLAIN, 20));
        dados.setForeground(Color.BLACK);

        separadorDados = new JSeparator();
        separadorDados.setBounds(10, 34, 880, 1);
        separadorDados.setBorder(new LineBorder(Color.BLACK));

        nome = new JLabel("Nome: ");
        nome.setBounds(10, 10, 100, 20);
        nome.setFont(new Font("Urbandub", Font.PLAIN, 16));
        nome.setForeground(Color.BLACK);

        textNome = new JTextField();
        textNome.setBounds(65, 11, 530, 20);
        textNome.setBorder(new LineBorder(Color.WHITE));
        textNome.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textNome.setBackground(Color.WHITE);
        textNome.setEditable(false);

        separadorNome = new JSeparator();
        separadorNome.setBounds(10, 32, 580, 1);
        separadorNome.setBorder(new LineBorder(Color.BLACK));

        cpf = new JLabel("CPF: ");
        cpf.setBounds(10, 40, 100, 20);
        cpf.setFont(new Font("Urbandub", Font.PLAIN, 16));
        cpf.setForeground(Color.BLACK);

        textCpf = new JTextField();
        textCpf.setBounds(50, 41, 545, 20);
        textCpf.setBorder(new LineBorder(Color.WHITE));
        textCpf.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textCpf.setBackground(Color.WHITE);
        textCpf.setEditable(false);

        separadorCpf = new JSeparator();
        separadorCpf.setBounds(10, 62, 580, 1);
        separadorCpf.setBorder(new LineBorder(Color.BLACK));

        rg = new JLabel("RG: ");
        rg.setBounds(10, 70, 100, 20);
        rg.setFont(new Font("Urbandub", Font.PLAIN, 16));
        rg.setForeground(Color.BLACK);

        textRg = new JTextField();
        textRg.setBounds(40, 71, 555, 20);
        textRg.setBorder(new LineBorder(Color.WHITE));
        textRg.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textRg.setBackground(Color.WHITE);
        textRg.setEditable(false);

        separadorRg = new JSeparator();
        separadorRg.setBounds(10, 92, 580, 1);
        separadorRg.setBorder(new LineBorder(Color.BLACK));

        dataNasc = new JLabel("Data de Nascimento: ");
        dataNasc.setBounds(10, 100, 200, 20);
        dataNasc.setFont(new Font("Urbandub", Font.PLAIN, 16));
        dataNasc.setForeground(Color.BLACK);

        textDataNasc = new JTextField();
        textDataNasc.setBounds(175, 101, 420, 20);
        textDataNasc.setBorder(new LineBorder(Color.WHITE));
        textDataNasc.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textDataNasc.setBackground(Color.WHITE);
        textDataNasc.setEditable(false);

        separadorDataNasc = new JSeparator();
        separadorDataNasc.setBounds(10, 122, 580, 1);
        separadorDataNasc.setBorder(new LineBorder(Color.BLACK));

        telefone = new JLabel("Telefone: ");
        telefone.setBounds(10, 130, 200, 20);
        telefone.setFont(new Font("Urbandub", Font.PLAIN, 16));
        telefone.setForeground(Color.BLACK);

        textTel = new JTextField();
        textTel.setBounds(83, 131, 512, 20);
        textTel.setBorder(new LineBorder(Color.WHITE));
        textTel.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textTel.setBackground(Color.WHITE);
        textTel.setEditable(false);

        separadorTel = new JSeparator();
        separadorTel.setBounds(10, 152, 580, 1);
        separadorTel.setBorder(new LineBorder(Color.BLACK));

        planoDeSaude = new JLabel("Plano de Saude: ");
        planoDeSaude.setBounds(10, 160, 200, 20);
        planoDeSaude.setFont(new Font("Urbandub", Font.PLAIN, 16));
        planoDeSaude.setForeground(Color.BLACK);

        textPlano = new JTextField();
        textPlano.setBounds(138, 161, 457, 20);
        textPlano.setBorder(new LineBorder(Color.WHITE));
        textPlano.setFont(new Font("Urbandub", Font.PLAIN, 12));
        textPlano.setBackground(Color.WHITE);
        textPlano.setEditable(false);

        separadorPlano = new JSeparator();
        separadorPlano.setBounds(10, 182, 580, 1);
        separadorPlano.setBorder(new LineBorder(Color.BLACK));

        panel1 = new JPanel();
        panel1.setBounds(10, 49, 600, 190);
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(new LineBorder(Color.BLACK));
        panel1.setLayout(null);

        panel1.add(nome);
        panel1.add(textNome);
        panel1.add(separadorNome);

        panel1.add(cpf);
        panel1.add(textCpf);
        panel1.add(separadorCpf);

        panel1.add(rg);
        panel1.add(textRg);
        panel1.add(separadorRg);

        panel1.add(dataNasc);
        panel1.add(textDataNasc);
        panel1.add(separadorDataNasc);

        panel1.add(telefone);
        panel1.add(textTel);
        panel1.add(separadorTel);

        panel1.add(planoDeSaude);
        panel1.add(textPlano);
        panel1.add(separadorPlano);

        panelSombra1 = new JPanel();
        panelSombra1.setBounds(10, 49, 600, 192);
        panelSombra1.setBackground(Color.GRAY);
        
        descricao = new JLabel("Descrição");
        descricao.setBounds(10, 10, 100, 20);
        descricao.setFont(new Font("Urbandub", Font.PLAIN, 14));
        descricao.setForeground(Color.BLACK);
        
        textDescricao = new JTextArea();
        textDescricao.setBorder(new LineBorder(Color.WHITE));
        textDescricao.setFont(new Font("Urbandub", Font.PLAIN, 12));
        
        barraDescricao = new JScrollPane(textDescricao);
        barraDescricao.setBounds(10, 30, 580, 130);
        barraDescricao.setBorder(new LineBorder(Color.BLACK));
        
        panel2 = new JPanel();
        panel2.setBounds(10, 255, 600, 170);
        panel2.setBorder(new LineBorder(Color.BLACK));
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(null);
        
        panel2.add(descricao);
        panel2.add(barraDescricao);
        
        panelSombra2 = new JPanel();
        panelSombra2.setBounds(10, 255, 600, 172);
        panelSombra2.setBackground(Color.GRAY);
        
        bGerarFicha = new JButton("Gerar Ficha");
        bGerarFicha.setBounds(10, 70, 230, 50);
        bGerarFicha.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bGerarFicha.setFocusPainted(false);
        bGerarFicha.setForeground(Color.WHITE);
        bGerarFicha.setBackground(Color.decode("#40bf40"));
        bGerarFicha.setBorder(new LineBorder(Color.BLACK));
        bGerarFicha.addActionListener(this);
        bGerarFicha.addMouseListener(new MouseListener() {
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
                bGerarFicha.setBounds(10, 70, 230, 50);
                sombraBGerarFicha.setBounds(10, 70, 230, 52);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bGerarFicha.setBounds(7, 67, 235, 56);
                sombraBGerarFicha.setBounds(11, 70, 227, 56);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        sombraBGerarFicha = new JPanel();
        sombraBGerarFicha.setBackground(Color.GRAY);
        sombraBGerarFicha.setBounds(10, 70, 230, 52);
        
        panel3 = new JPanel();
        panel3.setBounds(630, 49, 250, 190);
        panel3.setBackground(Color.WHITE);
        panel3.setBorder(new LineBorder(Color.BLACK));
        panel3.setLayout(null);
        
        panel3.add(bGerarFicha);
        panel3.add(sombraBGerarFicha);
        
        panelSombra3 = new JPanel();
        panelSombra3.setBounds(630, 49, 250, 192);
        panelSombra3.setBackground(Color.GRAY);
        
        separadorBotao = new JSeparator();
        separadorBotao.setBounds(10, 437, 880, 1);
        separadorBotao.setBorder(new LineBorder(Color.BLACK));
        
        bVoltar = new JButton("Voltar");
        bVoltar.setBounds(320, 455, 250, 50);
        bVoltar.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bVoltar.setFocusPainted(false);
        bVoltar.setForeground(Color.WHITE);
        bVoltar.setBackground(Color.decode("#ff0000"));
        bVoltar.setBorder(new LineBorder(Color.BLACK));
        bVoltar.addActionListener(this);
        bVoltar.addMouseListener(new MouseListener() {
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
                bVoltar.setBounds(320, 455, 250, 50);
                sombraBVoltar.setBounds(320, 455, 250, 52);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bVoltar.setBounds(317, 452, 255, 56);
                sombraBVoltar.setBounds(321, 455, 247, 56);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        sombraBVoltar = new JPanel();
        sombraBVoltar.setBackground(Color.GRAY);
        sombraBVoltar.setBounds(320, 455, 250, 52);
        
        panel = new JPanel();
        panel.setBackground(Color.decode("#c6ecd9"));
        panel.setLayout(null);

        panel.add(dados);
        panel.add(separadorDados);
        panel.add(panel1);
        panel.add(panelSombra1);
        panel.add(panel2);
        panel.add(panelSombra2);
        panel.add(panel3);
        panel.add(panelSombra3);
        panel.add(separadorBotao);
        panel.add(bVoltar);
        panel.add(sombraBVoltar);
        
        frame = new JFrame();
        frame.setTitle("Situacao - Paciente");
        frame.setSize(900, 559);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public static void main(String args[]) {

        telaSituacao telastuacao = new telaSituacao();

    }
    
}
