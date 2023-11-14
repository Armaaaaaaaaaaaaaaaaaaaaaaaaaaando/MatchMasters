package src.model.Usuarios;

import src.Excecoes.Usuarios.JuizException;

import static src.util.Constantes.CreationJuiz;

public class Juiz extends Pessoa{
    private Integer Partidas_apitadas;

    public Juiz(String nome, Integer idade, Integer partidas_apitadas) throws JuizException {
        try{
            this.setNome(nome);
            this.setIdade(idade);
            this.Partidas_apitadas = partidas_apitadas;
        }
        catch (Exception e){
            throw new JuizException(CreationJuiz, null);
        }
    }
    public Integer getPartidas_apitadas() {
        return Partidas_apitadas;
    }

    public void setPartidas_apitadas(Integer partidas_apitadas) {
        Partidas_apitadas = partidas_apitadas;
    }
}
