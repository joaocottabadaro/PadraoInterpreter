
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class InterpretadorExpressaoTest {

    @Test
    public void deveCalcularExpressaoSoma() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("4 + 7");
        assertEquals(11.0, interpretador.interpretar());
    }

    @Test
    public void deveCalcularExpressaoSubtracao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("3 - 1");
        assertEquals(2.0, interpretador.interpretar());
    }

    @Test
    public void deveCalcularExpressaoMultiplicacao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("7 * 2");
        assertEquals(14.0, interpretador.interpretar());
    }

    @Test
    public void deveCalcularExpressaoDivisao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("8 / 2");
        assertEquals(4.0, interpretador.interpretar());
    }

    @Test
    public void deveCalcularExpressaoCombinada() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("10 * 2 - 4 + 4");
        assertEquals(20.0, interpretador.interpretar());
    }

    @Test
    public void deveRetonarExcecaoElementoInvalido() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("5 ^ 2");
            assertEquals(4.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    public void deveRetonarExcecaoInvalida() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("2 +");
            assertEquals(4.0, interpretador.interpretar());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão inválida", e.getMessage());
        }
    }

}
