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
public class Pizza extends Alimento   {
    private List<Topping> toppings = new ArrayList<>();

}
