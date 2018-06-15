/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Gemeos
 */
public class blindagensCadastrarpaciente {
    
    
    public boolean blingadegens(String nome, String cpf, String rg, String Plano, String DataNascimento, String numcell, String descricao){
   
        
        boolean resposta = false;
        boolean aux1 = campoEmBranco(nome);
        boolean aux2 = campoEmBranco(cpf);
        boolean aux3 = campoEmBranco(rg);
        boolean aux4 = campoEmBranco(Plano);
        boolean aux5 = campoEmBranco(descricao);
        boolean aux6 = campoEmBranco(DataNascimento);
        boolean aux7 = campoEmBranco(numcell);
        boolean aux8 = conterNumeros(nome);
        boolean aux9 = conterNumeros(Plano);
        boolean aux10 = conterNumeros(cpf);
        boolean aux11 = conterNumeros(rg);
        boolean aux13 = cpfNumerosSize(cpf);
        boolean aux14 = rgNumerosSize(rg);
        boolean aux15 = contemLetras(cpf);  
        boolean aux16 = contemLetras(rg);
        boolean aux17 = campoSemEspaco(cpf);
        boolean aux18 = campoSemEspaco(rg);
        boolean aux19 = campoSemEspaco(DataNascimento);
        boolean aux20 = campoSemEspaco(descricao);
        boolean aux21 = campoNaoTemCaracteresEspeciais(nome);
        boolean aux22 = campoNaoTemCaracteresEspeciais(cpf);
        boolean aux23 = campoNaoTemCaracteresEspeciais(rg);
        boolean aux24 = campoNaoTemCaracteresEspeciais(numcell);
        boolean aux25 = campoNaoTemCaracteresEspeciais(descricao);
        boolean aux26 = campoNaoTemCaracteresEspeciais(DataNascimento);
      

        if (aux1 == false && aux2 == false && aux3 == false && aux4 == false && aux5 == false && aux6 == false && aux7 == false && aux8 == false && aux9 == false && aux10 == true && aux11 == true &&  aux13 == true && aux14 == true && aux15 == false && aux16 == false && aux17 == false && aux18 == false && aux19 == false && aux20 == false && aux21 == true && aux22 == false && aux23 == false && aux24 == false && aux25 == false && aux26 == false)
            resposta = true;
            
        return resposta;
        
    }
    
      public boolean campoEmBranco(String login){
       
        boolean resposta = false;
        
        if(login.isEmpty())
            resposta = true;
       
        return resposta;
        
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
    
     public boolean cpfNumerosSize(String cpf){
        if(cpf.length()==11){
            return true;
        }else{
            return false;
        }
    }
   
    public boolean rgNumerosSize(String rg){
        if(rg.length()==7){
            return true;
        }else{
            return false;
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
    
  
    
}
