package main.test.com.stackroute.pe2;
import main.java.com.stackroute.pe2.PowerOfFour;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
        PowerOfFour p1;
        @Before
        public void setUp()  {
            p1 = new PowerOfFour();
        }

        @After
        public void tearDown() throws Exception {
            p1 = null;
        }

        @Test
        public void checkPowerOfFourSuccess() {
            String actualStr = p1.checkPowerOfFour(256);
            String expectedStr = "Number is a power of 4";
            assertEquals(actualStr,expectedStr);
        }

        @Test
        public void checkPowerOfFourFailure() {
            String actualStr = p1.checkPowerOfFour(150);
            String expectedStr = "Number is not a power of 4";
            assertEquals(actualStr,expectedStr);
        }
    }
