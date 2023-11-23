package src.dao.Usuarios;

import java.util.LinkedList;

import src.Excecoes.Usuarios.AdmException;
import src.dao.FIleManager;
import src.dao.MasterDao;
import src.model.Usuarios.Adm;

import static src.util.Constantes.*;

public class AdmDao implements IAdmDao{
    private LinkedList<Adm> lista = new LinkedList<Adm>();


    @Override
    public void save(Adm adm) throws AdmException {
        if(lista.contains(adm)){
            throw new AdmException(SaveError, MasterDao.getAdmdao().find(adm));
        }
        else{
            adm = new Adm(adm.getNome(),adm.getIdade(),adm.getLogin(),adm.getSenha());
            lista.add(adm);
            FIleManager.saveAdm(this.lista);
        }
    }

    @Override
    public void delete(Adm adm) throws AdmException{
        if(lista.contains(adm)){
            lista.remove(adm);
        }
        else{
            throw new AdmException(DeleteError,null);
        }

    }

    @Override
    public void update(Adm admvelho, Adm admnovo) throws AdmException{
        if(lista.contains(admvelho)){
            lista.remove(admvelho);
            lista.add(admnovo);
        }
        else{
            throw new AdmException(UpdateError,null);
        }
    }


    @Override
    public Adm find(Adm adm) throws AdmException{
        if(lista.contains(adm)){
            return adm;
        }
        else{
            throw new AdmException(FindError,null);
        }
    }
}
