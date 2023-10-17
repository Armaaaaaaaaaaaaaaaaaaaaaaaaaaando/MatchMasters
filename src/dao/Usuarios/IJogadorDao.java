package src.dao.Usuarios;

import src.model.Usuarios.Jogador;

public interface IJogadorDao {
    public void save(Jogador a);
    public void delete(Jogador a);
    public void update(Jogador admvelho, Jogador Admnovo);
    public Jogador find(Jogador a);
}
