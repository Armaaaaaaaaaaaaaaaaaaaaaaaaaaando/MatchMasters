package src.model.Usuarios;

public class Jogador extends Pessoa{
    //o clube é do tipo clube, está string até q a classe clube seja criada
    private String Clube;
    private String Posicao;
    private String Data_admisão;
    private String Data_final_contrato;
    private Integer Temporadas;

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
}
