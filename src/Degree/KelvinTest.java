package Degree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinTest {

    @Test
    public void convert() {
        double in = 8.0;
        double expected = 281.15;
        Kelvin var = new Kelvin();
        double result = var.convert(in);
        Assert.assertEquals(expected,result,0.0);
    }
}