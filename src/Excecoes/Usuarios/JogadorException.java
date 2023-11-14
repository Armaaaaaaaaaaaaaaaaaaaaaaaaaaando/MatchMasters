package src.Excecoes.Usuarios;

import src.model.Usuarios.Jogador;

public class JogadorException extends Exception{
    private Jogador jogador;

    public JogadorException(String excecao, Jogador jogador){
        super(excecao);
        this.jogador = jogador;
    }
}
