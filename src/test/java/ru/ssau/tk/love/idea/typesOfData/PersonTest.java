package ru.ssau.tk.love.idea.typesOfData;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testGetAndSet() {
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        Person thirdPerson = new Person();

        firstPerson.setFirstName("Andrey");
        firstPerson.setLastName("Khlebodarov");
        firstPerson.setPassportId(1);

        secondPerson.setFirstName("Tom");
        secondPerson.setLastName("Hardy");
        secondPerson.setPassportId(612);

        thirdPerson.setFirstName("Cristiano");
        thirdPerson.setLastName("Ronaldo");
        thirdPerson.setPassportId(7);

        assertEquals(firstPerson.getFirstName(), "Andrey");
        assertEquals(firstPerson.getLastName(), "Khlebodarov");
        assertEquals(firstPerson.getPassportId(), 1);

        assertEquals(secondPerson.getFirstName(), "Tom");
        assertEquals(secondPerson.getLastName(), "Hardy");
        assertEquals(secondPerson.getPassportId(), 612);

        assertEquals(thirdPerson.getFirstName(), "Cristiano");
        assertEquals(thirdPerson.getLastName(), "Ronaldo");
        assertEquals(thirdPerson.getPassportId(), 7);
    }

    @Test
    public void testToString() {
        Person person = new Person("Andrey", "Khlebodarov", 789);
        assertEquals(person.toString(), "Andrey Khlebodarov");
    }
}