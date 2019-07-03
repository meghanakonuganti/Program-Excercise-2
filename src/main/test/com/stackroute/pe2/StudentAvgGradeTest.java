package main.test.com.stackroute.pe2;
import main.java.com.stackroute.pe2.StudentAvgGrade;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class StudentAvgGradeTest {
    StudentAvgGrade obj;
    @Before
    public void setUp() {
        obj = new StudentAvgGrade();
    }

    @Test
    public void StudentAvgTestSuccess()
    {
        int[] arr = new int[]{86,65,98,77};
        int expectedValueMin=65;
        int  actualValueMin=obj.studentMin(4,arr);
        assertEquals(expectedValueMin,actualValueMin);

        int expectedValueMax=98;
        int  actualValueMax=obj.studentMax(4,arr);
        assertEquals(expectedValueMax,actualValueMax);

        String expectedValueAvg="81.50";
        String  actualValueAvg=obj.studentAvg(4,arr);
        assertEquals(expectedValueAvg,actualValueAvg);
    }

    @Test
    public void StudentAvgTestFailure()
    {
        int[] arr = new int[]{86,101,98,77};
        int expectedValueMin=-1;
        int  actualValueMin=obj.studentMin(4,arr);
        assertEquals(expectedValueMin,actualValueMin);

        int expectedValueMax=-1;
        int  actualValueMax=obj.studentMax(4,arr);
        assertEquals(expectedValueMax,actualValueMax);

        String expectedValueAvg="-1";
        String  actualValueAvg=obj.studentAvg(4,arr);
        assertEquals(expectedValueAvg,actualValueAvg);
    }

    @After
    public void tearDown(){
        obj=null;
    }

}
