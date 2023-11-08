package src.model.Estatisticas;

import src.dao.MasterDao;
import src.model.Jogo.Clube;
import src.model.Usuarios.Jogador;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class Estat_Campeonato {
    private HashMap<String, Integer> artilheiros = new HashMap<>();
    private HashMap<String,Integer> Classificacao = new HashMap<String, Integer>();
    private PriorityQueue<String> filaDePrioridade = new PriorityQueue<>(Comparator.comparing(Classificacao::get).reversed());
    private LinkedList<Clube> clubes = new LinkedList<>();

    public Estat_Campeonato(){
        if(MasterDao.getClubedao().findSize() == 20){
            clubes = MasterDao.getClubedao().findAll();
            for(Clube j : clubes){
                Classificacao.put(j.getNome(),0);
            }
        }
        else{
            //aqui lança exceção
        }
    }
    public void Atualizarclassificacao(){
        filaDePrioridade.addAll(Classificacao.keySet());
    }

    public void Atualizarpontucao(){
        for(Clube j : clubes){
            int pontos = 0;
            pontos += j.getVitorias()*3;
            pontos += j.getEmpates();
            Classificacao.put(j.getNome(),pontos);
        }
    }

    public void Artilheiros(){
        for(Clube c : clubes){
            artilheiros.put(c.getmaiorgoleador().getNome(), c.getmaiorgoleador().getGols_marcados());
        }
    }


}
