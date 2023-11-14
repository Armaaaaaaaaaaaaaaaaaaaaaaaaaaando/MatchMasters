package src.dao.Usuarios;

import src.Excecoes.Usuarios.TreinadorException;
import src.model.Usuarios.Treinador;

public interface ITreinadorDao {
    public void save(Treinador a) throws TreinadorException;
    public void delete(Treinador a)throws TreinadorException;
    public void update(Treinador admvelho, Treinador Admnovo)throws TreinadorException;
    public Treinador find(Treinador a)throws TreinadorException;
}
