package src.model.Jogo;

import src.model.Usuarios.Jogador;
import src.model.Usuarios.Treinador;

import java.util.LinkedList;

public class Clube {
    private LinkedList<Jogador> jogadores = new LinkedList<>();
    private String nome;
    private Integer Posicao_classificacao;
    private String estado;
    private Treinador treinador;

    public Clube(String nome, Integer Posicao_classificacao, String estado){
        this.nome = nome;
        this.Posicao_classificacao = Posicao_classificacao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPosicao_classificacao() {
        return Posicao_classificacao;
    }

    public void setPosicao_classificacao(Integer posicao_classificacao) {
        Posicao_classificacao = posicao_classificacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
