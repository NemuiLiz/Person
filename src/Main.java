import person.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*
        Person bilbo1 = new Person(52, "Bilbo", "Baggins", 124, 50);
        Person gandalf = new Person(2096, "Gandalf", "the Grey", 180, 75);
        Person sam = new Person(52, "Bilbo", "Baggins", 124, 50);
        */

        Map<Person, Integer> personMap = new HashMap<>();

        Person bilbo = new Person(52, "Bilbo", "Baggins", 124, 50);
        personMap.put(bilbo, 88);
        System.out.println(personMap.get(bilbo));
    }
}