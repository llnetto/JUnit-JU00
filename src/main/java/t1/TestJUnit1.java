package t1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJUnit1 {

    @Before
    public void setUp() {
    }

    @Test
    public void testMethod() {
        Assert.assertEquals("", "");
    }

    @After
    public void tearDown() {
    }
}