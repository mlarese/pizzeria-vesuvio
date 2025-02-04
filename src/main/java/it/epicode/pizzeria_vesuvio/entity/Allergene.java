package it.epicode.pizzeria_vesuvio.entity;

import it.epicode.pizzeria_vesuvio.stampe.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Allergene implements Printable {
    private String nome;

    @Override
    public String print() {
        return "io sono un allergene";
    }
}
