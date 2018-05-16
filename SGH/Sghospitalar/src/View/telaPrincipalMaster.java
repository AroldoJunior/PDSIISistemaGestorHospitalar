package View;

import BancoDeDados.conectBanco;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class telaPrincipalMaster extends JFrame implements ActionListener {
    
    ResultSet Dado, Dado1;
    int cont = 0;
    JTable tableLista;
    JScrollPane barra;
    JLabel labelMenu, labelBuscar;
    JTextField textBuscar;
    JTextPane sombraTable, menuPane, menuPane2, sombraMenu, paneBuscar, sombraBuscar;
    JButton bCadastrar, bListar, bAlterar, bExcluir, bSair;
    
    DefaultTableModel modelo = (DefaultTableModel) (new DefaultTableModel() {

            public boolean isCellEditable(int row, int coluna) {
                return false;
            }

            public boolean isCellRedimentionable(int row, int coluna) {
                return true;
            }

        });
    
    conectBanco bd = new conectBanco();
    
    // Construtor //
    public telaPrincipalMaster() {

        Container c = this.getContentPane();
        c.setLayout(null);

        // Buscar //
   
        labelBuscar = new JLabel();
        labelBuscar.setText("Buscar:");
        labelBuscar.setBounds(20, 15, 150, 20);
        add(labelBuscar);
        
        textBuscar = new JTextField();
        textBuscar.setBounds(75, 16, 830, 20);
        textBuscar.setBorder(new LineBorder(Color.WHITE));
        add(textBuscar);

        paneBuscar = new JTextPane();
        paneBuscar.setBounds(10, 10, 900, 30);
        paneBuscar.setBackground(Color.WHITE);
        paneBuscar.setBorder(new LineBorder(Color.BLACK));
        paneBuscar.setEditable(false);
        add(paneBuscar);
        
        sombraBuscar = new JTextPane();
        sombraBuscar.setBounds(15, 15, 900, 30);
        sombraBuscar.setBackground(Color.GRAY);
        sombraBuscar.setEditable(false);
        add(sombraBuscar);
        
        // Tabela //
        
        bd.connection();

        String sql = "select * from  funcionario";

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
        
        String[] colunas = {"Código", "Nome", "CPF", "RG", "Cargo", "Telefone", "Email"};

        modelo.setColumnIdentifiers(colunas);
        modelo.setNumRows(0);

        String sql1 = "select * from funcionario";

        Statement stmt1;

        try {
            stmt1 = bd.con.prepareStatement(sql1);

            Dado1 = stmt1.executeQuery(sql1);

            while (Dado1.next()) {

                String[] dados = new String[7];

                for (int i = 0; i < 7; i++) {
                    dados[0] = Dado1.getString("id");
                    dados[1] = Dado1.getString("Nome");
                    dados[2] = Dado1.getString("Cpf");
                    dados[3] = Dado1.getString("Rg");
                    dados[4] = Dado1.getString("Cargo");
                    dados[5] = Dado1.getString("NumCell");
                    dados[6] = Dado1.getString("Email");

                }
                modelo.addRow(dados);

            }
        } catch (SQLException n) {

            JOptionPane.showMessageDialog(null, n);

        }

        tableLista = new JTable();
        tableLista.setBackground(Color.WHITE);
        tableLista.setModel(modelo);
        tableLista.setFillsViewportHeight(true);

        barra = new JScrollPane(tableLista);
        barra.setBounds(10, 50, 900, 503);
        barra.setBorder(new LineBorder(Color.BLACK));
        add(barra);

        // Menu //
        bCadastrar = new JButton();
        bCadastrar.setText("CADASTRAR");
        bCadastrar.setBounds(993, 84, 220, 40);
        bCadastrar.setBackground(Color.decode("#B0C4DE"));
        bCadastrar.setBorder(new LineBorder(Color.BLACK));
        bCadastrar.addActionListener(this);
        bCadastrar.setFocusPainted(false);
        bCadastrar.setForeground(Color.BLACK);
        add(bCadastrar);

        bAlterar = new JButton();
        bAlterar.setText("ALTERAR");
        bAlterar.setBounds(993, 154, 220, 40);
        bAlterar.setBackground(Color.decode("#B0C4DE"));
        bAlterar.setBorder(new LineBorder(Color.BLACK));
        bAlterar.setFocusPainted(false);
        bAlterar.addActionListener(this);
        bAlterar.setForeground(Color.BLACK);
        add(bAlterar);

        bExcluir = new JButton();
        bExcluir.setText("EXCLUIR");
        bExcluir.setBounds(993, 224, 220, 40);
        bExcluir.setBackground(Color.decode("#B0C4DE"));
        bExcluir.setBorder(new LineBorder(Color.BLACK));
        bExcluir.setFocusPainted(false);
        bExcluir.addActionListener(this);
        bExcluir.setForeground(Color.BLACK);
        add(bExcluir);

        bSair = new JButton();
        bSair.setText("Sair");
        bSair.setForeground(Color.WHITE);
        bSair.setBounds(993, 470, 220, 40);
        bSair.setBackground(Color.decode("#FF6347"));
        bSair.setBorder(new LineBorder(Color.BLACK));
        bSair.setFocusPainted(false);
        bSair.addActionListener(this);
        add(bSair);

        labelMenu = new JLabel();
        labelMenu.setText("MENU");
        labelMenu.setBounds(1068, 30, 100, 50);
        labelMenu.setFont(labelMenu.getFont().deriveFont(20.0f));
        add(labelMenu);

        menuPane = new JTextPane();
        menuPane.setBounds(964, 20, 280, 523);
        menuPane.setBackground(Color.WHITE);
        menuPane.setBorder(new LineBorder(Color.BLACK));
        menuPane.setEditable(false);
        add(menuPane);

        menuPane2 = new JTextPane();
        menuPane2.setBounds(954, 10, 300, 543);
        menuPane2.setBackground(Color.WHITE);
        menuPane2.setBorder(new LineBorder(Color.BLACK));
        menuPane2.setEditable(false);
        add(menuPane2);

        //Proporciona ação do click na tabela
        tableLista.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {

                }
            }
        });

        setTitle("Tala Principal - Gerência");
        setSize(1300, 600);
        getContentPane().setBackground(Color.decode("#cce6ff"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    // Ações //
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bCadastrar) {
            telaCadastroFunc telacadastrofunc = new telaCadastroFunc();
            modelo.fireTableDataChanged();
        }

        if (e.getSource() == bAlterar) {

            telaAlterarFunc alterar = new telaAlterarFunc();

            int index = tableLista.getSelectedRow();

            TableModel model = model = tableLista.getModel();

            String Id = model.getValueAt(index, 0).toString();
            String Nome = model.getValueAt(index, 1).toString();
            String Cpf = model.getValueAt(index, 2).toString();
            String Rg = model.getValueAt(index, 3).toString();
            String Cargo = model.getValueAt(index, 4).toString();
            String Telefone = model.getValueAt(index, 5).toString();
            String Email = model.getValueAt(index, 6).toString();
            
            alterar.textCodigo.setText(Id);
            alterar.textNome.setText(Nome);
            alterar.textCpf.setText(Cpf);
            alterar.textRg.setText(Rg);
            alterar.textCargo.setText(Cargo);
            alterar.textEmail.setText(Email);
            alterar.textNumbCell.setText(Telefone);

        }

        if (e.getSource() == bSair) {
            telaLoginMaster telalloginmaster = new telaLoginMaster();
            dispose();

        }

    }

}
