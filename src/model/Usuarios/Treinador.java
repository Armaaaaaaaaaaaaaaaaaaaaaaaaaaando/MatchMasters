package src.model.Usuarios;

import src.model.Jogo.Clube;

public class Treinador extends Pessoa{
    private Integer Anos_experiencia;

    private String Data_admisão;

    private String Data_final_contrato;

    private Clube clube;

    public Treinador(String nome, Integer idade, Integer anos_experiencia, Clube clube){
        this.setNome(nome);
        this.setIdade(idade);
        this.clube = clube;
        this.Anos_experiencia = anos_experiencia;
    }

    public Integer getAnos_experiencia() {
        return Anos_experiencia;
    }

    public void setAnos_experiencia(Integer anos_experiencia) {
        Anos_experiencia = anos_experiencia;
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

    public Clube getClube() {
        return clube;
    }

}
