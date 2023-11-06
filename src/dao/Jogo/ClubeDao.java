package src.dao.Jogo;

import src.model.Jogo.Clube;

import java.util.LinkedList;

public class ClubeDao implements IClubeDao{
    private LinkedList<Clube> lista = new LinkedList<>();

    @Override
    public void save(Clube a) {
        if(!lista.contains(a)){
            lista.add(a);
        }
    }

    @Override
    public void delete(Clube a) {
        if(lista.contains(a)){
            lista.remove(a);
        }
    }

    @Override
    public void update(Clube clubevelho, Clube clubenovo) {
        if(lista.contains(clubevelho)){
            lista.remove(clubenovo);
            lista.add(clubenovo);
        }
    }

    @Override
    public Clube find(Clube a) {
        if(lista.contains(a)){
            return a;
        }
        else {
            return null;
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
