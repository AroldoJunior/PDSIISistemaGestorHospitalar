import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import pacotes.Login;
import pacotes.Gets;

public class logintest {
    
    private Login x;  
    private Gets g;
    String logs,sen;
        
    @Before
    public void setup() {
        x = new Login();
        
    }
    
    @After
    public void teardown() {
        x = null;
    }
        
    @Test
    public void loginSemEspaco(){
       new Login();
        
        
        assertFalse("login Sem Espaço", x.loginSemEspaco("eduardo12"));
         
    }
    
    @Test
    public void senhaSemEspaco(){
       new Login();
        
        
        assertFalse("Senha Sem Espaço", x.loginSemEspaco("sistemaseguro"));
         
    }
    
    
    @Test
    public void senhaConterNumeros(){
        new Login();
        
        
        assertFalse("Conter so numeros", x.conterNumeros());
        
        
                 
    }
    
    @Test
    public void semConterCaracteresEspeciaisSenha(){
        new Login();
        
        
        assertTrue("Sem Caracteres Especiais", x.semConterCaracteresEspeciaisSenha("Eduardo123"));
         
    }
    
    @Test
    public void semConterCaracteresEspeciaisLogin(){
        new Login();
        
        
        assertTrue("Sem Caracteres Especiais", x.semConterCaracteresEspeciaisSenha("Eduardo12"));
        
    } 
    
    @Test
    public void loginVazio(){
        new Login();
        
        
        assertTrue("Login vazio", x.loginVazio(""));
      
    }
    
    @Test
    public void senhaVazia(){
        new Login();
        
        
        assertTrue("Senha vazia", x.loginVazio(""));
      
    }
    
    
    

