/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;
import Implementação.zc_EnviaDados_Banco_Funcionario;
import View.bc_CadastroFunc;
import BancoDeDados.zc_Banco_de_Dados;
import Implementação.zc_Funcionario;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 *
 * @author CABRUTO
 */
public class CadastroTest {
    
    private zc_EnviaDados_Banco_Funcionario zz;
    private bc_CadastroFunc bc;
    private zc_Banco_de_Dados zc;
    private zc_Funcionario setGet;
    
    @Before
    public void setup() {
        zz = new zc_EnviaDados_Banco_Funcionario();
        bc = new bc_CadastroFunc();
        zc = new zc_Banco_de_Dados();
        
    }
    
    @After
    public void teardown() {
        zz = null;
        bc = null; 
        zc = null;
        
    }
     
    @Test
    public void TestarExcluir(){
        assertTrue("Excluido com sucesso!", zz.Deletar(2));
        
    }
    
    @Test
    public void TestarExcluirErro(){
        assertFalse("Erro ao excluir!", zz.Deletar(2));
        
    }
    
    @Test
    public void campoVazioNomeCompleto(){
        setGet.setNome("Eduardo Rocha");
        
        new bc_CadastroFunc();
        
        assertTrue("Campo Vazio!", bc.campoVazioString(setGet.getNome()));
        
    }
    @Test
    public void campoVazioCpf(){
        setGet.setCpf(594326330);
        
        new bc_CadastroFunc();
        
        assertTrue("Campo Vazio!", bc.campoVazioInt(setGet.getCpf()));
    }
    @Test
    public void campoVazioRg(){
        setGet.setRg(1234652);
        
        new bc_CadastroFunc();
        
        assertTrue("Campo Vazio!", bc.campoVazioInt(setGet.getRg()));
    }
    @Test
    public void campoVazioCargo(){
        setGet.setCargo("Atendente");
        
        new bc_CadastroFunc();
        
        assertTrue("Campo Vazio!", bc.campoVazioString(setGet.getCargo()));
        
    }
    @Test
    public void campoVazioTelefone(){
        setGet.setNumCell("89981040945");
        
        new bc_CadastroFunc();
        
        assertTrue("Campo Vazio!", bc.campoVazioString(setGet.getNumCell()));
    }
    @Test
    public void campoVazioEmail(){
        setGet.setemail("mateus-ferreira@hotmail.com");
        
        new bc_CadastroFunc();
        
        assertTrue("Campo Vazio!", bc.campoVazioString(setGet.getEmail()));
    }
    public void campoCompleto(){
        // Já Configurados 
        
        new bc_CadastroFunc();
        
        assertTrue("Campos Completos!", bc.campoCompleto(setGet.getNome(),setGet.getCpf(),setGet.getRg(),setGet.getCargo(),setGet.getNumCell(),setGet.getEmail()));
    }
    
    public void nomeSemNumero(){
        setGet.setNome("Eduardo Rocha");
        
        new bc_CadastroFunc();
        
        assertTrue("Sem Numeros!", bc.conterNumeros(setGet.getNome()));
        
    }
    
    public void cargoSemNumero(){
        setGet.setCargo("gerente");
        
        new bc_CadastroFunc();
        
        assertTrue("Sem Numeros!", bc.conterNumeros(setGet.getCargo()));
        
    }
    
    public void cpfSemLetras(){
        setGet.setCpf(594326330);
        
        new bc_CadastroFunc();
        
        assertTrue("Nao contem numeros!", bc.semConterNumeros(setGet.getCpf()));
    }
    @Test
    public void RgSemLetras(){
        setGet.setRg(1234652);
        
        new bc_CadastroFunc();
        
        assertTrue("Nao contem numeros!", bc.semConterNumeros(setGet.getRg()));
    }
    
    public void cpfOnzeNumeros(){ //Só aceita 10
        setGet.setCpf(594326330);
        
        new bc_CadastroFunc();
        
        assertTrue("CPF correto!", bc.cpfNumerosSize(setGet.getCpf()));
    }
    
        
    public void rgNoveNumeros(){ //Só aceita 10
        setGet.setRg(9432630);
        
        new bc_CadastroFunc();
        
        assertTrue("RG correto!", bc.rgNumerosSize(setGet.getRg()));
    }
    
    @Test
    public void telefoneSemEspaço(){
        setGet.setNumCell("89981040945");
        
        new bc_CadastroFunc();
        
        assertTrue("Telefone Sem Espaços!", bc.campoSemEspaco(setGet.getNumCell()));
    }
    
    @Test
    public void emailSemEspaço(){
        setGet.setemail("mateus-ferreira@hotmail.com");
        
        new bc_CadastroFunc();
        
        assertTrue("Email Sem Espaços!", bc.campoSemEspaco(setGet.getEmail()));
    }
    
    public void nomeSemCaracteresEspeciais(){
        setGet.setNome("Eduardo Rocha");
        
        new bc_CadastroFunc();
        
        assertTrue("Nome Sem Caracteres Especiais!", bc.semConterCaracteresEspeciais(setGet.getNome()));
        
    }
    
    @Test
    public void cargoSemCaracteresEspeciais(){
        setGet.setCargo("Atendente");
        
        new bc_CadastroFunc();
        
        assertTrue("Cargo Sem Caracteres Especiais!", bc.semConterCaracteresEspeciais(setGet.getCargo()));
        
    }
    @Test
    public void telefoneSemCaracteresEspeciais(){
        setGet.setNumCell("89981040945");
        
        new bc_CadastroFunc();
        
        assertTrue("Telefone Sem Caracteres Especiais!", bc.semConterCaracteresEspeciais(setGet.getNumCell()));
    }
    
    public void emailEstruturado(){
        setGet.setemail("mateus-ferreira@hotmail.com");
        
        new bc_CadastroFunc();
        
        assertTrue("Email Correto!", bc.emailEstrutura(setGet.getEmail()));
    }
    

    
    
    
    
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

