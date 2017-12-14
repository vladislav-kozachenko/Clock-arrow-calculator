package javaclasses.clock;

import javaclasses.clock.impl.ArrowAngleCalculatorImpl;
import org.junit.Assert;
import org.junit.Test;

public class ArrowAngleCalculatorTest {

    private final ArrowAngleCalculatorImpl calculator = new ArrowAngleCalculatorImpl();

    @Test
    public void testCalculate(){
        final int result = calculator.calculate(0,15);
        Assert.assertEquals(90, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithInvalidArguments(){
        calculator.calculate(-2,70);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithInvalidMinutes(){
        calculator.calculate(0,70);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithInvalidHours(){
        calculator.calculate(15,30);
    }

}
