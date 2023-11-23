package src.dao;

import src.Excecoes.Estatisticas.CampeonatoException;
import src.Excecoes.Jogo.ClubeException;
import src.Excecoes.Usuarios.AdmException;
import src.Excecoes.Usuarios.JogadorException;
import src.Excecoes.Usuarios.JuizException;
import src.Excecoes.Usuarios.TreinadorException;
import src.model.Estatisticas.Estat_Campeonato;
import src.model.Jogo.Clube;
import src.model.Usuarios.Adm;
import src.model.Usuarios.Jogador;
import src.model.Usuarios.Juiz;
import src.model.Usuarios.Treinador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import static src.util.Constantes.SaveError;

public class FIleManager {
    public static void genaratecache() throws AdmException, JogadorException, JuizException, TreinadorException, ClubeException, CampeonatoException {
        if(!(new File("Cache")).exists()){
            File file = new File("cache");
            if(!file.exists()){
                file.mkdir();
            }
        }

        if(!(new File("cache\\Adm.dat")).exists()){
            FIleManager.saveAdm(new LinkedList<Adm>());
        }
        if(!(new File("cache\\Jogador.dat")).exists()){
            FIleManager.saveJogador(new LinkedList<Jogador>());
        }
        if(!(new File("cache\\Juiz.dat")).exists()){
            FIleManager.saveJuiz(new LinkedList<Juiz>());
        }
        if(!(new File("cache\\Treinador.dat")).exists()){
            FIleManager.saveTreinador(new LinkedList<Treinador>());
        }
        if(!(new File("cache\\Clube.dat")).exists()){
            FIleManager.saveClube(new LinkedList<Clube>());
        }
        if(!(new File("cache\\Campeonato.dat")).exists()){
            FIleManager.saveCampeonato(new LinkedList<Estat_Campeonato>());
        }
    }

    public static void saveAdm(LinkedList<Adm> adms) throws AdmException {
        try {
            File path = new File("cache\\Adm.dat");
            FileOutputStream abrir = new FileOutputStream(path);
            ObjectOutputStream salvar = new ObjectOutputStream(abrir);
            salvar.writeObject(adms);
            salvar.close();
        }catch (IOException e){
            throw new AdmException(SaveError, null);
        }

    }
    public static void saveJogador(LinkedList<Jogador> jogadores) throws JogadorException {
        try {
            File path = new File("cache\\Jogador.dat");
            FileOutputStream abrir = new FileOutputStream(path);
            ObjectOutputStream salvar = new ObjectOutputStream(abrir);
            salvar.writeObject(jogadores);
            salvar.close();
        }catch (IOException e){
            throw new JogadorException(SaveError, null);
        }

    }
    public static void saveTreinador(LinkedList<Treinador> treinadores) throws TreinadorException {
        try {
            File path = new File("cache\\Treinador.dat");
            FileOutputStream abrir = new FileOutputStream(path);
            ObjectOutputStream salvar = new ObjectOutputStream(abrir);
            salvar.writeObject(treinadores);
            salvar.close();
        }catch (IOException e){
            throw new TreinadorException(SaveError, null);
        }
    }

    public static void saveJuiz(LinkedList<Juiz> juizes) throws JuizException {
        try {
            File path = new File("cache\\Juiz.dat");
            FileOutputStream abrir = new FileOutputStream(path);
            ObjectOutputStream salvar = new ObjectOutputStream(abrir);
            salvar.writeObject(juizes);
            salvar.close();
        }catch (IOException e){
            throw new JuizException(SaveError, null);
        }
    }

    public static void saveClube(LinkedList<Clube> clubes) throws ClubeException {
        try {
            File path = new File("cache\\Clube.dat");
            FileOutputStream abrir = new FileOutputStream(path);
            ObjectOutputStream salvar = new ObjectOutputStream(abrir);
            salvar.writeObject(clubes);
            salvar.close();
        }catch (IOException e){
            throw new ClubeException(SaveError, null);
        }
    }

    public static void saveCampeonato(LinkedList<Estat_Campeonato> campeonatos) throws CampeonatoException {
        try {
            File path = new File("cache\\Campeonato.dat");
            FileOutputStream abrir = new FileOutputStream(path);
            ObjectOutputStream salvar = new ObjectOutputStream(abrir);
            salvar.writeObject(campeonatos);
            salvar.close();
        }catch (IOException e){
            throw new CampeonatoException(SaveError, null);
        }
    }
}
