package it.epicode.pizzeria_vesuvio.entity;

import it.epicode.pizzeria_vesuvio.stampe.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizzaiolo implements Printable {
    private String nome;
    private String cognome;

    @Override
    public String print() {
        return "Chef " + nome + " " + cognome;
    }
}
