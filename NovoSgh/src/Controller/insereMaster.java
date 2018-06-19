
package Controller;

import Model.Pessoa;
import java.sql.PreparedStatement;


public class insereMaster {
    
     conectaBanco bd = new conectaBanco();
    
     public boolean Alterar(String Usuario, String Senha) {

        boolean certo;

        bd.connection();

        String sql = "update funcmaster set usuario = ?, senha = ? where id = 1 ";

        try {

            PreparedStatement stm = bd.con.prepareStatement(sql);

            stm.setString(1, Usuario);
            stm.setString(2, Senha);
            

            stm.execute();
            stm.close();

            certo = true;

        } catch (Exception e) {

            certo = false;

        }

        return certo;

    }
    
}

