package View.telasMaster;

import Controller.conectaBanco;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public final class telaPrincipalMaster implements ActionListener {

    conectaBanco bd = new conectaBanco();
    
      String[] dados;

    private TableRowSorter trsFiltro;

    ResultSet Dado, Dado1;
    int cont = 0;

    private JFrame frame;
    private JPanel panel, panelMenu, panelMenuSombra, panelBuscar, sombraBuscar, sombraBarra, sombraBCadastrar, sombraBAlterar, sombraBExcluir, sombraBSair, sombraBAtualizar;
    private JSeparator separadorMenu, separadorMenu2, separadorFuncionarios, separadorAtualizar;
    private JLabel funcionarios, buscar, menu;
    private JTextField textBuscar;
    private JTable tabelaListar;
    private JScrollPane barra;
    private JButton bCadastrar, bAlterar, bExcluir, bSair, bAtualizar;
    private final DefaultTableModel modelo = (DefaultTableModel) (new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int coluna) {
            return false;
        }

        public boolean isCellRedimentionable(int row, int coluna) {
            return true;
        }

    });

    public telaPrincipalMaster() {

        gui();

    }

    public void gui() {

        // LABEL FUNCIONARIOS //
        funcionarios = new JLabel("Funcionários");
        funcionarios.setBounds(10, 10, 130, 20);
        funcionarios.setFont(new Font("Urbandub", Font.PLAIN, 20));
        funcionarios.setForeground(Color.BLACK);

        separadorFuncionarios = new JSeparator();
        separadorFuncionarios.setBounds(10, 40, 930, 1);
        separadorFuncionarios.setBorder(new LineBorder(Color.BLACK));

        // BUSCAR //
        buscar = new JLabel("Buscar:");
        buscar.setBounds(20, 60, 65, 30);
        buscar.setFont(new Font("Urbandub", Font.BOLD, 12));

        textBuscar = new JTextField();
        textBuscar.setBounds(80, 66, 715, 20);
        textBuscar.setBorder(new LineBorder(Color.WHITE));
        textBuscar.setFont(new Font("Urbandub", Font.BOLD, 12));
        textBuscar.addMouseListener(new MouseListener() {
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
                panelBuscar.setBounds(10, 60, 790, 30);
                sombraBuscar.setBounds(10, 60, 790, 32);
                buscar.setFont(new Font("Urbandub", Font.BOLD, 12));
                textBuscar.setFont(new Font("Urbandub", Font.PLAIN, 12));

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                panelBuscar.setBounds(7, 57, 795, 36);
                sombraBuscar.setBounds(11, 60, 787, 36);
                buscar.setFont(new Font("Urbandub", Font.BOLD, 14));
                textBuscar.setFont(new Font("Urbandub", Font.PLAIN, 14));

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }

        });

        panelBuscar = new JPanel();
        panelBuscar.setBounds(10, 60, 790, 30);
        panelBuscar.setBackground(Color.WHITE);
        panelBuscar.setBorder(new LineBorder(Color.BLACK));
        panelBuscar.addMouseListener(new MouseListener() {
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
                panelBuscar.setBounds(10, 60, 790, 30);
                sombraBuscar.setBounds(10, 60, 790, 32);
                buscar.setFont(new Font("Urbandub", Font.BOLD, 12));
                textBuscar.setFont(new Font("Urbandub", Font.PLAIN, 12));

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                panelBuscar.setBounds(7, 57, 795, 36);
                sombraBuscar.setBounds(11, 60, 787, 36);
                buscar.setFont(new Font("Urbandub", Font.BOLD, 14));
                textBuscar.setFont(new Font("Urbandub", Font.PLAIN, 14));

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }

        });

        sombraBuscar = new JPanel();
        sombraBuscar.setBounds(10, 60, 790, 32);
        sombraBuscar.setBackground(Color.GRAY);

        separadorAtualizar = new JSeparator();
        separadorAtualizar.setBounds(810, 60, 1, 32);
        separadorAtualizar.setBorder(new LineBorder(Color.BLACK));

        bAtualizar = new JButton("Atualizar");
        bAtualizar.setBounds(820, 60, 120, 30);
        bAtualizar.setFont(new Font("Century Gothic", Font.BOLD, 12));
        bAtualizar.setFocusPainted(false);
        bAtualizar.setBackground(Color.decode("#9999ff"));
        bAtualizar.setForeground(Color.WHITE);
        bAtualizar.addActionListener(this);
        bAtualizar.setBorder(new LineBorder(Color.BLACK));
        bAtualizar.addMouseListener(new MouseListener() {
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
                bAtualizar.setBounds(820, 60, 120, 30);
                sombraBAtualizar.setBounds(820, 60, 120, 32);

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bAtualizar.setBounds(817, 57, 125, 36);
                sombraBAtualizar.setBounds(821, 60, 117, 36);

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }

        });

        sombraBAtualizar = new JPanel();
        sombraBAtualizar.setBackground(Color.GRAY);
        sombraBAtualizar.setBounds(820, 60, 120, 32);

        // TABELA //
        bd.connection();

        // Preenchimento da tabela com os dados do banco //
        String sql = "select * from  funcionarios";

        Statement stmt;

        try {

            stmt = bd.con.prepareStatement(sql);

            Dado = stmt.executeQuery(sql);

            while (Dado.next()) {

                cont += 1;

            }
        } catch (SQLException n) {

            JOptionPane.showMessageDialog(null, n);

        }

        // Setando as colunas e as celulas da tabela //
        String[] colunas = {"Código", "Nome", "CPF", "RG", "Cargo", "Telefone", "Email"};

        modelo.setColumnIdentifiers(colunas);
        modelo.setNumRows(0);

        String sql1 = "select * from funcionarios";

        Statement stmt1;

        try {
            stmt1 = bd.con.prepareStatement(sql1);

            Dado1 = stmt1.executeQuery(sql1);

            while (Dado1.next()) {

                 dados = new String[7];

                for (int i = 0; i < 7; i++) {
                    dados[0] = Dado1.getString("id");
                    dados[1] = Dado1.getString("nome");
                    dados[2] = Dado1.getString("cpf");
                    dados[3] = Dado1.getString("rg");
                    dados[4] = Dado1.getString("cargo");
                    dados[5] = Dado1.getString("numtell");
                    dados[6] = Dado1.getString("email");

                }
                modelo.addRow(dados);

            }

        } catch (SQLException n) {

            JOptionPane.showMessageDialog(null, n);

        }

        tabelaListar = new JTable();
        tabelaListar.setBackground(Color.WHITE);
        tabelaListar.setModel(modelo);
        tabelaListar.setFillsViewportHeight(true);

        barra = new JScrollPane(tabelaListar);
        barra.setBounds(10, 100, 930, 454);
        barra.setBorder(new LineBorder(Color.BLACK));

        sombraBarra = new JPanel();
        sombraBarra.setBounds(10, 100, 930, 456);
        sombraBarra.setBackground(Color.GRAY);

        // MENU //
        bCadastrar = new JButton("Cadastrar");
        bCadastrar.setBounds(1010, 40, 233, 50);
        bCadastrar.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bCadastrar.setFocusPainted(false);
        bCadastrar.setBackground(Color.WHITE);
        bCadastrar.addActionListener(this);
        bCadastrar.setBorder(new LineBorder(Color.BLACK));
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
                bCadastrar.setBounds(1010, 40, 233, 50);
                sombraBCadastrar.setBounds(1010, 40, 233, 52);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bCadastrar.setBounds(1007, 37, 238, 56);
                sombraBCadastrar.setBounds(1011, 40, 230, 56);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        sombraBCadastrar = new JPanel();
        sombraBCadastrar.setBackground(Color.GRAY);
        sombraBCadastrar.setBounds(1010, 40, 233, 52);

        bAlterar = new JButton("Alterar");
        bAlterar.setBounds(1010, 110, 233, 50);
        bAlterar.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bAlterar.setFocusPainted(false);
        bAlterar.setBackground(Color.WHITE);
        bAlterar.addActionListener(this);
        bAlterar.setBorder(new LineBorder(Color.BLACK));
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
                bAlterar.setBounds(1010, 110, 233, 50);
                sombraBAlterar.setBounds(1010, 110, 233, 52);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bAlterar.setBounds(1007, 107, 238, 56);
                sombraBAlterar.setBounds(1011, 110, 230, 56);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        sombraBAlterar = new JPanel();
        sombraBAlterar.setBackground(Color.GRAY);
        sombraBAlterar.setBounds(1010, 110, 233, 52);

        bExcluir = new JButton("Excluir");
        bExcluir.setBounds(1010, 180, 233, 50);
        bExcluir.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bExcluir.setFocusPainted(false);
        bExcluir.setBackground(Color.WHITE);
        bExcluir.addActionListener(this);
        bExcluir.setBorder(new LineBorder(Color.BLACK));
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
                bExcluir.setBounds(1010, 180, 233, 50);
                sombraBExcluir.setBounds(1010, 180, 233, 52);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bExcluir.setBounds(1007, 177, 238, 56);
                sombraBExcluir.setBounds(1011, 180, 230, 56);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        sombraBExcluir = new JPanel();
        sombraBExcluir.setBackground(Color.GRAY);
        sombraBExcluir.setBounds(1010, 180, 233, 52);

        bSair = new JButton("Sair");
        bSair.setBounds(1010, 477, 233, 50);
        bSair.setFont(new Font("Century Gothic", Font.BOLD, 14));
        bSair.setFocusPainted(false);
        bSair.setBackground(Color.decode("#ff0000"));
        bSair.setForeground(Color.WHITE);
        bSair.addActionListener(this);
        bSair.setBorder(new LineBorder(Color.BLACK));
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
                bSair.setBounds(1010, 477, 233, 50);
                sombraBSair.setBounds(1010, 477, 233, 52);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().requestFocus();
                bSair.setBounds(1007, 474, 238, 56);
                sombraBSair.setBounds(1011, 477, 230, 56);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
            }
        });

        sombraBSair = new JPanel();
        sombraBSair.setBackground(Color.GRAY);
        sombraBSair.setBounds(1010, 477, 233, 52);

        menu = new JLabel("MENU");
        menu.setBounds(1092, 10, 130, 25);
        menu.setFont(new Font("Urbandub", Font.BOLD, 20));
        menu.setForeground(Color.WHITE);

        panelMenu = new JPanel();
        //panelMenu.setBackground(Color.decode("#cce6ff"));
        panelMenu.setBackground(Color.decode("#80b3ff"));
        panelMenu.setBounds(950, 0, 350, 563);
        panelMenu.setBorder(new LineBorder(Color.BLACK));

        panelMenuSombra = new JPanel();
        panelMenuSombra.setBackground(Color.LIGHT_GRAY);
        panelMenuSombra.setBounds(947, 0, 350, 563);

        separadorMenu = new JSeparator();
        separadorMenu.setBounds(1000, 40, 1, 487);
        separadorMenu.setBorder(new LineBorder(Color.BLACK));

        separadorMenu2 = new JSeparator();
        separadorMenu2.setBounds(1252, 40, 1, 487);
        separadorMenu2.setBorder(new LineBorder(Color.BLACK));

        panel = new JPanel();
        panel.setBackground(Color.decode("#cce6ff"));
        panel.setLayout(null);

        panel.add(funcionarios);
        panel.add(separadorFuncionarios);
        panel.add(buscar);
        panel.add(textBuscar);
        panel.add(panelBuscar);
        panel.add(sombraBuscar);
        panel.add(separadorAtualizar);
        panel.add(bAtualizar);
        panel.add(sombraBAtualizar);
        panel.add(barra);
        panel.add(sombraBarra);
        panel.add(menu);
        panel.add(bCadastrar);
        panel.add(sombraBCadastrar);
        panel.add(bAlterar);
        panel.add(sombraBAlterar);
        panel.add(bExcluir);
        panel.add(sombraBExcluir);
        panel.add(bSair);
        panel.add(sombraBSair);
        panel.add(separadorMenu);
        panel.add(separadorMenu2);
        panel.add(panelMenu);
        panel.add(panelMenuSombra);

        frame = new JFrame();
        frame.setTitle("Tela Principal - Gerência");
        frame.setSize(1300, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(panel);

        // ação para busca inteligente //
        textBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textBuscarKeyTyped(evt);
            }
        });

        //Proporciona ação do click na tabela
        tabelaListar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {

                }
            }
        });

    }

    public void filtro() {
        int columnaABuscar = 1;

        trsFiltro.setRowFilter(RowFilter.regexFilter(textBuscar.getText(), columnaABuscar));
    }

    private void textBuscarKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        textBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (textBuscar.getText());
                textBuscar.setText(cadena);
                //repaint();
                filtro();
            }
        });

        trsFiltro = new TableRowSorter(tabelaListar.getModel());
        tabelaListar.setRowSorter(trsFiltro);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bAlterar) {

            telaAlterarFuncionario alterar = new telaAlterarFuncionario();

            int index = tabelaListar.getSelectedRow();

            TableModel  model = tabelaListar.getModel();

            String Id = model.getValueAt(index, 0).toString();
            String Nome = model.getValueAt(index, 1).toString();
            String Cpf = model.getValueAt(index, 2).toString();
            String Rg = model.getValueAt(index, 3).toString();
            String Cargo = model.getValueAt(index, 4).toString();
            String Telefone = model.getValueAt(index, 5).toString();
            String Email = model.getValueAt(index, 6).toString();

            alterar.SetCodigoTabela(Id);
            alterar.textNome.setText(Nome);
            alterar.textCpf.setText(Cpf);
            alterar.textRg.setText(Rg);
            alterar.textCargo.setText(Cargo);
            alterar.textEmail.setText(Email);
            alterar.textTelefone.setText(Telefone);

        }

        if (e.getSource() == bCadastrar) {

            telaCadastroFuncionario tela = new telaCadastroFuncionario();

        }

        if (e.getSource() == bExcluir) {

            telaExcluirFuncionario excluir = new telaExcluirFuncionario();

            int index = tabelaListar.getSelectedRow();

            TableModel model = tabelaListar.getModel();

            String Id = model.getValueAt(index, 0).toString();
            String Nome = model.getValueAt(index, 1).toString();
            String Cpf = model.getValueAt(index, 2).toString();
            String Rg = model.getValueAt(index, 3).toString();
            String Cargo = model.getValueAt(index, 4).toString();
            String Telefone = model.getValueAt(index, 5).toString();
            String Email = model.getValueAt(index, 6).toString();

            excluir.SetCodigoTabela(Id);
            excluir.textNome.setText(Nome);
            excluir.textCpf.setText(Cpf);
            excluir.textRg.setText(Rg);
            excluir.textCargo.setText(Cargo);
            excluir.textEmail.setText(Email);
            excluir.textTelefone.setText(Telefone);
        }

        if (e.getSource() == bAtualizar) {
    
            DefaultTableModel model = (DefaultTableModel) tabelaListar.getModel();

            model.setNumRows(0);

            String sql1 = "select * from funcionarios";

            Statement stmt1;

            try {
                stmt1 = bd.con.prepareStatement(sql1);

                Dado1 = stmt1.executeQuery(sql1);

                while (Dado1.next()) {

                    dados = new String[7];

                    for (int i = 0; i < 7; i++) {
                        dados[0] = Dado1.getString("id");
                        dados[1] = Dado1.getString("nome");
                        dados[2] = Dado1.getString("cpf");
                        dados[3] = Dado1.getString("rg");
                        dados[4] = Dado1.getString("cargo");
                        dados[5] = Dado1.getString("numtell");
                        dados[6] = Dado1.getString("email");

                    }
                    modelo.addRow(dados);

                }

            } catch (SQLException n) {

                JOptionPane.showMessageDialog(null, n);

            }

          
        }
        
        
        

        if (e.getSource() == bSair) {
            frame.dispose();
        }
    }

    public static void main(String args[]) {

        new telaPrincipalMaster();

    }

}
