package src.Excecoes.Usuarios;

import src.model.Usuarios.Juiz;

public class JuizException extends Exception{
    private Juiz juiz;

    public JuizException(String excecao, Juiz juiz){
        super(excecao);
        this.juiz = juiz;
    }
}
