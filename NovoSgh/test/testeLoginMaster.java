
import View.telaLoginMaster;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class testeLoginMaster {
    
    telaLoginMaster l;
    boolean resposta = false;
    
    public testeLoginMaster() {
    
    }
    
    @Before
    public void setUp() {
        l = new telaLoginMaster();
        
    }
    
    @After
    public void tearDown() {
        l = null;
        
    }
    
    @Test
    public void testeLoginEmBranco(){
        // Dado que... 
        
        // Quando...
        resposta = l.loginEmBranco("");
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
    }
    
    @Test
    public void testeSenhaEmBranco(){
        // Dado que... 
        
        // Quando...
        resposta = l.senhaEmBranco("");
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
    }
    
    @Test
    public void testeLoginNaoTemCaracteresEspeciais(){
        // Dado que... 
        
        // Quando...
        resposta = l.loginNaoTemCaracteresEspeciais("Alou23@!");
        // Então...
        assertEquals("Nao deveria ter caracteres especiais!", resposta, false);
        
    }
    
    @Test
    public void testeSenhaNaoTemCaracteresEspeciais(){
        // Dado que... 
        
        // Quando...
        resposta = l.senhaNaoTemCaracteresEspeciais("alou23@!");
        // Então...
        assertEquals("Nao deveria ter caracteres especiais!", resposta, false);
        
    }
    
    @Test
    public void testeLoginSemEspaco(){
        // Dado que... 
        
        // Quando...
        resposta = l.loginSemEspaco("alou alou");
        // Então...
        assertEquals("Nao deveria ter espaços!", resposta, true);
        
    }
    
    @Test
    public void testeSenhaSemEspaco(){
        // Dado que... 
        
        // Quando...
        resposta = l.senhaSemEspaco("alou alou");
        // Então...
        assertEquals("Nao deveria ter espaços!", resposta, true);
        
    }
    
    @Test
    public void testeLoguinTamanho(){
        // Dado que... 
        
        // Quando...
        resposta = l.loginTamanho("aloualou");
        // Então...
        assertEquals("Login permitido!", resposta, true);
        
    }
    
    @Test
    public void testeSenhaTamanho(){
        // Dado que... 
        
        // Quando...
        resposta = l.senhaTamanho("aloualou");
        // Então...
        assertEquals("Login permitido!", resposta, true);
        
    }
    
}
