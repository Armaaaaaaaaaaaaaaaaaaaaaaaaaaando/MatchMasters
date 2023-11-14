package src.model.Usuarios;

import src.Excecoes.Usuarios.TreinadorException;
import src.model.Jogo.Clube;

import static src.util.Constantes.CreationTreinador;

public class Treinador extends Pessoa{
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;
    private Integer partidas;

    private String Data_admisão;

    private String Data_final_contrato;

    private Clube clube;

    public Treinador(String nome, Integer idade,Integer vitorias, Integer derrotas, Integer empates, Integer partidas,
                     Clube clube) throws TreinadorException {
        try{
            this.setNome(nome);
            this.setIdade(idade);
            this.clube = clube;
            this.vitorias = 0;
            this.derrotas = 0;
            this.empates = 0;
            this.partidas = 0;
        }
        catch (Exception e){
            throw new TreinadorException(CreationTreinador, null);
        }
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

    public Integer getPartidas() {
        return partidas;
    }

    public void setPartidas(Integer partidas) {
        this.partidas = partidas;
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
