package src.dao.Usuarios;

import src.model.Usuarios.Jogador;

import java.util.LinkedList;

public class JogadorDao implements IJogadorDao{
    private LinkedList<Jogador> lista = new LinkedList<>();
    @Override
    public void save(Jogador a) {
        if(!lista.contains(a)){
            lista.add(a);
        }
    }

    @Override
    public void delete(Jogador a) {
        if(lista.contains(a)){
            lista.remove(a);
        }
    }

    @Override
    public void update(Jogador Jogadorvelho, Jogador Jogadornovo) {
        if(lista.contains(Jogadorvelho)){
            lista.remove(Jogadorvelho);
            lista.add(Jogadornovo);
        }
    }

    @Override
    public Jogador find(Jogador a) {
        if(lista.contains(a)){
            return a;
        }
        else{
            return null;
        }
    }
}
