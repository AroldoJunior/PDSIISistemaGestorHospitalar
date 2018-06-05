package Controller;
    
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conectaBanco {
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/pdsi2";
    private String usuario = "root";
    private String senha = "root";
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

            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);

            rs = stm.executeQuery(SQL);

        } catch (SQLException ex) {

            Logger.getLogger(conectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
