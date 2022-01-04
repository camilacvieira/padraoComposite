import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ProdutoTest {

    @Test
    public void deveRetornarLojaCarro() {
        Filial filial1 = new Filial("Bahamas 1");

        Filial filial2 = new Filial("Bahamas 2");

        Filial loja = new Filial("Bahamas 1");
        loja.addMercado(filial1);
        loja.addMercado(filial2);

        assertEquals("Loja: Bahamas 1!\n" + "Loja: Bahamas 2", loja.getMercado());

    }
}