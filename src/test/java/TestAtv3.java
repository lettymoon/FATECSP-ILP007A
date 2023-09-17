package src.test.java;

import org.junit.Test;
import src.main.java.org.example.aula03.Atv3.ClasseCirculo.Circulo;

import static org.junit.Assert.assertEquals;

public class TestAtv3 {
    @Test
    public void testCiculoVerificaRaio(){
        Circulo c = new Circulo();
        c.setRaio(3.0);

        assertEquals(3.0, c.getRaio(), 0);
    }
}
