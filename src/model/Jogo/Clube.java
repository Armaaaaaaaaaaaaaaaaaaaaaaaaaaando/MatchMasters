package src.model.Jogo;

import src.model.Usuarios.Jogador;
import src.model.Usuarios.Treinador;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Clube {
    private LinkedList<Jogador> jogadores = new LinkedList<>();
    private HashMap<String,Integer> goleadores = new HashMap<>();
    private String nome;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    private String estado;
    private Treinador treinador;

    public Clube(String nome, Integer vitorias,Integer derrotas, Integer empates, String estado){
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.estado = estado;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setGoleadores(){
        for (Jogador i : jogadores){
            if(i.getGols_marcados() > 0 && !goleadores.containsKey(i.getNome())){
                goleadores.put(i.getNome(),i.getGols_marcados());
            }
        }
    }

    public Jogador getmaiorgoleador(){
        int maior = 0;
        Integer maiorValor = Integer.MIN_VALUE;
        String chaveMaiorValor = null;
        for (Map.Entry<String, Integer> encontre : goleadores.entrySet()) {
            String chave = encontre.getKey();
            Integer valor = encontre.getValue();

            if (valor > maiorValor) {
                maiorValor = valor;
                chaveMaiorValor = chave;
            }
        }
        for(Jogador i : jogadores){
            if(i.getNome() == chaveMaiorValor){
                return i;
            }
            else{
                return null;
            }
        }
        return null;
    }
}
