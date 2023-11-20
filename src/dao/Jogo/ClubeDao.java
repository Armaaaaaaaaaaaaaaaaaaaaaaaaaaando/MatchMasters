package src.dao.Jogo;

import src.Excecoes.Jogo.ClubeException;
import src.model.Jogo.Clube;

import java.util.LinkedList;

import static src.util.Constantes.*;

public class ClubeDao implements IClubeDao{
    private LinkedList<Clube> lista = new LinkedList<>();

    @Override
    public void save(Clube a) throws ClubeException {
        if(!lista.contains(a)){
            lista.add(a);
        }
        else{
            throw new ClubeException(SaveError, null);
        }

    }

    @Override
    public void delete(Clube a) throws ClubeException{
        if(lista.contains(a)){
            lista.remove(a);
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
        }
        else{
            throw new ClubeException(UpdateError,null);
        }
    }

    @Override
    public Clube find(Clube a) throws ClubeException{
        if(lista.contains(a)){
            return a;
        }
        else {
            throw new ClubeException(FindError,null);
        }
    }
    @Override
    public int findSize() {
        return lista.size();
    }

    @Override
    public LinkedList findAll() {
        return lista;
    }
}
