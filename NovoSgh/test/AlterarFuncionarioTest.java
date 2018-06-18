/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controller.blindagensCadastrarfuncionario;
import Model.Funcionario;
//import View.telaLoginMaster;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gemeos
 */
public class AlterarFuncionarioTest {
    
    blindagensCadastrarfuncionario l;
    
    boolean resposta = false;
    private String nome="Mateus";
    private String cpf="0598331131";
    private String rg="3093348";
    private String cargo="Atendente";
    private String login="";
    private String senha="ferreira";
    private String confirmarSenha = "ferreira";
    private String email="eduardo-silvarocha@hotmail.com";
    private String numCell="89981040935";

    
    public AlterarFuncionarioTest() {
    }
    
    
    
   
    @Before
    public void setUp() {
        l = new blindagensCadastrarfuncionario();
        
    }
    
    @After
    public void tearDown() {
        l = null;
        
    }
    
      @Test
    
    public void campoVazioNomeCompleto(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getNome());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
      
        
    }
    
    @Test
    public void campoVazioCpf(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    @Test
    public void campoVazioRg(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getRg());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    @Test
    public void campoVazioCargo(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getCargo());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    
     @Test
    public void campoVazioSenha(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getSenha());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    @Test
    public void campoVazioTelefone(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getNumCell());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    
     @Test
    public void TelefoneSemCaracteresEspeciais(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoNaoTemCaracteresEspeciais(funcionario.getNumCell());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    
     @Test
    public void TelefoneSemEspaco(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoSemEspaco(funcionario.getNumCell());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    
    @Test
    public void campoVazioEmail(){// Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getEmail());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
     @Test
    public void campoVazioConfirmarSenha(){// Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getConfirmarSenha());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    
    @Test
    public void nomeSemNumero(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.conterNumeros(funcionario.getNome());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
        
    }
    @Test
    public void cargoSemNumero(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.conterNumeros(funcionario.getCargo());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
        
    }
    
    @Test
    public void cpfSemLetras(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.conterNumeros(funcionario.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
    }
    
    @Test
    public void cpfOnzeNumeros(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.cpfNumerosSize(funcionario.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    
    @Test
    public void cpfSizeMenor(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.cpfNumerosSizeMenor(funcionario.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
    }
    
    @Test
    public void rgNoveNumeros(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.rgNumerosSize(funcionario.getRg());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
    }
    
    @Test
    public void cpfContemLetras(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.contemLetras(funcionario.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    
    @Test
    public void rgContemLetras(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.contemLetras(funcionario.getRg());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    
    @Test
    public void cpfSemEspaco(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoSemEspaco(funcionario.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    
    @Test
    public void rgSemEspaco(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoSemEspaco(funcionario.getRg());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    
     @Test
    public void senhaSemEspaco(){
       Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoSemEspaco(funcionario.getSenha());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    
    public void EmailSemEspaco(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoSemEspaco(funcionario.getEmail());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
        
    }
    @Test
    public void nomeSemCaracteresEspeciais(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoNaoTemCaracteresEspeciais(funcionario.getNome());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
    }
    
    @Test
    public void cpfSemCaracteresEspeciais(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoNaoTemCaracteresEspeciais(funcionario.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
    }
    
    @Test
    public void rgSemCaracteresEspeciais(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoNaoTemCaracteresEspeciais(funcionario.getRg());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
    }
    
    @Test
    public void CargoSemCaracteresEspeciais(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoNaoTemCaracteresEspeciais(funcionario.getCargo());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
    }
    
    @Test
    public void numSemCaracteresEspeciais(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoNaoTemCaracteresEspeciais(funcionario.getNumCell());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
    }
    @Test
    public void emailEstruturado(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.emailEstrutura(funcionario.getEmail());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
    }
    @Test
     public void nomeMinimoSize3(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoSize3(funcionario.getNome());
        // EntÃƒÂ£o...
        assertEquals("Nome com minimo 3 letras!", resposta, true);
        
    }
     
     @Test
     public void CargoMinimoSize3(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoSize3(funcionario.getCargo());
        // EntÃƒÂ£o...
        assertEquals("Nome com minimo 3 letras!", resposta, true);
        
    }
     
    @Test
     public void EmailMinimoSize3(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.campoSize3(funcionario.getEmail());
        // EntÃƒÂ£o...
        assertEquals("Nome com minimo 3 letras!", resposta, true);
        
    }
    
     @Test
     public void ConfirmarSenha(){
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell,
                    confirmarSenha
            );
        // Quando...
        resposta = l.confirmarSenha(funcionario.getSenha(),funcionario.getConfirmarSenha());
        // EntÃƒÂ£o...
        assertEquals("Nao deveria estar em branco!", resposta, true);
    }
    
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CABRUTO
 */

