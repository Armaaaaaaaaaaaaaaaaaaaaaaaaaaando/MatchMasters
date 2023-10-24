package src.dao.Usuarios;

import src.model.Jogo.Clube;
import src.model.Usuarios.Jogador;

public interface IJogadorDao {
    public void save(Clube c, Jogador a);
    public void delete(Clube c,Jogador a);
    public void update(Clube c,Jogador admvelho, Jogador Admnovo);
    public Jogador find(Clube c,Jogador a);
}
