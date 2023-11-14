package src.dao.Usuarios;

import src.Excecoes.Usuarios.TreinadorException;
import src.model.Usuarios.Treinador;

import java.util.LinkedList;

import static src.util.Constantes.*;

public class TreinadorDao implements ITreinadorDao{
    private LinkedList<Treinador> lista = new LinkedList<>();
    @Override
    public void save(Treinador a)throws TreinadorException {
        if(!lista.contains(a)){
            lista.add(a);
        }
        else throw new TreinadorException(SaveError,null);
    }

    @Override
    public void delete(Treinador a) throws TreinadorException{
        if(lista.contains(a)){
            lista.remove(a);
        }
        else throw new TreinadorException(DeleteError,null);
    }

    @Override
    public void update(Treinador Tvelho, Treinador Tnovo) throws TreinadorException{
        if(lista.contains(Tvelho)){
            lista.remove(Tvelho);
            lista.add(Tnovo);
        }else throw new TreinadorException(UpdateError,null);
    }

    @Override
    public Treinador find(Treinador a) throws TreinadorException{
        if(lista.contains(a)){
            return a;
        }
        else throw new TreinadorException(FindError,null);
    }
}
