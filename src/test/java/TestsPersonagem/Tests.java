package TestsPersonagem;

import Configuracoes.Personagem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestsConfiguracoesPersonagem {

    @Test
    public void deveRetornarAltura() {
        Personagem.getInstance().SetAltura(1.73);
        assertEquals(1.73, Personagem.getInstance().GetAltura());
    }

    @Test
    public void deveRetornarPeso() {
        Personagem.getInstance().SetPeso(65.60);
        assertEquals(65.60, Personagem.getInstance().GetPeso());
    }

    @Test
    public void deveRetornarSexo() {
        Personagem.getInstance().SetSexo("Masculino");
        assertEquals("Masculino", Personagem.getInstance().GetSexo());
    }
}