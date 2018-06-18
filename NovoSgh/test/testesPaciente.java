
import Controller.blindagensCadastrarpaciente;
import Model.Funcionario;
import Model.Pessoa;
//import View.telaLoginMaster;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class testesPaciente {

    blindagensCadastrarpaciente l;

    boolean resposta = false;
    private String nome = "Mateus";
    private String cpf = "0598331131";
    private String rg = "3093348";
    private String nascimento = "Atendente";
    private String numCell = "89981040935";
    private String Plano = "Estudante";
    private String descrição = "hdshbhsbhsbhdbshj";

    public testesPaciente() {
    }

    @Before
    public void setUp() {
        l = new blindagensCadastrarpaciente();

    }

    @After
    public void tearDown() {
        l = null;

    }

    @Test

    public void campoVazioNomeCompleto() {
        // Dado que... 
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoEmBranco(pessoa.getNome());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void nomeSemNumero() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.conterNumeros(pessoa.getNome());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void nomeMinimoSize3() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoSize3(pessoa.getNome());
        // EntÃƒÂ£o...
        assertEquals("Nome com minimo 3 letras!", resposta, true);

    }

    @Test
    public void nomeSemCaracteresEspeciais() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoNaoTemCaracteresEspeciais(pessoa.getNome());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);
    }

    //CPF//
    @Test
    public void campoVazioCpf() {
        // Dado que... 
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoEmBranco(pessoa.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void cpfSemLetras() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.conterNumeros(pessoa.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);

    }

    @Test
    public void cpfOnzeNumeros() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.cpfNumerosSize(pessoa.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void cpfSizeMenor() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.cpfNumerosSizeMenor(pessoa.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);

    }

    @Test
    public void cpfSizeMaior() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.cpfNumerosSizeMaior(pessoa.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void cpfSemEspaco() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoSemEspaco(pessoa.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void cpfSemCaracteresEspeciais() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoNaoTemCaracteresEspeciais(pessoa.getCpf());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    //RG//
    @Test
    public void campoVazioRg() {
        // Dado que... 
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoEmBranco(pessoa.getRg());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void rgNoveNumeros() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.rgNumerosSize(pessoa.getRg());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);

    }

    @Test
    public void rgContemLetras() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.contemLetras(pessoa.getRg());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void rgSemEspaco() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoSemEspaco(pessoa.getRg());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void rgSemCaracteresEspeciais() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoNaoTemCaracteresEspeciais(pessoa.getRg());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
    }

    //Data Nascimento
    @Test
    public void campoVazioDataNascimento() {
        // Dado que... 
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoEmBranco(pessoa.getDataNascimento());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void DataNascimentoSemCaracteresEspeciais() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoNaoTemCaracteresEspeciais(pessoa.getDataNascimento());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);
    }

    @Test
    public void DataNascimentoMinimoSize3() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoSize3(pessoa.getDataNascimento());
        // EntÃƒÂ£o...
        assertEquals("Data Nascimento com minimo 3 letras!", resposta, true);

    }

    @Test
    public void DataNascimentoSemEspaco() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoSemEspaco(pessoa.getDataNascimento());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    //Telefone
    @Test
    public void campoVazioTelefone() {
        // Dado que... 
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoEmBranco(pessoa.getNumcell());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void TelefoneSemCaracteresEspeciais() {
        // Dado que... 
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoNaoTemCaracteresEspeciais(pessoa.getNumcell());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, true);

    }

    @Test
    public void TelefoneSemEspaco() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoSemEspaco(pessoa.getNumcell());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    //Plano de Saude//
    @Test
    public void PlanodeSaudeVazioTelefone() {
        // Dado que... 
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoEmBranco(pessoa.getPlano());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    //Descrição//
    @Test

    public void DescriçãoVazioNomeCompleto() {
        // Dado que... 
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoEmBranco(pessoa.getDescricao());
        // Então...
        assertEquals("Nao deveria estar em branco!", resposta, false);

    }

    @Test
    public void DescriçãoMinimoSize3() {
        Pessoa pessoa = new Pessoa(
                nome,
                cpf,
                rg,
                nascimento,
                numCell,
                Plano,
                descrição
        );
        // Quando...
        resposta = l.campoSize3(pessoa.getDescricao());
        // EntÃƒÂ£o...
        assertEquals("Nome com minimo 3 letras!", resposta, true);

    }

}
