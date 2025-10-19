package Klassen.Vererbung;

public class Prof extends Person {
    String fachbereich;

    public Prof(String name, int age, String fachbereich) {
        super(name, age);
        this.fachbereich = fachbereich;
    }

    @Override
    public void add(int a, int b) {
        System.out.println("Add:" + (a + b + 5));
    }

    @Override
    public String toString() {
        return getName() + "/" + fachbereich;
    }
}
