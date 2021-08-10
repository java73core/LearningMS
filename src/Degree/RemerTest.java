package Degree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemerTest {

    @Test
    public void convert() {
        double in = 8.0;
        double expected = 11.7;
        Remer var = new Remer();
        double result = var.convert(in);
        Assert.assertEquals(expected,result,0.0);
    }
}