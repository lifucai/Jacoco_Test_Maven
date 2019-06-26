package junit;

import org.junit.Assert;
import org.junit.Test;
import test_junit.CoverageTest;


public class AddTest {
    @Test
    public void testAdd(){
        int b = CoverageTest.add(5, 20);
        Assert.assertEquals(b,50);
    }
}