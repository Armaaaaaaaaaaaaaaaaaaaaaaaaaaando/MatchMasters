package src.Usuarios;

public class Treinador extends Pessoa{
    private Integer Anos_experiencia;

    private String Data_admisão;

    private String Data_final_contrato;

    //tambem do tipo clube, mas está string até ser criada a classe clube
    private String Clube;



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

    public String getClube() {
        return Clube;
    }

    public void setClube(String clube) {
        Clube = clube;
    }
}
