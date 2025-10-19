package Klassen.Vererbung;

public class Student extends Person {
    long mtr_nummer;
    String ort;
    public Student(String name, int age, long mtr_nummer, String ort) {
        super(name, age);
        this.mtr_nummer = mtr_nummer;
        this.ort = ort;
    }
}
