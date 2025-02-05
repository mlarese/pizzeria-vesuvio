package it.epicode.pizzeria_vesuvio.conf;

import it.epicode.pizzeria_vesuvio.entity.Bevanda;
import it.epicode.pizzeria_vesuvio.entity.Gadget;
import it.epicode.pizzeria_vesuvio.entity.Menu;
import it.epicode.pizzeria_vesuvio.entity.Pizza;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class MenuConfig {
    private final Pizza pizzaMargherita;
    private final Pizza pizzaDiavola;
    private final Bevanda aranciata;
    private final Bevanda cocaCola;
    private final Gadget piattoDecorativo;

    @Bean
    public Menu menu () {
        Menu menu = new Menu();
        menu.setNome("Menu Pizze nuovo");
        menu.setVoci(List.of(pizzaMargherita, pizzaDiavola, aranciata, cocaCola));
        return menu;

    }
}
