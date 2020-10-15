package t0;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJUnit0 {
    static int control=0;

    int value1=0, value2=0;
    int expected_result=0, actual_result=0;

    @Before
    public void setUp() {
        control = 1;

        value1 = 1;
        value2 = 3;
        expected_result = 4;
    }

    @Test
    public void testAddOp1() {
        actual_result = value1 + value2;
        Assert.assertEquals(expected_result, actual_result);
    }

    @Test
    public void testAddOp2() {
        actual_result = value1 + value2 + 1;
        Assert.assertNotEquals(expected_result, actual_result);
    }

    @After
    public void tearDown() {
        control = 0;
    }
}
