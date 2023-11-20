package src.Testes.Usuarios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Excecoes.Jogo.ClubeException;
import src.Excecoes.Usuarios.JogadorException;
import src.model.Jogo.Clube;
import src.model.Usuarios.Jogador;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {
    private Jogador j;
    private Clube c;
    @BeforeEach
    void setUp() throws ClubeException, JogadorException {
        c = new Clube("Fluminense",0,0,0,"RJ");
        j = new Jogador("Teste",12,"Teste",0,0,0,0,0,c);
    }

    @Test
    void getClube() {
        assertEquals(c,j.getClube());
    }

    @Test
    void getPosicao() {
        assertEquals("Teste",j.getPosicao());
    }

    @Test
    void setPosicao() {
        j.setPosicao("DEF");
        assertEquals("DEF",j.getPosicao());
    }

    @Test
    void getData_admisão() {
        j.setData_admisão("12");
        assertEquals("12",j.getData_admisão());
    }

    @Test
    void setData_admisão() {
        j.setData_admisão("12");
        assertEquals("12",j.getData_admisão());
    }

    @Test
    void getData_final_contrato() {
        j.setData_final_contrato("12");
        assertEquals("12",j.getData_final_contrato());
    }

    @Test
    void setData_final_contrato() {
        j.setData_final_contrato("12");
        assertEquals("12",j.getData_final_contrato());

    }

    @Test
    void getTemporadas() {
        assertEquals(0,j.getTemporadas());
    }

    @Test
    void setTemporadas() {
        j.setTemporadas(1);
        assertEquals(1,j.getTemporadas());
    }

    @Test
    void getGols_marcados() {
        assertEquals(0,j.getGols_marcados());
    }

    @Test
    void setGols_marcados() {
        j.setGols_marcados(1);
        assertEquals(1,j.getGols_marcados());
    }

    @Test
    void getAssistencias() {
        assertEquals(0,j.getAssistencias());
    }

    @Test
    void setAssistencias() {
        j.setAssistencias(1);
        assertEquals(1,j.getAssistencias());
    }

    @Test
    void getCartoes_amarelos() {
        assertEquals(0,j.getCartoes_amarelos());
    }

    @Test
    void setCartoes_amarelos() {
        j.setCartoes_amarelos(1);
        assertEquals(1,j.getCartoes_amarelos());
    }

    @Test
    void getCartoes_vermelhos() {
        assertEquals(0,j.getCartoes_vermelhos());
    }

    @Test
    void setCartoes_vermelhos() {
        j.setCartoes_vermelhos(1);
        assertEquals(1,j.getCartoes_vermelhos());
    }
}