import person.Person;
import person.PersonAgeComparator;
import person.PersonHeightComparator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Field[] personFields = Person.class.getDeclaredFields();
        for( Field f : personFields) {
            System.out.println("Fields : " + f.toString());
        }

        Method[] personMethods = Person.class.getMethods();
        for(Method m : personMethods) {
            System.out.println("Methods : " + m.getDeclaringClass());
        }

        Person bilbo1 = new Person(52, "Bilbo", "Baggins", 124, 50);
        Person gandalf = new Person(2096, "Gandalf", "the Grey", 180, 75);
        Person sam = new Person(33, "Sam", "Gamdschie", 110, 50);


        Map<Person, Integer> personMap = new HashMap<>();
        List<Person> personsList = new ArrayList<>();

        //HashCode and equals
        Person bilbo = new Person(52, "Bilbo", "Baggins", 124, 50);
        personMap.put(bilbo, 88);
        System.out.println(personMap.get(bilbo));

        //Comparable and Comparator
        personsList.add(bilbo1);
        personsList.add(gandalf);
        personsList.add(sam);

        System.out.println("PersonsList before sorting " + personsList);
        personsList.sort(new PersonAgeComparator());
        System.out.println(" Personslist after sorting ");
        for(Person person : personsList) {
            System.out.println(person);
        }

    }
}