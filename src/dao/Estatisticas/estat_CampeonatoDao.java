package src.dao.Estatisticas;

import src.model.Estatisticas.Estat_Campeonato;
import src.model.Jogo.Clube;

import java.util.LinkedList;

public class estat_CampeonatoDao implements Iestat_Campeonato{
    private LinkedList<Estat_Campeonato> lista = new LinkedList<>();
    @Override
    public void save(Estat_Campeonato a) {
        if(!lista.contains(a)){
            lista.add(a);
        }
    }

    @Override
    public void delete(Estat_Campeonato a) {
        if(lista.contains(a)){
            lista.remove(a);
        }
    }

    @Override
    public void update(Estat_Campeonato clubevelho, Estat_Campeonato clubenovo) {
        if(lista.contains(clubevelho)){
            lista.remove(clubenovo);
            lista.add(clubenovo);
        }
    }

    @Override
    public Estat_Campeonato find(Estat_Campeonato a) {
        if(lista.contains(a)){
            return a;
        }
        else {
            return null;
        }
    }
}
