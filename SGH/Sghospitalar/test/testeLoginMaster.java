import View.ab_LoginMaster;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class testeLoginMaster {
    
    ab_LoginMaster l;
    boolean respostaBranco = false;
    
    public testeLoginMaster() {
    
    }
    
    @Before
    public void setUp() {
        l = new ab_LoginMaster();
        
    }
    
    @After
    public void tearDown() {
        l = null;
        
    }
    
    @Test
    public void testeLoginEmBranco(){
        // Dado que... 
        
        // Quando...
        respostaBranco = l.loginEmBranco("","");
        // Então...
        assertEquals("Nao deveria estar em branco!", respostaBranco, true);
        
    }
    
    @Test
    public void testeSenhaEmBranco(){
        // Dado que... 
        
        // Quando...
        respostaBranco = l.loginEmBranco("","");
        // Então...
        assertEquals("Nao deveria estar em branco!", respostaBranco, true);
        
    }
    
}
