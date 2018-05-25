/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.telasMaster.telaCadastroFuncionario;
/**
 *
 * @author CABRUTO
 */
public class blindagensCadastrarfuncionario {
    public boolean blingadegens(String nome, String cpf, String rg, String cargo,String senha, String email, String num){
        telaCadastroFuncionario tcf = new telaCadastroFuncionario();
        
        boolean resposta = false;
        boolean aux1 = tcf.campoEmBranco(nome);
        boolean aux2 = tcf.campoEmBranco(cpf);
        boolean aux3 = tcf.campoEmBranco(rg);
        boolean aux4 = tcf.campoEmBranco(cargo);
        boolean aux5 = tcf.campoEmBranco(senha);
        boolean aux6 = tcf.campoEmBranco(email);
        boolean aux7 = tcf.campoEmBranco(num);
        boolean aux8 = tcf.conterNumeros(nome);
        boolean aux9 = tcf.conterNumeros(cargo);
        boolean aux10 = tcf.conterNumeros(cpf);
        boolean aux11 = tcf.conterNumeros(rg);
        boolean aux12 = tcf.confirmarSenha(senha,senha);
        boolean aux13 = tcf.cpfNumerosSize(cpf);
        boolean aux14 = tcf.rgNumerosSize(rg);
        boolean aux15 = tcf.contemLetras(cpf);  
        boolean aux16 = tcf.contemLetras(rg);
        boolean aux17 = tcf.campoSemEspaco(cpf);
        boolean aux18 = tcf.campoSemEspaco(rg);
        boolean aux19 = tcf.campoSemEspaco(senha);
        boolean aux20 = tcf.campoSemEspaco(email);
        boolean aux21 = tcf.campoNaoTemCaracteresEspeciais(nome);
        boolean aux22 = tcf.campoNaoTemCaracteresEspeciais(cpf);
        boolean aux23 = tcf.campoNaoTemCaracteresEspeciais(rg);
        boolean aux24 = tcf.campoNaoTemCaracteresEspeciais(num);
        boolean aux25 = tcf.emailEstrutura(email);

        if (aux1 == false && aux2 == false && aux3 == false && aux4 == false && aux5 == false && aux6 == false && aux7 == false && aux8 == false && aux9 == false && aux10 == true && aux11 == true && aux12 == true && aux13 == true && aux14 == true && aux15 == false && aux16 == false && aux17 == false && aux18 == false && aux19 == false && aux20 == false && aux21 == true && aux22 == false && aux23 == false && aux24 == false && aux25 == true)
            resposta = true;
            
        return resposta;
        
    }
}
