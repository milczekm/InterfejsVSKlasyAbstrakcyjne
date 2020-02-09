package main;

public interface Interfejs2 {
    public void metoda3();
    public default void metoda4(){
        System.out.println("Metoda 4 z Interfejsu2.");
    };
}
