package Degree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HookeTest {

    @Test
    public void convert() {
        double in = 8.0;
        double expected = 19.2;
        Hooke var = new Hooke();
        double result = var.convert(in);
        Assert.assertEquals(expected,result,0.0);
    }
    }
