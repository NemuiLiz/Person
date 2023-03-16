package person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonHeightComparatorTest {

    private Person person1;
    private Person person2;
    private Person person3;
    private final double DELTA = 0.01;

    @BeforeEach
    void initPerson() {
        person1 = new Person(22, "Name", "Surname", 150, 40);
        person2 = new Person(2096, "Gandalf", "the Grey", 180, 75);
        person3 = new Person(33, "Sam", "Gamdschie", 110, 50);
    }

    @Test
    void compare(Person person1, Person person2) {
        PersonHeightComparator pHeightComp = new PersonHeightComparator();

        int expectedCompResult = -1;

        assertEquals(false, person1.compareTo(person2));
    }
}