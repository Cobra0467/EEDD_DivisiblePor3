package DivisiblePor3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {

    @Test
    void seDivide() {
        Divisible3 divisible1 = new Divisible3();
        boolean resultadoActual = divisible1.seDivide("2");
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoActual);
    }
}