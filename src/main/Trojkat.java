package main;

public class Trojkat extends Figura implements Interfejs2  {
    @Override
    public void rysuj() {
        System.out.println("Rysuję trójkąt.");
    }

    @Override
    public void obliczPole() {
        System.out.println("Obliczam pole trójkąta.");

    }

    @Override
    public void metoda3() {
        System.out.println("Metoda 3 z implementacji Interfejsu2.");
    }

    @Override
    public void metoda4() {
        System.out.println("Metoda 4 z klasy");
    }
}
