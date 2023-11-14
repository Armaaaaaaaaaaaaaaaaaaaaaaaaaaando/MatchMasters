package src.Excecoes.Jogo;

import src.model.Jogo.Clube;

public class ClubeException extends Exception{
    private Clube clube;

    public ClubeException(String excecao, Clube clube){
        super(excecao);
        this.clube = clube;
    }
}
