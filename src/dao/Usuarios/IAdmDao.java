package src.dao.Usuarios;
import src.Excecoes.Usuarios.AdmException;
import src.model.Usuarios.Adm;

public interface IAdmDao {
    public void save(Adm a) throws AdmException;
    public void delete(Adm a) throws AdmException;
    public void update(Adm admvelho, Adm Admnovo) throws AdmException;
    public Adm find(Adm a) throws AdmException;
}
