package it.epicode.pizzeria_vesuvio.stampe;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PrintService {

    @Value("${ideatore.nome}")
    private String ideatore;

    public void stampa(Printable printable) {
        log.info(printable.print());
    }

    public void stampa(List<Printable> printables) {
        for (Printable printable : printables) {
            log.info(printable.print());
        }
        log.info("Ideatore: " + ideatore);
    }
}
