package it.epicode.pizzeria_vesuvio.runners;

import it.epicode.pizzeria_vesuvio.entity.Menu;
import it.epicode.pizzeria_vesuvio.stampe.PrintService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Order(1)
@Slf4j
public class StampaMenuRunner implements CommandLineRunner {
    private final PrintService printService;
    private final Menu menu;

    @Override
    public void run(String... args) throws Exception {

        log.info("------------- Stampa menu");
        printService.stampa(menu);

    }
}
