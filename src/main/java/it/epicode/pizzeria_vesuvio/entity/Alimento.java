package it.epicode.pizzeria_vesuvio.entity;


import it.epicode.pizzeria_vesuvio.stampe.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Alimento implements Printable {
    private String nome;
    private double prezzo;
    private int calorie;
    private List<Allergene> allergeni= new ArrayList<>();

    @Override
    public String print() {
        return  nome + " € " + prezzo + " calorie: " + calorie;
    }
}
