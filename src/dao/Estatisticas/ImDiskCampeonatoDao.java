package src.dao.Estatisticas;

import src.Excecoes.Estatisticas.CampeonatoException;
import src.dao.FIleManager;
import src.model.Estatisticas.Estat_Campeonato;

import java.util.LinkedList;

import static src.util.Constantes.*;

public class ImDiskCampeonatoDao implements Iestat_Campeonato{
    private LinkedList<Estat_Campeonato> lista;

    public ImDiskCampeonatoDao() throws CampeonatoException{
        try{
            lista = FIleManager.openCampeonato();
        }
        catch (CampeonatoException ignored){

        }
    }

    @Override
    public void save(Estat_Campeonato a) throws CampeonatoException {
        if(!lista.contains(a)){
            lista.add(a);
            FIleManager.saveCampeonato(lista);
        }
        else{
            throw new CampeonatoException(SaveError,null);
        }
    }

    @Override
    public void delete(Estat_Campeonato a) throws CampeonatoException {
        if(lista.contains(a)){
            lista.remove(a);
            FIleManager.saveCampeonato(lista);
        }
        else{
            throw new CampeonatoException(DeleteError,null);
        }
    }

    @Override
    public void update(Estat_Campeonato clubevelho, Estat_Campeonato clubenovo) throws CampeonatoException {
        if(lista.contains(clubevelho)){
            lista.remove(clubenovo);
            lista.add(clubenovo);
            FIleManager.saveCampeonato(lista);
        }
        else{
            throw new CampeonatoException(UpdateError,null);
        }
    }

    @Override
    public Estat_Campeonato find(Estat_Campeonato a) throws CampeonatoException {
        if(lista.contains(a)){
            return a;
        }
        else {
            throw new CampeonatoException(FindError,null);
        }
    }
}
