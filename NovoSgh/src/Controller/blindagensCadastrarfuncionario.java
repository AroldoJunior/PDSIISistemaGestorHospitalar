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
    
    public boolean blingadegens(String nome, String cpf, String rg, String cargo,String senha, String email, String Telefone,String confirmasenha){
   
        
        boolean resposta = false;
        boolean aux1 = campoEmBranco(nome);
        boolean aux2 = campoEmBranco(cpf);
        boolean aux3 = campoEmBranco(rg);
        boolean aux4 = campoEmBranco(cargo);
        boolean aux5 = campoEmBranco(senha);
        boolean aux6 = campoEmBranco(email);
        boolean aux7 = campoEmBranco(Telefone);
        boolean aux8 = conterNumeros(nome);
        boolean aux9 = conterNumeros(cargo);
        boolean aux10 = conterNumeros(cpf);
        boolean aux11 = conterNumeros(rg);
        boolean aux12 = confirmarSenha(senha,senha);
        boolean aux13 = cpfNumerosSize(cpf);
        boolean aux14 = rgNumerosSize(rg);
        boolean aux15 = contemLetras(cpf);  
        boolean aux16 = contemLetras(rg);
        boolean aux17 = campoSemEspaco(cpf);
        boolean aux18 = campoSemEspaco(rg);
        boolean aux19 = campoSemEspaco(senha);
        boolean aux20 = campoSemEspaco(email);
        boolean aux21 = campoNaoTemCaracteresEspeciais(nome);
        boolean aux22 = campoNaoTemCaracteresEspeciais(cpf);
        boolean aux23 = campoNaoTemCaracteresEspeciais(rg);
        boolean aux24 = campoNaoTemCaracteresEspeciais(Telefone);
        boolean aux25 = emailEstrutura(email);
        boolean aux26 = confirmarSenha(senha,confirmasenha);

        if (aux1 == false && aux2 == false && aux3 == false && aux4 == false && aux5 == false && aux6 == false && aux7 == false && aux8 == false && aux9 == false && aux10 == true && aux11 == true && aux12 == true && aux13 == true && aux14 == true && aux15 == false && aux16 == false && aux17 == false && aux18 == false && aux19 == false && aux20 == false && aux21 == true && aux22 == false && aux23 == false && aux24 == false && aux25 == true && aux26 == true)
            resposta = true;
            
        return resposta;
        
    }
    
      public boolean campoEmBranco(String login){
       
        boolean resposta = false;
        
        if(login.isEmpty())
            resposta = true;
       
        return resposta;
        
    }
    
    public boolean confirmarSenha(String senha, String confSenha){
        boolean valida = false;
        
        if(confSenha.equals(senha)){
            valida = true;
        }
        return valida;
    }
    
    public boolean senhaEmBranco(String senha){
       
        boolean resposta = false;
        
        if(senha.isEmpty())
            resposta = true;
       
        return resposta;
        
    }
    
    public boolean emailEstrutura(String texto){
        if (texto.contains("@")&&texto.contains(".com")){
	    return true;
	}else{
	    return false;
	}
    }
    
    
    
    public boolean campoNaoTemCaracteresEspeciais(String login){
	
        boolean resposta = false;
        
        if (login.matches("[a-zA-Z_][a-zA-Z0-9_]*"))
            return true;
        
        return resposta;
        
    }
    
    
    public boolean conterNumeros(String texto){
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))==true){
                return true;
            }
        }
        return false;
    }
    
    public boolean campoSize3(String nome){
            if(nome.length()<3){
                return false;
            }else{
                return true;
            }
    }
    
    public boolean cpfNumerosSizeMaior(String cpf){
        if(cpf.length()>11){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean cpfNumerosSizeMenor(String cpf){
        if(cpf.length()<11){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean rgNumerosSizeMaior(String rg){
        if(rg.length()>7){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean rgNumerosSizeMenor(String rg){
        if(rg.length()<7){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean contemLetras( String s ) {  
        for ( int i = 0; i < s.length(); i++ ) { 
	    if ( Character.isDigit( s.charAt(i) )==true) {  
		return false;
	     }  
	}  
	return true;  
   }
    
    public boolean campoSemEspaco(String login){
        
        boolean resposta = false;
        
        if (login.contains(" "))
	    resposta = true;

        return resposta;
            
    }
    
    public boolean loginTamanho(String login){
        
        boolean valida = false;
        
        if (login.length() >= 6 && login.length() <=8 )
            valida = true;
        
        return valida;
        
    }
    
    public boolean senhaTamanho(String senha){
        
        boolean valida = false;
        
        if (senha.length() >= 6 && senha.length() <=8 )
            valida = true;
        
        return valida;
        
    }
    
    
     public Boolean cpfNumerosSize(String cpf){
        if(cpf.length()==11){
            return true;
        }else{
            return false;
        }
    }
   
    public Boolean rgNumerosSize(String rg){
        if(rg.length()==7){
            return true;
        }else{
            return false;
        }
    }
}
