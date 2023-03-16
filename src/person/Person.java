package person;

import java.util.Objects;

@CSVEntity
public class Person implements Comparable<Person>{


    public Integer age;

    @CSVField
    public String name;

    @CSVField
    public String surname;

    @CSVField
    public Integer height;

    public int weight;

    public Person(Integer age, String name, String surname, int height, int weight) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age.equals(person.age)  && height.equals(person.height) && weight == person.weight && name.equals(person.name) && surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname, height, weight);
    }


    @Override
    public int compareTo(Person person) {
        return Integer.compare(getAge(), person.getAge());
    }


    //Get and Set
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
