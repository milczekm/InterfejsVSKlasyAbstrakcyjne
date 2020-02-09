package main;

abstract public class Figura {
    public static final String KOLOR = "CZERWONY";
    int bok;
    public abstract void rysuj();
    public abstract void obliczPole();
    public String komunikat(String str){
        return str;
    }

}
