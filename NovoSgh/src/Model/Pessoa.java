package Model;

public class Pessoa {


    private String nome;
    private String cpf;
    private String rg;
    private String idade;
    private String situacao;
    private String descricao;
    private boolean possuiPlano;
    private String dataEntrada;
    private String dataSaida;
    
    
    // Construtor
    
    public Pessoa(){
        
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
    
    public void setIdade(String idade){
        this.idade = idade;
        
    }
    
    public void setSituacao(String situacao){
        this.situacao = situacao;
        
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
        
    }
    
    public void setPossuiPlano(Boolean possuiPlano){
        this.possuiPlano = possuiPlano;
        
    }
    
    public void setDataEntrada(String dataEntrada){    
        this.dataEntrada = dataEntrada;
        
    }
    
    public void setDataSaida(String dataSaida){    
        this.dataSaida = dataSaida;
        
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
    
    public String getIdade(){
        return idade;
        
    }
    
    public String getSituacao(){
        return situacao;
        
    }
    
    public String getDescricao(){
        return descricao;
        
    }
    
    public boolean getPossuiPLano(){
        return possuiPlano;
        
    }
    
    public String getDataEntrada(){
        return dataEntrada;
        
    }
    
    public String getDataSaida(){
        return dataSaida;
        
    }
    
}
    