package src.Testes.Usuarios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Excecoes.Jogo.ClubeException;
import src.Excecoes.Usuarios.TreinadorException;
import src.model.Jogo.Clube;
import src.model.Usuarios.Treinador;

import static org.junit.jupiter.api.Assertions.*;

class TreinadorTest {
    private Treinador t;
    private Clube c;
    @BeforeEach
    void setUp() throws ClubeException, TreinadorException {
        c = new Clube("Fluminense",0,0,0,"RJ");
        t = new Treinador("Teste",19,c.getNome());
    }

    @Test
    void getVitorias() {
        assertEquals(0,t.getVitorias());
    }

    @Test
    void setVitorias() {
        t.setVitorias(1);
        assertEquals(1,t.getVitorias());
    }

    @Test
    void getDerrotas() {
        assertEquals(0,t.getDerrotas());
    }

    @Test
    void setDerrotas() {
        t.setDerrotas(1);
        assertEquals(1,t.getDerrotas());
    }

    @Test
    void getEmpates() {
        assertEquals(0,t.getEmpates());
    }

    @Test
    void setEmpates() {
        t.setEmpates(1);
        assertEquals(1,t.getEmpates());
    }

    @Test
    void getPartidas() {
        assertEquals(0,t.getPartidas());
    }

    @Test
    void setPartidas() {
        t.setPartidas(1);
        assertEquals(1,t.getPartidas());
    }

    @Test
    void getData_admisão() {
        t.setData_admisão("12/12/2012");
        assertEquals("12/12/2012",t.getData_admisão());
    }

    @Test
    void setData_admisão() {
        t.setData_admisão("12/12/2012");
        assertEquals("12/12/2012",t.getData_admisão());
    }

    @Test
    void getData_final_contrato() {
        t.setData_final_contrato("12/12/2012");
        assertEquals("12/12/2012",t.getData_final_contrato());
    }

    @Test
    void setData_final_contrato() {
        t.setData_final_contrato("12/12/2012");
        assertEquals("12/12/2012",t.getData_final_contrato());
    }

    @Test
    void getClube() {
        assertEquals("Fluminense",t.getClube());
    }
}