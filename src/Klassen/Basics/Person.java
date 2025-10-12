package Klassen.Basics;

public class Person {
    private String vorname;
    private String nachname;
    private int alter;
    private double gehalt;

    // default constructor
    public Person() {

    }

    // constructor mit einem Parameter
    public Person(String vorname) {
        this.vorname = vorname;
    }

    // constructor mit 4 (bzw. alle) Parameter
    public Person(String vorname, String nachname, int alter, double gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.gehalt = gehalt;
    }


    // setters & getters
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    //
    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    // actions!
    public void printPersonInfo() {
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
        System.out.println("Alter: " + alter);
        System.out.println("Gehalt: " + gehalt);
    }

    public double berechneJahresGehalt() {
        return gehalt * 12;
    }
}
