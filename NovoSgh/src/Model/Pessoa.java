package Model;

public class Pessoa {


    private String nome;
    private String cpf;
    private String rg;
    private String situacao;
    private String descricao;
    private String Plano;
    private String dataEntrada;
    private String dataSaida;
    private String numcell;
    private String DataNascimento;
    
    // Construtor
   
    
    public Pessoa(String nome, String cpf, String rg, String Plano, String DataNascimento, String numcell, String descricao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.Plano = Plano;
        this.DataNascimento = DataNascimento;
        this.numcell = numcell;
        this.descricao = descricao;
       
    }
    
    
    
    
    
    // Metodos Set's
    
    public void setNome(String nome){    
        this.nome = nome;
        
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
        
    }
    
    public void setRg(String rg){
        this.rg = rg;
        
    }
    
    public void setSituacao(String situacao){
        this.situacao = situacao;
        
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
        
    }
    
    public void setPlano(String Plano){
        this.Plano = Plano;
        
    }
    
    public void setDataEntrada(String dataEntrada){    
        this.dataEntrada = dataEntrada;
        
    }
    
    public void setDataSaida(String dataSaida){    
        this.dataSaida = dataSaida;
        
    }
    
    public void setNumcell(String numcell){    
        this.numcell = numcell;
        
    }
    
    // Metodos Get's
    
    public String getNome(){
        return nome;
        
    }
    
    public String getCpf(){
        return cpf;
        
    }
    
    public String getRg(){
        return rg;
        
    }
    
    public String getSituacao(){
        return situacao;
        
    }
    
    public String getDescricao(){
        return descricao;
        
    }
    
    public String getPlano(){
        return Plano;
        
    }
    
    public String getDataNascimento(){
        return DataNascimento;
        
    }
    
    public String getNumcell(){
        return numcell;
        
    }
    
}
    