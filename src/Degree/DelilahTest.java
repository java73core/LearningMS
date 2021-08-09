package Degree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DelilahTest {

    @Test
    public void convert() {
        double in = 8.0;
        double expected = 88.0;
        Delilah var = new Delilah();
        double result = var.convert(in);
        Assert.assertEquals(expected,result,0.0);
    }
}