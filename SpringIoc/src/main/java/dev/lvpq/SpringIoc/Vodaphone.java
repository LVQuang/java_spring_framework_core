package dev.lvpq.SpringIoc;

public class Vodaphone implements Sim{
    @Override
    public void Calling() {
        System.out.println("Calling using Vodaphone mobile");
    }

    @Override
    public void Data() {
        System.out.println("Browsing using Vodaphone sim");
    }
}
