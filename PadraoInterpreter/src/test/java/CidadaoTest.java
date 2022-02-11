
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadaoTest {
    @Test
    void deveCalcularIngestaoDeProteinas() {
        Cidadao paciente = new Cidadao();
        paciente.setValue1(5000);

        // quantidade de imposto
        assertEquals(4000, paciente.calcular());
    }

}