/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Funcionario;
import View.telaCadastroFuncionario;
import View.telaLoginMaster;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gemeos
 */
public class Cdastra {
    
     telaCadastroFuncionario l;
    boolean resposta = false;
    private String nome="Mateus";
    private String cpf="05983311315";
    private String rg="3093348";
    private String cargo="Atendente";
    private String login="";
    private String senha="ferreira";
    private String email="eduardo-silvarocha@hotmail.com";
    private String numCell="89981040935";

    
    public Cdastra() {
    }
    
    
    
   
    @Before
    public void setUp() {
        l = new telaCadastroFuncionario();
        
    }
    
    @After
    public void tearDown() {
        l = null;
        
    }
    
      @Test
    public void campoVazioNomeCompleto(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    "",
                    cpf,
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getNome());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
      
        
    }
    
    @Test
    public void campoVazioCpf(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    "",
                    rg,
                    cargo,
                    senha,
                    email,
                    numCell
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
    }
    @Test
    public void campoVazioRg(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    "",
                    cargo,
                    senha,
                    email,
                    numCell
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getRg());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
    }
    @Test
    public void campoVazioCargo(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    "",
                    senha,
                    email,
                    numCell
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getCargo());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
    }
    
     @Test
    public void campoVazioSenha(){
        // Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    "",
                    email,
                    numCell
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getSenha());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
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
                    ""
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getNumCell());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
    }
    @Test
    public void campoVazioEmail(){// Dado que... 
        Funcionario funcionario = new Funcionario(
                    nome,
                    cpf,
                    rg,
                    cargo,
                    senha,
                    "",
                    numCell
            );
        // Quando...
        resposta = l.campoEmBranco(funcionario.getEmail());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
        
    }

    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

