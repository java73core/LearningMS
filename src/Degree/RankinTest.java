package Degree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RankinTest {

    @Test
    public void convert() {
        double in = 8.0;
        double expected = 506.07;
        Rankin var = new Rankin();
        double result = var.convert(in);
        Assert.assertEquals(expected,result,0.0);
    }
}