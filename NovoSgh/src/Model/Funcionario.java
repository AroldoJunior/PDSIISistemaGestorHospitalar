package Model;

public class Funcionario {
    
    private String nome;
    private String cpf;
    private String rg;
    private String cargo;
    private String login;
    private String senha;
    private String email;
    private String numCell;
    private String confirmarSenha;

    // Construtor
    public Funcionario(String nome, String cpf, String rg, String cargo, String senha, String email, String numCell,String confirmarSenha) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cargo = cargo;
        this.senha = senha;
        this.email = email;
        this.numCell = numCell;
        this.confirmarSenha = confirmarSenha;
        

    }

    // Metodos Set's
    public void setNome(String nome) {
        this.nome = nome;

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;

    }

    public void setRg(String rg) {
        this.rg = rg;

    }

    public void setCargo(String cargo) {
        this.cargo = cargo;

    }

    public void setLogin(String login) {
        this.login = login;

    }

    public void setSenha(String senha) {
        this.senha = senha;

    }

    public void setemail(String email) {
        this.email = email;

    }

    public void setNumCell(String numCell) {
        this.numCell = numCell;

    }
    
     public void setconfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;

    }
    // Metodos Get's

    public String getNome() {
        return nome;

    }

    public String getCpf() {
        return cpf;

    }

    public String getRg() {
        return rg;

    }

    public String getCargo() {
        return cargo;

    }

    public String getLogin() {
        return login;

    }

    public String getSenha() {
        return senha;

    }

    public String getNumCell() {
        return numCell;

    }

    public String getEmail() {
        return email;

    }
    
     public String getConfirmarSenha() {
        return confirmarSenha;

    }

}
