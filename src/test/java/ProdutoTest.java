import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ProdutoTest {

    @Test
     void deveRetornarLoja() {
        Filial filial1 = new Filial("Bahamas 1");

        Filial filial2 = new Filial("Bahamas 2");

        Filial loja = new Filial("Bahamas 1");
        loja.addMercado(filial1);
        loja.addMercado(filial2);

        assertEquals("Loja: Bahamas 1\n" + "Loja: Bahamas 2", loja.getMercado());

    }
}