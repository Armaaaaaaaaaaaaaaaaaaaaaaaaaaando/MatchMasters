package src.dao.Usuarios;
import src.model.Usuarios.Adm;

public interface IAdmDao {
    public void save(Adm a);
    public void delete(Adm a);
    public void update(Adm admvelho, Adm Admnovo);
    public Adm find(Adm a);
}
