package junit;

import org.junit.Assert;
import org.junit.Test;
import test_junit.CoverageTest;

public class MinusTest {
    @Test
    public void testMinus(){
        int b = CoverageTest.minus(55, 20);
        Assert.assertEquals(b,35);
    }
}