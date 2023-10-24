package src.dao.Jogo;


import src.model.Jogo.Clube;

public interface IClubeDao {
    public void save(Clube a);
    public void delete(Clube a);
    public void update(Clube clubevelho, Clube clubenovo);
    public Clube find(Clube a);
}
