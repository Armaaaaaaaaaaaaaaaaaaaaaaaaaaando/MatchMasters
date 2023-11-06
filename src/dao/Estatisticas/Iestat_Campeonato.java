package src.dao.Estatisticas;

import src.model.Estatisticas.Estat_Campeonato;
import src.model.Jogo.Clube;

import java.util.LinkedList;

public interface Iestat_Campeonato {
    public void save(Estat_Campeonato a);
    public void delete(Estat_Campeonato a);
    public void update(Estat_Campeonato clubevelho, Estat_Campeonato clubenovo);
    public Estat_Campeonato find(Estat_Campeonato a);


}
