package javaclasses.clock;

import javaclasses.clock.impl.PreciseArrowAngleCalculator;
import org.junit.Assert;
import org.junit.Test;

public class PreciseArrowAngleCalculatorTest {

    private final ArrowAngleCalculator calculator = new PreciseArrowAngleCalculator();

    @Test
    public void testCalculate(){
        final double result = calculator.calculate(9,30);
        Assert.assertEquals(105, result, 0.00001);
    }

    @Test
    public void testPreciseCalculate(){
        final double result = calculator.calculate(3,15);
        Assert.assertEquals(7.5, result, 0.00001);
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
