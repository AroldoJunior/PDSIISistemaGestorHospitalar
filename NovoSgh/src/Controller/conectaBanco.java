package Controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conectaBanco {

    public Statement stm;
    public ResultSet rs;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String caminho = "jdbc:mysql://localhost:3306/pdsi2";
    private final String usuario = "root";
    private final String senha = "";
    public Connection con;

    public void connection() {

        try {

            System.setProperty("jdbc.Drivers", driver);

            con = DriverManager.getConnection(caminho, usuario, senha);

            System.out.println("Conectado");

        } catch (SQLException ex) {

            //Logger.getLogger(cadastrar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro de conexão");

        }

    }

    public void executaSQL(String SQL) {

        try {

            stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            rs = stm.executeQuery(SQL);

        } catch (SQLException ex) {

            Logger.getLogger(conectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
