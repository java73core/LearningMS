package Degree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewtonTest {

    @Test
    public void convert() {
        double in = 8.0;
        double expected = 2.64;
        Newton var = new Newton();
        double result = var.convert(in);
        Assert.assertEquals(expected,result,0.0);
    }
}