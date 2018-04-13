package sghospitalar;

public class zc_Pessoa {
    
    private String nome;
    private int cpf;
    private int rg;
    private String situacao;
    private String descricao;
    private boolean possuiPlano;
    private String dataEntrada;
    private String dataSaida;
    
    // Construtor
    
    public zc_Pessoa(){
        
    }
    
    // Metodos Set's
    
    public void setNome(String nome){    
        this.nome = nome;
        
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
        
    }
    
    public void setRg(int rg){
        this.rg = rg;
        
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
    
    public int getCpf(){
        return cpf;
        
    }
    
    public int getRg(){
        return rg;
        
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