/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sghospitalar;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gemeos
 */
public class zc_EnviaDados_Banco_Funcionario {

    zc_Banco_de_Dados bd = new zc_Banco_de_Dados();
    zc_Funcionario z = new zc_Funcionario();

    public void adiciona(String Nome,String Cargo, String Senha, String NumCell, String Email) {

        bd.connection();

        String sql = "insert into funcionario(Nome, Cpf, Rg, Cargo,Senha, NumCell, Email) values (?, ?, ?, ?, ?, ?, ?)";

        try {

            JOptionPane.showMessageDialog(null, "Esses são os dados a cadastrar nome '" + Nome);

            PreparedStatement stm = bd.con.prepareStatement(sql);

            stm.setString(1, Nome);
            stm.setInt(2, z.getCpf());
            stm.setInt(3, z.getRg());
            stm.setString(4, Cargo);
            stm.setString(5, Senha);
            stm.setString(6, NumCell);
            stm.setString(7, Email);

            stm.execute();

            stm.close();

        } catch (SQLException ex) {

            //throw new RuntimeException(ex);
        }

    }

}
