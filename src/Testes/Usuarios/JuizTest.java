package src.Testes.Usuarios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Excecoes.Usuarios.JuizException;
import src.model.Usuarios.Juiz;

import static org.junit.jupiter.api.Assertions.*;

class JuizTest {
    private Juiz j;
    @BeforeEach
    void setUp() throws JuizException {
        j = new Juiz("Teste",12,0);
    }

    @Test
    void getPartidas_apitadas() {
        assertEquals(0,j.getPartidas_apitadas());
    }

    @Test
    void setPartidas_apitadas() {
        j.setPartidas_apitadas(1);
        assertEquals(1,j.getPartidas_apitadas());
    }
}