package src.Excecoes.Usuarios;

import src.model.Usuarios.Adm;
public class AdmException extends Exception{
    private Adm adm;

    public AdmException(String excecao, Adm adm){
        super(excecao);
        this.adm = adm;
    }
}
