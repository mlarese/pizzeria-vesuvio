package it.epicode.pizzeria_vesuvio.conf;

import it.epicode.pizzeria_vesuvio.entity.Gadget;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GadgetConfig {

    @Bean
    public Gadget piattoDecorativo() {
        Gadget g = new Gadget();
        g.setDescrizione("Piatto Decorativo");
        g.setPrezzo(10.0);
        return g;
    }
}
