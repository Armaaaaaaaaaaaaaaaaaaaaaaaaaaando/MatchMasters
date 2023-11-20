package src.model.Usuarios;

import src.Excecoes.Usuarios.JogadorException;
import src.model.Jogo.Clube;

import static src.util.Constantes.CreationJogador;

public class Jogador extends Pessoa{
    //o clube é do tipo clube, está string até q a classe clube seja criada
    private Clube clube;
    private String Posicao;
    private String Data_admisão;
    private String Data_final_contrato;
    private Integer Temporadas;
    private Integer gols_marcados;
    private Integer assistencias;
    private Integer cartoes_amarelos;
    private Integer cartoes_vermelhos;


    public Jogador(String nome, Integer idade, String Posicao,Integer Temporadas,Integer gols_marcados,
                   Integer assistencias, Integer cartoes_amarelos,Integer cartoes_vermelhos,Clube clube) throws JogadorException {
        try{
            this.setNome(nome);
            this.setIdade(idade);
            this.setPosicao(Posicao);
            this.setTemporadas(Temporadas);
            this.setGols_marcados(gols_marcados);
            this.setAssistencias(assistencias);
            this.setCartoes_amarelos(cartoes_amarelos);
            this.setCartoes_vermelhos(cartoes_vermelhos);
            this.clube = clube;
        }
        catch (Exception e){
            throw new JogadorException(CreationJogador,null);
        }
    }

    public Clube getClube() {
        return clube;
    }


    public String getPosicao() {
        return Posicao;
    }

    public void setPosicao(String posicao) {
        Posicao = posicao;
    }

    public String getData_admisão() {
        return Data_admisão;
    }

    public void setData_admisão(String data_admisão) {
        Data_admisão = data_admisão;
    }

    public String getData_final_contrato() {
        return Data_final_contrato;
    }

    public void setData_final_contrato(String data_final_contrato) {
        Data_final_contrato = data_final_contrato;
    }

    public Integer getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        Temporadas = temporadas;
    }

    public Integer getGols_marcados() {
        return gols_marcados;
    }

    public void setGols_marcados(Integer gols_marcados) {
        this.gols_marcados = gols_marcados;
    }

    public Integer getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(Integer assistencias) {
        this.assistencias = assistencias;
    }

    public Integer getCartoes_amarelos() {
        return cartoes_amarelos;
    }

    public void setCartoes_amarelos(Integer cartoes_amarelos) {
        this.cartoes_amarelos = cartoes_amarelos;
    }

    public Integer getCartoes_vermelhos() {
        return cartoes_vermelhos;
    }

    public void setCartoes_vermelhos(Integer cartoes_vermelhos) {
        this.cartoes_vermelhos = cartoes_vermelhos;
    }
}
