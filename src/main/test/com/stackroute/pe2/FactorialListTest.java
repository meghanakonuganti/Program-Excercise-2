package main.test.com.stackroute.pe2;
import main.java.com.stackroute.pe2.FactorialList;
import main.java.com.stackroute.pe2.FactorialList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialListTest {
    FactorialList object;
    @Before
    public void setUp() throws Exception {
        object=new FactorialList();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void longFactorialCheck() {
        String res=object.longFactorial();
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",res);
    }
    @Test
    public void intFactorialCheck() {
        String res=object.intFactorial();
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n",res);
    }
}