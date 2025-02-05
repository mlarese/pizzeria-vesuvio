package it.epicode.pizzeria_vesuvio.runners;

import it.epicode.pizzeria_vesuvio.entity.*;
import it.epicode.pizzeria_vesuvio.stampe.PrintService;
import it.epicode.pizzeria_vesuvio.stampe.Printable;
import it.epicode.pizzeria_vesuvio.stampe.SeparatoreStampa;
import it.epicode.pizzeria_vesuvio.stampe.TitoloStampa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@Order(3)
// questo runner utilizza la dependency injection tramite autowired
public class AppRunner implements CommandLineRunner {
    @Autowired
    PrintService printService;

    @Override
    public void run(String... args) throws Exception {

        log.debug("Creo pizza");
        Pizza pizza = new Pizza();
        pizza.setNome("Margherita");
        pizza.setPrezzo(5.0);
        pizza.setCalorie(500);
        log.debug("Fine Creo pizza");

        log.debug("Fine Creo bevanda");
        Bevanda bevanda = new Bevanda();
        bevanda.setNome("Coca Cola");
        bevanda.setPrezzo(2.0);
        bevanda.setCalorie(100);
        bevanda.setQuantita("33cl");
        log.debug("Fine Creo bevanda");

        log.debug("Creo topping");
        Topping topping = new Topping();
        topping.setNome("Prosciutto");
        topping.setPrezzo(1.0);
        topping.setCalorie(50);
        log.debug("Fine Creo topping");

        log.debug("Creo allergene");
        Allergene allergene = new Allergene();
        allergene.setNome("Glutine");
        log.debug("Fine Creo allergene");

        log.debug("Creo pizzaiolo");
        Pizzaiolo pizzaiolo = new Pizzaiolo();
        pizzaiolo.setNome("Mario");
        pizzaiolo.setCognome("Rossi");
        log.debug("Fine Creo pizzaiolo");


        printService.stampa(pizza);
        printService.stampa(bevanda);
        printService.stampa(topping);
        printService.stampa(allergene);
        printService.stampa(pizzaiolo);

        TitoloStampa titoloStampa = new TitoloStampa("MENU PIZZERIA");
        SeparatoreStampa separatoreStampa = new SeparatoreStampa();

        List<Printable> printables = List.of(titoloStampa, pizza,separatoreStampa, bevanda,separatoreStampa, topping,separatoreStampa,allergene,separatoreStampa,pizzaiolo);
        printService.stampa(printables);

    }
}
