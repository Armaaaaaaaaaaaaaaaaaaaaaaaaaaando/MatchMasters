package src.model.Jogo;
import src.Excecoes.Jogo.PartidaException;
import src.model.Usuarios.Jogador;
import src.model.Usuarios.Juiz;
import src.model.Jogo.Clube;

import java.util.LinkedList;

import static src.util.Constantes.CreationPartida;

public class Partida {
    private Juiz juiz;
    private String Data;
    private Clube time1;
    private Clube time2;
    private Integer gols_time_1;
    private Integer gols_time_2;
    private Integer rodada;
    private LinkedList<Jogador> goleadores = new LinkedList<>();

    public Partida(Clube time1, Clube time2, Juiz juiz) throws Exception{
        try{
            this.gols_time_1 = 0;
            this.gols_time_2 = 0;
            this.time1 = time1;
            this.time2 = time2;
            this.juiz = juiz;
        }
        catch (Exception e){
            throw new PartidaException(CreationPartida,null);
        }

    }

    public Juiz getJuiz() {
        return juiz;
    }

    public void setJuiz(Juiz juiz) {
        this.juiz = juiz;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public Integer getGols_time_1() {
        return gols_time_1;
    }

    public void setGols_time_1(Integer gols_time_1) {
        this.gols_time_1 = gols_time_1;
    }

    public Integer getGols_time_2() {
        return gols_time_2;
    }

    public void setGols_time_2(Integer gols_time_2) {
        this.gols_time_2 = gols_time_2;
    }

    public Integer getRodada() {
        return rodada;
    }

    public void setRodada(Integer rodada) {
        this.rodada = rodada;
    }

    private void Iniciar(Clube time1,Clube time2) {
        System.out.println("PARTIDA INICIADA");
        System.out.println(time1.getNome()+" VS "+time2.getNome());
    }

    private void gol(Clube time, Jogador goleador){
        if(time.getNome() == time1.getNome() && goleador.getClube().getNome() == time.getNome()){
            setGols_time_1(getGols_time_1()+1);
            goleadores.add(goleador);
        }
        else{
            setGols_time_2(getGols_time_2()+1);
            goleadores.add(goleador);
        }
    }

    private void finalizar(Clube time1,Clube time2){
        System.out.println("PARTIDA FINALIZADA");
        System.out.println(time1.getNome() + gols_time_1 + " X " +time2.getNome() + gols_time_2);
        juiz.setPartidas_apitadas(juiz.getPartidas_apitadas()+1);
        time1.getTreinador().setPartidas(time1.getTreinador().getPartidas()+1);
        time2.getTreinador().setPartidas(time2.getTreinador().getPartidas()+1);
        if(gols_time_1 > gols_time_2){
            time1.setVitorias(time1.getVitorias()+1);
            time1.getTreinador().setVitorias(time1.getTreinador().getVitorias()+1);

            time2.setDerrotas(time2.getDerrotas()+1);
            time2.getTreinador().setDerrotas(time2.getTreinador().getDerrotas()+1);

        }
        else if(gols_time_2>gols_time_1){
            time1.setDerrotas(time1.getDerrotas()+1);
            time1.getTreinador().setDerrotas(time1.getTreinador().getDerrotas()+1);

            time2.setVitorias(time2.getVitorias()+1);
            time2.getTreinador().setVitorias(time2.getTreinador().getVitorias()+1);

        }
        else{
            time1.setEmpates(time1.getEmpates()+1);
            time2.setEmpates(time2.getEmpates()+1);
            time1.getTreinador().setEmpates(time1.getTreinador().getEmpates()+1);
            time2.getTreinador().setEmpates(time2.getTreinador().getEmpates()+1);
        }

    }

    private void atualizar_classificacao(Clube time1,Clube time2){

    }
}


