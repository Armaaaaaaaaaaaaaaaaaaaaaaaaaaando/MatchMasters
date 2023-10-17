package src.dao.Usuarios;

import src.model.Usuarios.Juiz;

import java.util.LinkedList;

public class JuizDao implements IJuizDao{
    LinkedList<Juiz> lista = new LinkedList<>();
    @Override
    public void save(Juiz a) {
        if(!lista.contains(a)){
            lista.add(a);
        }
    }

    @Override
    public void delete(Juiz a) {
        if(lista.contains(a)){
            lista.remove(a);
        }
    }

    @Override
    public void update(Juiz Juizvelho, Juiz Juiznovo) {
        if(lista.contains(Juizvelho)){
            lista.remove(Juizvelho);
            lista.add(Juiznovo);
        }
    }

    @Override
    public Juiz find(Juiz a) {
        if(lista.contains(a)){
            return a;
        }
        else{
            return null;
        }
    }
}
