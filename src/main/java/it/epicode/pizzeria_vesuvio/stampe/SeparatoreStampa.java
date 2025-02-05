package it.epicode.pizzeria_vesuvio.stampe;

public class SeparatoreStampa implements Printable {

    @Override
    public String print() {
        return "============================================";
    }
}
