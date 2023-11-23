package src.dao.Usuarios;

import src.Excecoes.Usuarios.AdmException;
import src.dao.FIleManager;
import src.dao.MasterDao;
import src.model.Usuarios.Adm;

import java.util.LinkedList;

import static src.util.Constantes.*;

public class ImDiskAdmDao implements IAdmDao{
    private LinkedList<Adm> lista;
    public ImDiskAdmDao(){
        try{
            this.lista = FIleManager.openAdm();
        }catch (AdmException ignored){

        }
    }

    @Override
    public void save(Adm a) throws AdmException {
        if(lista.contains(a)){
            throw new AdmException(SaveError, MasterDao.getAdmdao().find(a));
        }
        else{
            Adm adm = new Adm(a.getNome(),a.getIdade(),a.getLogin(),a.getSenha());
            lista.add(adm);
            FIleManager.saveAdm(this.lista);
        }
    }

    @Override
    public void delete(Adm a) throws AdmException {
        if(lista.contains(a)){
            lista.remove(a);
            FIleManager.saveAdm(this.lista);
        }
        else{
            throw new AdmException(DeleteError,null);
        }
    }

    @Override
    public void update(Adm admvelho, Adm Admnovo) throws AdmException {
        if(lista.contains(admvelho)){
            lista.remove(admvelho);
            lista.add(Admnovo);
            FIleManager.saveAdm(this.lista);
        }
        else{
            throw new AdmException(UpdateError,null);
        }
    }

    @Override
    public Adm find(Adm a) throws AdmException {
        if(lista.contains(a)){
            return a;
        }
        else{
            throw new AdmException(FindError,null);
        }
    }
}
