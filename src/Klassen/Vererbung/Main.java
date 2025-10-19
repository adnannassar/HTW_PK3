package Klassen.Vererbung;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Person", 19);

        Student student = new Student("Nour", 21, 123124123, "Berlin");
        System.out.println("Before: " + student.getName());

        student.setAge(22);
        student.setName("Noura");

        System.out.println("After: " + student.getName());
        System.out.println("Email: " + student.getEmail());


        Prof p = new Prof("Prof", 19, "Informatik");

        Mitarbeiter m = new Mitarbeiter("Mitarbeiter", 20, 5000);


    }

}
