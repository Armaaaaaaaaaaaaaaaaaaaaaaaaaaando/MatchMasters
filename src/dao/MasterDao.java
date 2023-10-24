package src.dao;

import src.dao.Jogo.ClubeDao;
import src.dao.Usuarios.AdmDao;
import src.dao.Usuarios.JogadorDao;
import src.dao.Usuarios.JuizDao;
import src.dao.Usuarios.TreinadorDao;


public class MasterDao {
    public static ClubeDao clubedao;
    public static AdmDao admdao;
    public static JogadorDao jogadordao;
    public static TreinadorDao treinadordao;
    public static JuizDao juizdao;



    public static ClubeDao getClubedao(){
        if (clubedao != null){
            clubedao = new ClubeDao();
        }
        return clubedao;
    }

    public static AdmDao getAdmdao(){
        if (admdao != null){
            admdao = new AdmDao();
        }
        return admdao;
    }

    public static JogadorDao getJogadordao(){
        if (jogadordao != null){
            jogadordao = new JogadorDao();
        }
        return jogadordao;
    }

    public static TreinadorDao getTreinadordao(){
        if (treinadordao != null){
            treinadordao = new TreinadorDao();
        }
        return treinadordao;
    }

    public static JuizDao getJuizdao(){
        if (juizdao != null){
            juizdao = new JuizDao();
        }
        return juizdao;
    }
}
