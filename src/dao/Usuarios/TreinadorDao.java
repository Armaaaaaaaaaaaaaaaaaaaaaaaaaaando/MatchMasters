package src.dao.Usuarios;

import src.model.Usuarios.Treinador;

import java.util.LinkedList;

public class TreinadorDao implements ITreinadorDao{
    private LinkedList<Treinador> lista = new LinkedList<>();
    @Override
    public void save(Treinador a) {
        if(!lista.contains(a)){
            lista.add(a);
        }
    }

    @Override
    public void delete(Treinador a) {
        if(lista.contains(a)){
            lista.remove(a);
        }
    }

    @Override
    public void update(Treinador Tvelho, Treinador Tnovo) {
        if(lista.contains(Tvelho)){
            lista.remove(Tvelho);
            lista.add(Tnovo);
        }
    }

    @Override
    public Treinador find(Treinador a) {
        if(lista.contains(a)){
            return a;
        }
        else{
            return null;
        }
    }
}
