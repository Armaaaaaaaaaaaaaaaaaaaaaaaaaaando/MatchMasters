package src.dao.Usuarios;

import src.Excecoes.Usuarios.JogadorException;
import src.Excecoes.Usuarios.TreinadorException;
import src.dao.FIleManager;
import src.dao.MasterDao;
import src.model.Jogo.Clube;
import src.model.Usuarios.Jogador;
import src.model.Usuarios.Treinador;

import java.util.HashMap;
import java.util.LinkedList;

import static src.util.Constantes.*;
import static src.util.Constantes.DeleteError;

public class ImDiskJogadorDao implements IJogadorDao{
    private LinkedList<Jogador> jogadores = new LinkedList<>();
    private HashMap<String, LinkedList> lista = new HashMap<>();

    private Clube c;
    public ImDiskJogadorDao() throws JogadorException{
        try{
            this.lista = FIleManager.openJogador();
        }catch (JogadorException ignored){

        }
    }

    @Override
    public void save(Clube c, Jogador a) throws JogadorException {
        if(lista.containsKey(c.getNome())){
            if(!lista.values().contains(a)){
                jogadores.add(a);
                lista.put(c.getNome(),jogadores);
                FIleManager.saveJogador(lista);
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
    public void delete(Clube c, Jogador a) throws JogadorException {
        if(lista.containsKey(c.getNome())){
            if(lista.values().contains(a)){
                lista.values().remove(a);
                FIleManager.saveJogador(lista);

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
    public void update(Clube c, Jogador Jogadorvelho, Jogador Jogadornovo) throws JogadorException {
        if (lista.containsKey(c.getNome())){
            if(lista.values().contains(Jogadorvelho)){
                lista.values().remove(Jogadorvelho);
                jogadores.add(Jogadornovo);
                lista.put(c.getNome(),jogadores);
                FIleManager.saveJogador(lista);
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
    public Jogador find(Clube c, Jogador a) throws JogadorException {
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
