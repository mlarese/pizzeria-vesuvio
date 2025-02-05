package it.epicode.pizzeria_vesuvio.conf;


import it.epicode.pizzeria_vesuvio.entity.Menu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MenuConfigTest {
    @Autowired private Menu menu;

    @Test
    @DisplayName("Test Menu Bean per verificare corretteza valori inseriti")
    public void testMenuBean() {

        assertEquals("Menu Pizze nuovo", menu.getNome());
        assertEquals(4, menu.getVoci().size());

    }

}
