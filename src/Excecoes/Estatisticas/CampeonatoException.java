package src.Excecoes.Estatisticas;

import src.model.Estatisticas.Estat_Campeonato;

public class CampeonatoException extends Exception{
    private Estat_Campeonato Campeonato;

    public CampeonatoException(String excecao, Estat_Campeonato Campeonato){
        super(excecao);
        this.Campeonato = Campeonato;
    }
}
