package src.dao.Usuarios;

import src.model.Usuarios.Treinador;

public interface ITreinadorDao {
    public void save(Treinador a);
    public void delete(Treinador a);
    public void update(Treinador admvelho, Treinador Admnovo);
    public Treinador find(Treinador a);
}
