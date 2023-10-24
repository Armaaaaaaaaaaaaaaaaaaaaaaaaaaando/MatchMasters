package src.model.Usuarios;

public class Adm extends Pessoa{
    private String login;

    private String senha;

    public Adm(String nome, Integer idade, String login, String senha){
        super.setNome(nome);
        super.setIdade(idade);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
