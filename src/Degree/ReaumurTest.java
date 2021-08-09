package Degree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReaumurTest {

    @Test
    public void convert() {
        double in = 8.0;
        double expected = 6.40;
        Reaumur var = new Reaumur();
        double result = var.convert(in);
        Assert.assertEquals(expected,result,0.0);
    }
}