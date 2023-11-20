package src.dao.Jogo;


import src.Excecoes.Jogo.ClubeException;
import src.model.Jogo.Clube;

import java.util.LinkedList;

public interface IClubeDao {
    public void save(Clube a) throws ClubeException;
    public void delete(Clube a)throws ClubeException;
    public void update(Clube clubevelho, Clube clubenovo)throws ClubeException;
    public Clube find(Clube a)throws ClubeException;
    public int findSize()throws ClubeException;
    public LinkedList findAll()throws ClubeException;
}

