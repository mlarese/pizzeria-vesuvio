package it.epicode.pizzeria_vesuvio.stampe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TitoloStampa implements Printable {
    private String titolo;

    @Override
    public String print() {
        return "------------- " + titolo + " -------------";
    }
}
