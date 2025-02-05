package it.epicode.pizzeria_vesuvio.conf;

import it.epicode.pizzeria_vesuvio.entity.Bevanda;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BevandaConfig {

    @Bean
    public Bevanda aranciata() {
        Bevanda b = new Bevanda();
        b.setNome("Aranciata");
        b.setPrezzo(2.5);
        b.setCalorie(101);
        b.setQuantita("33cl");
        return b;
    }

    @Bean
    public Bevanda cocaCola() {
        Bevanda b = new Bevanda();
        b.setNome("Coca Cola");
        b.setPrezzo(2.0);
        b.setCalorie(100);
        b.setQuantita("33cl");
        return b;
    }
}
