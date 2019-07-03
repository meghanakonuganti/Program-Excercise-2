package main.test.com.stackroute.pe2;
import main.java.com.stackroute.pe2.EvenCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvenCheckTest {
        EvenCheck e1;
        @Before
        public void setUp()  {
            e1 = new EvenCheck();
        }

        @After
        public void tearDown() throws Exception {
            e1 = null;
        }

        @Test
        public void checkIsEvenSuccess() {
            Boolean actualStr = e1.checkIsEven(56);
            Boolean expectedStr =true;
            assertEquals(actualStr,expectedStr);
        }

        @Test
        public void checkIsEvenFailure() {
            Boolean actualStr = e1.checkIsEven(53);
            Boolean expectedStr = false;
            assertEquals(actualStr,expectedStr);
        }
    }
