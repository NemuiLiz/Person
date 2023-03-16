package person;

import java.util.Objects;

public class Person {

    public int age;
    public String name;
    public String surname;
    public int height;
    public int weight;

    public Person(int age, String name, String surname, int height, int weight) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && weight == person.weight && name.equals(person.name) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname, height, weight);
    }


}
