package src.dao.Usuarios;

import java.util.LinkedList;
import src.model.Usuarios.Adm;

public class AdmDao implements IAdmDao{
    LinkedList<Adm> lista = new LinkedList<Adm>();

    @Override
    public void save(Adm adm) {
        if(!lista.contains(adm)){
            lista.add(adm);
        }
    }

    @Override
    public void delete(Adm adm) {
        if(lista.contains(adm)){
            lista.remove(adm);
        }

    }

    @Override
    public void update(Adm admvelho, Adm admnovo) {
        if(lista.contains(admvelho)){
            lista.remove(admvelho);
            lista.add(admnovo);
        }
    }


    @Override
    public Adm find(Adm adm) {
        if(lista.contains(adm)){
            return adm;
        }
        else{
            return null;
        }
    }
}
