package main;

public class Kwadrat extends Figura implements Interfejs1 {
    @Override
    public void rysuj() {
        System.out.println("Rysuję kwadrat.");
    }

    @Override
    public void obliczPole() {
        System.out.println("Obliczam pole kwadratu.");
    }

    @Override
    public void metoda1() {

    }

    @Override
    public String metoda2() {
        return null;
    }
}
