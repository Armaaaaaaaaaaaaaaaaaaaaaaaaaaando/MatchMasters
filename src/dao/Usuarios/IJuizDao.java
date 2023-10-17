package src.dao.Usuarios;
import src.model.Usuarios.Juiz;

public interface IJuizDao {
    public void save(Juiz a);
    public void delete(Juiz a);
    public void update(Juiz admvelho, Juiz Admnovo);
    public Juiz find(Juiz a);
}
