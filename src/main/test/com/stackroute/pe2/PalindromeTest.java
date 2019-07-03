package main.test.com.stackroute.pe2;
import main.java.com.stackroute.pe2.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome checkPalindrome;
    @Before
    public void setUp() throws Exception {
        checkPalindrome = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        checkPalindrome = null;
    }

    @Test
    public void TestPalindromeSuccess() throws Exception{
        String expectedValue = "liril";
        //Act
        String actualValue = checkPalindrome.checkPalindrome("liril");
        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void TestPalindromeFailure(){
        String expectedValue = "12321";
        //Act
        String actualValue = checkPalindrome.checkPalindrome("123");
        //Assert
        assertNotEquals(expectedValue,actualValue);
    }

}