/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author CABRUTO
 */
public class blindagensLoginAtendente {
    
     public boolean blingadegens(String login, String senha){
        
        boolean resposta = false;
        boolean aux1 = loginEmBranco(login);
        boolean aux2 = senhaEmBranco(senha);
        boolean aux3 = loginNaoTemCaracteresEspeciais(login);
        boolean aux4 = senhaNaoTemCaracteresEspeciais(senha);
        boolean aux5 = loginSemEspaco(login);
        boolean aux6 = senhaSemEspaco(senha);
        boolean aux7 = loginTamanho(login);
        boolean aux8 = senhaTamanho(senha);
             
        
        if (aux1 == false && aux2 == false && aux3 == true && aux4 == true && aux5 == false && aux6 == false && aux7 == true && aux8 == true)
            resposta = true;
            
        return resposta;
        
        
     }
      
        
    // Blindagens (Testes) //
    public boolean loginEmBranco(String login) {

        boolean resposta = false;

        if (login.isEmpty()) {
            resposta = true;
        }

        return resposta;

    }

    public boolean senhaEmBranco(String senha) {

        boolean resposta = false;

        if (senha.isEmpty()) {
            resposta = true;
        }

        return resposta;

    }

    public boolean loginNaoTemCaracteresEspeciais(String login) {

        boolean resposta = false;

        if (login.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
            return true;
        }

        return resposta;

    }

    public boolean senhaNaoTemCaracteresEspeciais(String senha) {

        boolean resposta = false;

        if (senha.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
            return true;
        }

        return resposta;

    }

    public boolean loginSemEspaco(String login) {

        boolean resposta = false;

        if (login.contains(" ")) {
            resposta = true;
        }

        return resposta;

    }

    public boolean senhaSemEspaco(String senha) {

        boolean resposta = false;

        if (senha.contains(" ")) {
            resposta = true;
        }

        return resposta;

    }

    public boolean loginTamanho(String login) {

        boolean valida = false;

        if (login.length() >= 6 && login.length() <= 8) {
            valida = true;
        }

        return valida;

    }

    public boolean senhaTamanho(String senha) {

        boolean valida = false;

        if (senha.length() >= 6 && senha.length() <= 8) {
            valida = true;
        }

        return valida;

    }

   
     public boolean campoSize3(String nome){
            if(nome.length()<3){
                return false;
            }else{
                return true;
            }
    }
        
    
}
