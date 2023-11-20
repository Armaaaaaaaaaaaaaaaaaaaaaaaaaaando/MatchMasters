package src.Testes.Usuarios;

import src.Excecoes.Usuarios.AdmException;
import src.model.Usuarios.Adm;

import static org.junit.Assert.assertEquals;

class AdmTest {
    private Adm a;
    @org.junit.jupiter.api.BeforeEach
    void setUp() throws AdmException {
        a = new Adm("Teste",12,"Teste","Teste");
    }

    @org.junit.jupiter.api.Test
    void getLogin() {
        assertEquals("Teste",a.getLogin());
    }

    @org.junit.jupiter.api.Test
    void setLogin() {
        a.setLogin("Pedro");
        assertEquals("Pedro",a.getLogin());
    }

    @org.junit.jupiter.api.Test
    void getSenha() {
        assertEquals("Teste",a.getSenha());
    }

    @org.junit.jupiter.api.Test
    void setSenha() {
        a.setSenha("Pedro");
        assertEquals("Pedro",a.getSenha());
    }
}