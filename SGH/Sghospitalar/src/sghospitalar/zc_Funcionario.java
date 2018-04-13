package sghospitalar;

public class zc_Funcionario {
    
    private String nome;
    private int cpf;
    private int rg;
    private String cargo;
    private String login;
    private String senha;
    private String email;
    private String numCell;

    // Construtor
    
    public zc_Funcionario(){
        
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
    
    public void setCargo(String cargo){    
        this.cargo = cargo;
        
    }
    
    public void setLogin(String login){    
        this.login = login;
        
    }
    
    public void setSenha(String senha){    
        this.senha = senha;
        
    }
    
    public void setemail(String email){    
        this.email = email;
        
    }
    
    public void setNumCell(String numCell){    
        this.numCell = numCell;
        
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
    
    public String getCargo(){
        return cargo;
        
    }

    public String getLogin(){
        return login;
        
    }
    
    public String getSenha(){
        return senha;
        
    }
    
}