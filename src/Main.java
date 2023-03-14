import person.Person;

public class Main {
    public static void main(String[] args) {

        Person bilbo = new Person(52, "Bilbo", "Baggins", 124, 50);
        Person gandalf = new Person(2096, "Gandalf", "the Grey", 180, 75);
        Person sam = new Person(52, "Bilbo", "Baggins", 124, 50);

        System.out.println(" Age of " + bilbo.name + " and " + gandalf.name + " are " + bilbo.equals(gandalf));
        System.out.println(" Age of " +bilbo.name + " and " + sam.name +" are " +bilbo.equals(sam));;
    }
}