package src.dao.Usuarios;

import src.Excecoes.Usuarios.JuizException;
import src.model.Usuarios.Juiz;

import java.util.LinkedList;

import static src.util.Constantes.*;

public class JuizDao implements IJuizDao{
    LinkedList<Juiz> lista = new LinkedList<>();
    @Override
    public void save(Juiz a) throws JuizException {
        if(!lista.contains(a)){
            lista.add(a);
        }
        else throw new JuizException(SaveError, null);
    }

    @Override
    public void delete(Juiz a) throws JuizException{
        if(lista.contains(a)){
            lista.remove(a);
        }
        else throw new JuizException(DeleteError,null);
    }

    @Override
    public void update(Juiz Juizvelho, Juiz Juiznovo)throws JuizException {
        if(lista.contains(Juizvelho)){
            lista.remove(Juizvelho);
            lista.add(Juiznovo);
        }
        else throw new JuizException(UpdateError,null);
    }

    @Override
    public Juiz find(Juiz a) throws JuizException{
        if(lista.contains(a)){
            return a;
        }
        else throw new JuizException(FindError,null);
    }
}
