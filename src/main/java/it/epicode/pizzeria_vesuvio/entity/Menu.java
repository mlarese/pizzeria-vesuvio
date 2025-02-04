package it.epicode.pizzeria_vesuvio.entity;

import it.epicode.pizzeria_vesuvio.stampe.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu implements Printable {

    private String nome;
    private List<Printable> voci= new ArrayList<>();


    @Override
    public String print() {
        String risultato = "\n Menu: " + nome + "\n";
        for (Printable voce : voci) {
            risultato += voce.print() + "\n";
        }
        return risultato;
    }
}
