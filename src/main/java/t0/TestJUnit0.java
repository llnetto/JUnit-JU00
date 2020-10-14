package t0;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJUnit0 {
    protected  int value1=0, value2=0;
    protected int result=0, expected_result=0;

    @Before
    public void setUp() {
        value1 = 1;
        value2 = 3;
        expected_result = 5;
    }

    @Test
    public void testAddOp1() {
        result = value1 + value2;
        Assert.assertEquals(expected_result, result);
    }

    @Test
    public void testAddOp2() {
        result = value1 + value2 + 1;
        Assert.assertNotEquals(expected_result, result);
    }

    @After
    public void tearDown() {
        value1 = 0;
        value2 = 0;
        result = 0;
        expected_result = 0;
    }
}
