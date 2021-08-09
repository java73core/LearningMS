package Degree;

import org.junit.Assert;
import org.junit.Test;


public class FaringateTest {

    @Test
    public void convert() {
        double in = 8.0;
        double expected = 72.0;
        Faringate var = new Faringate();
        double result = var.convert(in);
       Assert.assertEquals(expected,result,0.0);
    }
}