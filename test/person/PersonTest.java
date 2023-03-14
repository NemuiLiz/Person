package person;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}