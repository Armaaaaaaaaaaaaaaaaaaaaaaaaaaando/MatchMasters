package src.dao.Usuarios;

import src.Excecoes.Usuarios.JogadorException;
import src.model.Jogo.Clube;
import src.model.Usuarios.Jogador;

public interface IJogadorDao {
    public void save(Clube c, Jogador a) throws JogadorException;
    public void delete(Clube c,Jogador a) throws JogadorException;
    public void update(Clube c,Jogador admvelho, Jogador Admnovo) throws JogadorException;
    public Jogador find(Clube c,Jogador a) throws JogadorException;
}
