package src.Excecoes.Usuarios;

import src.model.Usuarios.Treinador;

public class TreinadorException extends Exception{
    private Treinador treinador;
    public TreinadorException(String excecao, Treinador treinador){
        super(excecao);
        this.treinador = treinador;
    }
}
