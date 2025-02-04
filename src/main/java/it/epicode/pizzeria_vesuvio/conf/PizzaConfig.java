package it.epicode.pizzeria_vesuvio.conf;

import it.epicode.pizzeria_vesuvio.entity.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Bean
    public Pizza pizzaMargherita() {
        Pizza pizza = new Pizza();
        pizza.setNome("Margherita");
        pizza.setPrezzo(5.0);
        pizza.setCalorie(500);
        return pizza;
    }

    @Bean
    public Pizza pizzaDiavola() {
        Pizza pizza = new Pizza();
        pizza.setNome("Diavola");
        pizza.setPrezzo(6.0);
        pizza.setCalorie(600);
        return pizza;
    }

}
