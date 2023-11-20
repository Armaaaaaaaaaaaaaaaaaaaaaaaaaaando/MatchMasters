package src.dao.Estatisticas;

import src.Excecoes.Estatisticas.CampeonatoException;
import src.model.Estatisticas.Estat_Campeonato;
import src.model.Jogo.Clube;

import java.util.LinkedList;

public interface Iestat_Campeonato {
    public void save(Estat_Campeonato a) throws CampeonatoException;
    public void delete(Estat_Campeonato a)throws CampeonatoException;
    public void update(Estat_Campeonato clubevelho, Estat_Campeonato clubenovo)throws CampeonatoException;
    public Estat_Campeonato find(Estat_Campeonato a)throws CampeonatoException;


}
