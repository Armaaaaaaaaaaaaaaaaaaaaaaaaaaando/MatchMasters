package src.dao.Jogo;

import src.Excecoes.Jogo.ClubeException;
import src.dao.FIleManager;
import src.model.Jogo.Clube;

import java.util.LinkedList;

import static src.util.Constantes.*;

public class ImDiskClubeDao implements IClubeDao{
    private LinkedList<Clube> lista;
    public ImDiskClubeDao() throws ClubeException{
        try{
            lista = FIleManager.openClube();
        }
        catch (ClubeException ignored){

        }
    }


    @Override
    public void save(Clube a) throws ClubeException {
        if(!lista.contains(a)){
            lista.add(a);
            FIleManager.saveClube(lista);
        }
        else{
            throw new ClubeException(SaveError, null);
        }
    }

    @Override
    public void delete(Clube a) throws ClubeException {
        if(lista.contains(a)){
            lista.remove(a);
            FIleManager.saveClube(lista);
        }
        else{
            throw new ClubeException(DeleteError,null);
        }
    }

    @Override
    public void update(Clube clubevelho, Clube clubenovo) throws ClubeException {
        if(lista.contains(clubevelho)){
            lista.remove(clubenovo);
            lista.add(clubenovo);
            FIleManager.saveClube(lista);
        }
        else{
            throw new ClubeException(UpdateError,null);
        }
    }

    @Override
    public Clube find(Clube a) throws ClubeException {
        if(lista.contains(a)){
            return a;
        }
        else {
            throw new ClubeException(FindError,null);
        }
    }

    @Override
    public int findSize() throws ClubeException {
        return lista.size();
    }

    @Override
    public LinkedList findAll() throws ClubeException {
        return lista;
    }
}
