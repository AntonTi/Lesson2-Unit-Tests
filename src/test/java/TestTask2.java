package test.java;

import main.java.Task2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class TestTask2 {
    private Task2 t2 = new Task2();

    @Test
    public void testArrName1() {
        String strTest = "";
        String name = "Anton";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                strTest += name + " ";
            }
            strTest += "\n";
        }
        assertEquals(strTest, t2.printName(),
                "Array of name Anton is incorrect");
    }

    @Test
    public void testArrName2() {
        String strTest = "";
        String name = "Anton";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                strTest += name + " ";
            }
            strTest += "\n";
        }
        assertNotEquals(strTest, t2.printName(),
                "Array of name Anton is incorrect");
        //assertEquals(strTest, t2.printName());
    }

    @Test
    public void testArrName3() {
        String strTest = "";
        String name = "Anton";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                strTest += name + " ";
            }
            strTest += "\n";
        }
        assertEquals(strTest.length(), t2.printName().length(),
                "Length Array of name Anton is incorrect");

    }
}
