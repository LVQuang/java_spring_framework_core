package dev.lvpq.SpringIoc;

public class Jio implements Sim{
    @Override
    public void Calling() {
        System.out.println("Calling using Jio mobile");
    }

    @Override
    public void Data() {
        System.out.println("Browsing using Jio sim");
    }
}
