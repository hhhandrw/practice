package ru.ssau.tk.love.idea.controlWork;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CarTest {
    @Test
    public void constructorTest() {
        Car firstCar = new Car("777", "Fiat", "Andrey");
        assertEquals(Car.counter, 1);
        Car secondCar = new Car("888", "BMW", "Oleg");
        assertEquals(Car.counter, 2);
    }
}