package src.model.Jogo;
import src.model.Usuarios.Jogador;
import src.model.Usuarios.Juiz;
import src.model.Jogo.Clube;

import java.util.LinkedList;

public class Partida {
    private Juiz juiz;
    private String Data;
    private Clube time1;
    private Clube time2;
    private Integer gols_time_1;
    private Integer gols_time_2;
    private Integer rodada;
    private LinkedList<Jogador> goleadores = new LinkedList<>();

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

    public Clube getTime1() {
        return time1;
    }

    public void setTime1(Clube time1) {
        this.time1 = time1;
    }

    public Clube getTime2() {
        return time2;
    }

    public void setTime2(Clube time2) {
        this.time2 = time2;
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
    }

    private void atualizar_classificacao(Clube time1,Clube time2){

    }
}


