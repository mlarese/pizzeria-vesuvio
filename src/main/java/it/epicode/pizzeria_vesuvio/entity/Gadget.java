package it.epicode.pizzeria_vesuvio.entity;

import it.epicode.pizzeria_vesuvio.stampe.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gadget implements Printable {
    private double prezzo;
    private String descrizione;

    @Override
    public String print() {
        return "Gadget: " + descrizione + " prezzo: " + prezzo;
    }
}
