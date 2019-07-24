package test.java;

import main.java.Task1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestTask1 {
    private Task1 t1 = new Task1();

    @Test(dataProvider = "minvalue")
    public void testMinData(int actual, int expect) {
        //actual = t1.min(1,2,4);
        //expect = 0;
        assertEquals(actual, expect,
                "Min value is incorrect. Expected " + expect + " Actual " + actual);
    }

    @DataProvider
    public Object[][] minvalue() {
        return new Object[][]{
                {t1.min(5, 2, 3), 2},
                {t1.min(2, 5, 3), 2},
                {t1.min(3, 2, 5), 2},
                {t1.min(2, 3, 5), 2},
                {t1.min(0, 2, 3), 0},
                {t1.min(-5, -2, -3), -5}

        };
    }

    @Test(enabled = false)
    public void testMin1() {
        assertEquals(2, t1.min(5, 2, 3));
    }

    @Test
    public void testMin2() {
        assertEquals(2, t1.min(2, 5, 3));
    }

    @Test
    public void testMin3() {
        assertEquals(2, t1.min(3, 2, 5));
    }

    @Test
    public void testMin4() {
        assertEquals(0, t1.min(0, 2, 3));
    }

    @Test
    public void testMin5() {
        assertEquals(-5, t1.min(-5, -2, -3));
    }
}
