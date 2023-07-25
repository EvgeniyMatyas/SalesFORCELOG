package test.java.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CarTest {

    @Test
    public void carTest(){
        Car car1 = new Car("x6","BMW");
        Car car2 = new Car("s80","VOLVO");

        car1.setModel("x5");

        assertEquals(car1, car2);

    }
}
