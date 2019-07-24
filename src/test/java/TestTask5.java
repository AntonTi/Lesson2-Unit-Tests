package test.java;

import main.java.Task5;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestTask5 {
    private Task5 t5 = new Task5();

    @Test
    public void testReverse1() {
        String testStr = "!!!dlrow olleH";
        assertEquals(testStr, t5.reverse("Hello world!!!"));
    }

    @Test
    public void testReverse2() {
        String testStr = "!!!dlrow olleH";
        assertEquals(testStr.length(), t5.reverse("Hello world!!!").length());
    }

}
