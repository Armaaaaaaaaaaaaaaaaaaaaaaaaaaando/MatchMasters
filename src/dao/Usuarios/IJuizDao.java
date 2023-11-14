package src.dao.Usuarios;
import src.Excecoes.Usuarios.JuizException;
import src.model.Usuarios.Juiz;

public interface IJuizDao {
    public void save(Juiz a) throws JuizException;
    public void delete(Juiz a)throws JuizException;
    public void update(Juiz admvelho, Juiz Admnovo)throws JuizException;
    public Juiz find(Juiz a)throws JuizException;
}
