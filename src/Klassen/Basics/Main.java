package Klassen.Basics;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Adnan", "Nassar", 30, 5000);
        p1.printPersonInfo();
        System.out.println("Jahresgehalt: " + p1.berechneJahresGehalt() + "€");


        System.out.println();

        Person p2 = new Person("Waffa", "Mahmoud", 20, 10000);
        p2.printPersonInfo();
        System.out.println("Jahresgehalt: " + p2.berechneJahresGehalt() + "€");

        System.out.println();

        Person p3= new Person("Laya");
        p3.setNachname("Unbekannt");
        p3.setAlter(24);
        p3.setGehalt(2500);
        p3.printPersonInfo();
        System.out.println("Jahresgehalt: " + p3.berechneJahresGehalt() + "€");

        System.out.println();

        Person p4 = new Person();
        p4.setVorname("Reema");
        p4.setNachname("Shami");
        p4.setAlter(22);
        p4.setGehalt(3500);
        p4.printPersonInfo();
        System.out.println("Jahresgehalt: " + p4.berechneJahresGehalt() + "€");


    }
}