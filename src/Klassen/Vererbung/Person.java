package Klassen.Vererbung;

public class Person extends Object {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = name + "." + age + "@htw-berlin.de";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void printInf() {
        System.out.println("Person " + name + " " + age + " " + email);
    }

    public void add(int a, int b) {
        System.out.println("Add:" + (a + b));
    }
}
