package src.dao.Usuarios;

import src.model.Jogo.Clube;
import src.model.Usuarios.Jogador;

import java.util.HashMap;
import java.util.LinkedList;

public class JogadorDao implements IJogadorDao{
    private Clube c;
    private LinkedList<Jogador> jogadores = new LinkedList<>();
    private HashMap<String, LinkedList> lista = new HashMap<>();

    @Override
    public void save(Clube clube, Jogador a) {
        if(lista.containsKey(clube.getNome())){
            if(!lista.values().contains(a)){
                jogadores.add(a);
                lista.put(clube.getNome(),jogadores);
            }
        }
    }

    @Override
    public void delete(Clube c,Jogador a) {
        if(lista.containsKey(c.getNome())){
            if(lista.values().contains(a)){
                lista.values().remove(a);
            }
        }
    }

    @Override
    public void update(Clube c,Jogador Jogadorvelho, Jogador Jogadornovo) {
        if (lista.containsKey(c.getNome())){
            if(lista.values().contains(Jogadorvelho)){
                lista.values().remove(Jogadorvelho);
                jogadores.add(Jogadornovo);
                lista.put(c.getNome(),jogadores);
            }
        }
    }

    @Override
    public Jogador find(Clube c,Jogador a) {
        if(lista.containsKey(c.getNome())){
            if(lista.values().contains(a)){
                return a;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }
}
