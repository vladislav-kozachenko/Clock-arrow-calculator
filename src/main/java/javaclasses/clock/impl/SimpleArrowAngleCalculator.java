package javaclasses.clock.impl;

import javaclasses.clock.ArrowAngleCalculator;

/**
 * Basic implementation of clock arrow angle calculator.
 */
public class SimpleArrowAngleCalculator extends ArrowAngleCalculator{

    public double calculate(int hours, int minutes) {

        validateArguments(hours, minutes);

        final int hoursArrowPosition = 360/12 * hours;
        final int minutesArrowPosition = 360/60 * minutes;

        final int result = Math.abs(hoursArrowPosition - minutesArrowPosition);

        return result <= 180 ? result : 360 - result;

    }

}
