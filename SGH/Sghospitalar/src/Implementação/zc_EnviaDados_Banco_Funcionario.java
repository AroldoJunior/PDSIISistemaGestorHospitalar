package Implementação;

import BancoDeDados.conectBanco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class zc_EnviaDados_Banco_Funcionario {

    conectBanco bd = new conectBanco();
    //zc_Funcionario z = new zc_Funcionario();

    public boolean Cadastra(zc_Funcionario funcionario) {

        boolean certo;

        bd.connection();

        String sql = "insert into funcionario(Nome, Cpf, Rg, Cargo,Senha, NumCell, Email) values (?, ?, ?, ?, ?, ?, ?)";

        try {

            JOptionPane.showMessageDialog(null, "Esses são os dados a cadastrar nome '" + funcionario.getNome());

            PreparedStatement stm = bd.con.prepareStatement(sql);

            stm.setString(1, funcionario.getNome());
            stm.setLong(2, funcionario.getCpf());
            stm.setInt(3, funcionario.getRg());
            stm.setString(4, funcionario.getCargo());
            stm.setString(5, funcionario.getSenha());
            stm.setString(6, funcionario.getNumCell());
            stm.setString(7, funcionario.getEmail());
            System.out.println("Deu certo");
            stm.execute();

            stm.close();
            System.out.println("Deu certo");
            certo = true;
            System.out.println("Deu certo");
        } catch (SQLException ex) {

            //throw new RuntimeException(ex);
            certo = false;
        }

        return certo;

    }

    public String BuscarNome(int codigo) {

        String Resul = null;
        bd.connection();
        PreparedStatement stmt = null;
        ResultSet Resultado = null;
        String sql = "select Nome from funcionario where Cpf = ?";

        try {

            stmt = bd.con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            Resultado = stmt.executeQuery();

            while (Resultado.next()) {

                Resul = Resultado.getString("Nome");

            }

        } catch (SQLException ex) {

            Resul = "aaaa";
        }
        return Resul;

    }

    public int BuscarCpf(int cpf) {

        int Resul = 0;
        bd.connection();
        PreparedStatement stmt = null;
        ResultSet Resultado = null;

        String sql = "select Cpf from funcionario where Cpf = ?";

        try {

            stmt = bd.con.prepareStatement(sql);
            stmt.setInt(1, cpf);
            Resultado = stmt.executeQuery();

            while (Resultado.next()) {

                Resul = Resultado.getInt("Cpf");

            }
        } catch (SQLException ex) {

            Resul = -1;
        }
        return Resul;

    }

    public int BuscarRg(int codigo) {

        int Resul = 0;
        bd.connection();
        PreparedStatement stmt = null;
        ResultSet Resultado = null;
        String sql = "select Rg from funcionario where Cpf = ?";

        try {

            stmt = bd.con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            Resultado = stmt.executeQuery();

            while (Resultado.next()) {

                Resul = Resultado.getInt("Rg");

            }

        } catch (SQLException ex) {

            Resul = -1;
        }
        return Resul;

    }

    public String BuscarCargo(int codigo) {

        String Resul = null;
        bd.connection();
        PreparedStatement stmt = null;
        ResultSet Resultado = null;
        String sql = "select Cargo from funcionario where Cpf = ?";

        try {

            stmt = bd.con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            Resultado = stmt.executeQuery();

            while (Resultado.next()) {

                Resul = Resultado.getString("Cargo");

            }

        } catch (SQLException ex) {

            Resul = "aaaa";
        }
        return Resul;

    }

    public String BuscarSenha(int codigo) {

        String Resul = null;
        bd.connection();
        PreparedStatement stmt = null;
        ResultSet Resultado = null;
        String sql = "select Senha from funcionario where Cpf = ?";

        try {

            stmt = bd.con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            Resultado = stmt.executeQuery();

            while (Resultado.next()) {

                Resul = Resultado.getString("Senha");

            }

        } catch (SQLException ex) {

            Resul = "aaaa";
        }
        return Resul;

    }

    public String BuscarNumCell(int codigo) {

        String Resul = null;
        bd.connection();
        PreparedStatement stmt = null;
        ResultSet Resultado = null;
        String sql = "select NumCell from funcionario where Cpf = ?";

        try {

            stmt = bd.con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            Resultado = stmt.executeQuery();

            while (Resultado.next()) {

                Resul = Resultado.getString("NumCell");

            }

        } catch (SQLException ex) {

            Resul = "aaaa";
        }
        return Resul;

    }

    public String BuscarEmail(int codigo) {

        String Resul = null;
        bd.connection();
        PreparedStatement stmt = null;
        ResultSet Resultado = null;
        String sql = "select Email from funcionario where Cpf = ?";

        try {

            stmt = bd.con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            Resultado = stmt.executeQuery();

            while (Resultado.next()) {

                Resul = Resultado.getString("Email");

            }

        } catch (SQLException ex) {

            Resul = "aaaa";
        }
        return Resul;

    }

    public boolean Deletar(int codigo) {

        boolean certo;
        bd.connection();
        PreparedStatement stmt = null;

        String sql = "delete from funcionario where Cpf = ?";

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

    public boolean Alterar(zc_Funcionario funcionario, int codigo) {

        boolean certo;

        bd.connection();

        String sql = "update funcionario set Nome = ?, Cpf = ?, Rg = ?, Cargo = ?, Senha = ?, NumCell = ?, Email = ? where Cpf = " + codigo + "";

        try {

            PreparedStatement stm = bd.con.prepareStatement(sql);

            stm.setString(1, funcionario.getNome());
            stm.setLong(2, funcionario.getCpf());
            stm.setInt(3, funcionario.getRg());
            stm.setString(4, funcionario.getCargo());
            stm.setString(5, funcionario.getSenha());
            stm.setString(6, funcionario.getNumCell());
            stm.setString(7, funcionario.getEmail());

            stm.execute();
            stm.close();

            certo = true;

        } catch (Exception e) {

            certo = false;

        }

        return certo;

    }

}
