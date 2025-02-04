package it.epicode.pizzeria_vesuvio.runners;


// questo runner utilizza la dependency injection tramite costruttore

import it.epicode.pizzeria_vesuvio.entity.Pizza;
import it.epicode.pizzeria_vesuvio.stampe.PrintService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j

@RequiredArgsConstructor
@Order(2)
public class MenuRunner implements CommandLineRunner {
    private final PrintService printService;

    @Override
    public void run(String... args) throws Exception {
        Pizza pizza = new Pizza();
        pizza.setNome("Margherita");
        pizza.setPrezzo(5.0);
        pizza.setCalorie(500);

        log.info("---- stampa con dependency injection tramite costruttore");
        printService.stampa(pizza);
        log.info("--------------------------------------------------------- ");
    }
}
