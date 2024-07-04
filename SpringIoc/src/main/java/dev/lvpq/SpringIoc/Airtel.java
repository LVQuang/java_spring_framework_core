package dev.lvpq.SpringIoc;

public class Airtel implements Sim{
    @Override
    public void Calling() {
        System.out.println("Calling using Airtel mobile");
    }

    @Override
    public void Data() {
        System.out.println("Browsing using Airtel sim");
    }
}
