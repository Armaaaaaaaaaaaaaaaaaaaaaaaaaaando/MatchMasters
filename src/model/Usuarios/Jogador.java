package src.model.Usuarios;

public class Jogador extends Pessoa{
    //o clube é do tipo clube, está string até q a classe clube seja criada
    private String Clube;
    private String Posicao;
    private String Data_admisão;
    private String Data_final_contrato;
    private Integer Temporadas;
    private Integer gols_marcados;
    private Integer assistencias;
    private String cartoes_amarelos;
    private String cartoes_vermelhos;



    public Jogador(String nome, Integer idade, String Posicao,Integer Temporadas,Integer gols_marcados,
                   Integer assistencias, String cartoes_amarelos,String cartoes_vermelhos){
        this.setNome(nome);
        this.setIdade(idade);
        this.setPosicao(Posicao);
        this.setTemporadas(Temporadas);
        this.setGols_marcados(gols_marcados);
        this.setAssistencias(assistencias);
        this.setCartoes_amarelos(cartoes_amarelos);
        this.setCartoes_vermelhos(cartoes_vermelhos);

    }

    public String getClube() {
        return Clube;
    }

    public void setClube(String clube) {
        Clube = clube;
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

    public String getCartoes_amarelos() {
        return cartoes_amarelos;
    }

    public void setCartoes_amarelos(String cartoes_amarelos) {
        this.cartoes_amarelos = cartoes_amarelos;
    }

    public String getCartoes_vermelhos() {
        return cartoes_vermelhos;
    }

    public void setCartoes_vermelhos(String cartoes_vermelhos) {
        this.cartoes_vermelhos = cartoes_vermelhos;
    }
}
