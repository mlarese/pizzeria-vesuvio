package it.epicode.pizzeria_vesuvio.conf;

import it.epicode.pizzeria_vesuvio.entity.Bevanda;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BevandaConfigTest {
    @Autowired private Bevanda aranciata;
    @Autowired private Bevanda cocaCola;

    @Test
    @DisplayName("Test Aranciata Bean per verificare corretteza valori inseriti")
    public void testAranciata() {
        assertEquals("Aranciata", aranciata.getNome());
        assertEquals(2.5, aranciata.getPrezzo());
        assertEquals(101, aranciata.getCalorie());
        assertEquals("33cl", aranciata.getQuantita());

    }

    @Test
    @DisplayName("Test Coca Cola Bean per verificare corretteza valori inseriti")
    public void testCocaCola() {
        assertEquals("Coca Cola", cocaCola.getNome());
        assertEquals(2.0, cocaCola.getPrezzo());
        assertEquals(100, cocaCola.getCalorie());
        assertEquals("33cl", cocaCola.getQuantita());
    }

    @ParameterizedTest
    @CsvSource({
            "Fanta, 2.5, 101, 33cl",
            "Chinotto, 2.0, 100, 33cl",
            "Sprite, 2.5, 101, 33cl"
    })
    @DisplayName("Test Bevande create  per verificare corretteza valori inseriti")
    public void testBevandaPrint(String nome, double prezzo, int calorie, String quantita) {
        Bevanda b = new Bevanda();
        b.setNome(nome);
        b.setPrezzo(prezzo);
        b.setCalorie(calorie);
        b.setQuantita(quantita);

        assertEquals(
                nome + " € " + prezzo + " calorie: " + calorie + " quantita: " + quantita,
                b.print());
    }

}
