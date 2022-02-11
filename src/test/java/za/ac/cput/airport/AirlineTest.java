package za.ac.cput.airport;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;

class AirlineTest {

    private Airline airline1;
    private Airline airline2;
    private Airline airline3;


    @BeforeEach
    void setUp() {
        airline1 = new Airline();
        airline2 = new Airline();
        airline3 = airline1;


    }


    @Test
    void testIdentity() {
        assertSame(airline1, airline3);

    }

    @Test
    void testEquality() {

        assertEquals(airline3, airline1);

    }

    @Test
    void testFail() {
        fail();

    }



    @Test
    public void airlineNotExceed1Seconds() {

        Airline flight = new Airline();
        Assertions.assertTimeout(ofSeconds(0, 1), () -> flight.airline());

    }

   @Disabled
     public class StringUtilsTestUnit5Disabled{
    @Test
    void testThis() {

        String nullString = null;
        Assertions.assertNotNull(airline2);


    }

}



}