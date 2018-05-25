/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.telasMaster.telaLoginMaster;

/**
 *
 * @author CABRUTO
 */
public class blindagensLoginMaster {
        
        telaLoginMaster tm = new telaLoginMaster();
        
        public boolean blingadegens(String login, String senha){
        
        boolean resposta = false;
        boolean aux1 = tm.loginEmBranco(login);
        boolean aux2 = tm.senhaEmBranco(senha);
        boolean aux3 = tm.loginNaoTemCaracteresEspeciais(login);
        boolean aux4 = tm.senhaNaoTemCaracteresEspeciais(senha);
        boolean aux5 = tm.loginSemEspaco(login);
        boolean aux6 = tm.senhaSemEspaco(senha);
        boolean aux7 = tm.loginTamanho(login);
        boolean aux8 = tm.senhaTamanho(senha);
             
        
        if (aux1 == false && aux2 == false && aux3 == true && aux4 == true && aux5 == false && aux6 == false && aux7 == true && aux8 == true)
            resposta = true;
            
        return resposta;
        
    }
}
