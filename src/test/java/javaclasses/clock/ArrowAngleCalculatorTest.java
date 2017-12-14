package javaclasses.clock;

import javaclasses.clock.impl.IntegerArrowAngleCalculatorImpl;
import org.junit.Assert;
import org.junit.Test;

public class ArrowAngleCalculatorTest {

    private final IntegerArrowAngleCalculatorImpl calculator = new IntegerArrowAngleCalculatorImpl();

    @Test
    public void testCalculate(){
        final double result = calculator.calculate(6,15);
        Assert.assertEquals(90, result, 0.00001);
    }

    @Test
    public void testCalculateCriticalValues(){
        final double result = calculator.calculate(0,60);
        Assert.assertEquals(0, result, 0.00001);
    }

    @Test
    public void testCalculateValues(){
        final double result = calculator.calculate(9,30);
        Assert.assertEquals(90, result, 0.00001);
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
