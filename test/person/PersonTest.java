package person;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;
    private final double DELTA = 0.01;

    @BeforeEach
    void initPerson() {
        person = new Person(22, "Name", "Surname", 150, 40);
    }
    @Test
    void testEquals() {
        assertEquals(22, person.age, DELTA);
    }

    @Test
    void testNotEquals() {
        assertNotEquals(30, person.age, DELTA);
    }

    @Test
    void testHashCode() {
        Map<Person, Integer> personMap = new HashMap<>();

        Person bilbo = new Person(52, "Bilbo", "Baggins", 124, 50);
        Person bilbo2 = new Person(52, "Bilbo", "Baggins", 124, 50);
        personMap.put(bilbo, 88);
        assertEquals(88, personMap.get(bilbo2));
    }
}