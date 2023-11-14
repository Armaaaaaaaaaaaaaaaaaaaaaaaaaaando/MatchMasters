package src.Excecoes.Jogo;

import src.model.Jogo.Partida;

public class PartidaException extends Exception{
    private Partida partida;

    public PartidaException(String excecao, Partida partida){
        super(excecao);
        this.partida = partida;
    }
}
