package src.model.Usuarios;

import src.Excecoes.Usuarios.AdmException;

import static src.util.Constantes.CreationAdm;

public class Adm extends Pessoa{
    private String login;

    private String senha;

    public Adm(String nome, Integer idade, String login, String senha) throws AdmException {
        try{
            super.setNome(nome);
            super.setIdade(idade);
            this.login = login;
            this.senha = senha;
        }
        catch (Exception e){
            throw new AdmException(CreationAdm, null);
        }

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
