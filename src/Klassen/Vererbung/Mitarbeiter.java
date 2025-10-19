package Klassen.Vererbung;

public class Mitarbeiter extends Person {
    double gehalt;
    public Mitarbeiter(String name, int age, double gehalt) {
        super(name, age);
        this.gehalt = gehalt;
    }
}
