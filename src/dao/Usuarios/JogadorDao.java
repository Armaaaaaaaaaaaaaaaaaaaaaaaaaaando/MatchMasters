package src.dao.Usuarios;

import src.Excecoes.Usuarios.JogadorException;
import src.model.Jogo.Clube;
import src.model.Usuarios.Jogador;

import java.util.HashMap;
import java.util.LinkedList;

import static src.util.Constantes.*;

public class JogadorDao implements IJogadorDao{
    private Clube c;
    private LinkedList<Jogador> jogadores = new LinkedList<>();
    private HashMap<String, LinkedList> lista = new HashMap<>();

    @Override
    public void save(Clube clube, Jogador a) throws JogadorException {
        if(lista.containsKey(clube.getNome())){
            if(!lista.values().contains(a)){
                jogadores.add(a);
                lista.put(clube.getNome(),jogadores);
            }
            else{
                throw new JogadorException(SaveError, null);
            }
        }
        else{
            throw new JogadorException(SaveError, null);
        }
    }

    @Override
    public void delete(Clube c,Jogador a) throws JogadorException{
        if(lista.containsKey(c.getNome())){
            if(lista.values().contains(a)){
                lista.values().remove(a);
            }
            else{
                throw new JogadorException(DeleteError, null);
            }
        }
        else{
            throw new JogadorException(DeleteError, null);
        }
    }

    @Override
    public void update(Clube c,Jogador Jogadorvelho, Jogador Jogadornovo) throws JogadorException{
        if (lista.containsKey(c.getNome())){
            if(lista.values().contains(Jogadorvelho)){
                lista.values().remove(Jogadorvelho);
                jogadores.add(Jogadornovo);
                lista.put(c.getNome(),jogadores);
            }
            else{
                throw new JogadorException(UpdateError,null);
            }
        }
        else{
            throw new JogadorException(UpdateError,null);
        }
    }

    @Override
    public Jogador find(Clube c,Jogador a) throws JogadorException{
        if(lista.containsKey(c.getNome())){
            if(lista.values().contains(a)){
                return a;
            }
            else{
                throw new JogadorException(FindError,null);
            }
        }
        else{
            throw new JogadorException(FindError,null);
        }
    }
}
