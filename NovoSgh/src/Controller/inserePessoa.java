package Controller;

import Model.Pessoa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class inserePessoa {

    conectaBanco bd = new conectaBanco();
    //zc_Funcionario z = new zc_Funcionario();

    public boolean Cadastra(Pessoa pessoa) {

        boolean certo;

        bd.connection();

        String sql = "insert into paciente(nome, cpf, rg, plano,dnascimento, numtell, descricao) values (?, ?, ?, ?, ?, ?, ?)";

        try {

            JOptionPane.showMessageDialog(null, "Esses são os dados a cadastrar nome '" + pessoa.getNome());

            PreparedStatement stm = bd.con.prepareStatement(sql);

            stm.setString(1, pessoa.getNome());
            stm.setString(2, pessoa.getCpf());
            stm.setString(3, pessoa.getRg());
            stm.setString(4, pessoa.getPlano());
            stm.setString(5, pessoa.getDataNascimento());
            stm.setString(6, pessoa.getNumcell());
            stm.setString(7, pessoa.getDescricao());
            System.out.println("Deu certo");
            stm.execute();

            stm.close();

            certo = true;

        } catch (SQLException ex) {

            //throw new RuntimeException(ex);
            certo = false;
        }

        return certo;

    }

    public boolean Deletar(int codigo) {

        boolean certo;
        bd.connection();
        PreparedStatement stmt = null;

        String sql = "delete from paciente where id = ?";

        try {
            stmt = bd.con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();

            certo = true;

        } catch (SQLException ex) {

            certo = false;

        }

        return certo;
    }

    public boolean Alterar(Pessoa pessoa, int codigo) {

        boolean certo;

        bd.connection();

        String sql = "update paciente set nome = ?, cpf = ?, rg = ?, plano = ?, dnascimento = ?, numtell = ?, descricao = ? where id = " + codigo + "";

        try {

            PreparedStatement stm = bd.con.prepareStatement(sql);

            stm.setString(1, pessoa.getNome());
            stm.setString(2, pessoa.getCpf());
            stm.setString(3, pessoa.getRg());
            stm.setString(4, pessoa.getPlano());
            stm.setString(5, pessoa.getDataNascimento());
            stm.setString(6, pessoa.getNumcell());
            stm.setString(7, pessoa.getDescricao());

            stm.execute();
            stm.close();

            certo = true;

        } catch (Exception e) {

            certo = false;

        }

        return certo;

    }

}
