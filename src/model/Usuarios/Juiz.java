package src.model.Usuarios;

public class Juiz extends Pessoa{
    private Integer Partidas_apitadas;

    public Juiz(String nome, Integer idade, Integer partidas_apitadas){
        this.setNome(nome);
        this.setIdade(idade);
        this.Partidas_apitadas = partidas_apitadas;
    }
    public Integer getPartidas_apitadas() {
        return Partidas_apitadas;
    }

    public void setPartidas_apitadas(Integer partidas_apitadas) {
        Partidas_apitadas = partidas_apitadas;
    }
}
