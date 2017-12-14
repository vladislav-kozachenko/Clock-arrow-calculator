package javaclasses.clock.impl;

import javaclasses.clock.ArrowAngleCalculator;

public class PreciseArrowAngleCalculator extends ArrowAngleCalculator {
    @Override
    public double calculate(int hours, int minutes) {
        validateArguments(hours, minutes);

        final double hourArrowShift = minutes * 0.5;
        final double hoursPosition = 360/12 * hours + hourArrowShift;
        final double minutesPosition = 360/60 * minutes;

        final double result = Math.abs(hoursPosition - minutesPosition);

        return result <= 180 ? result : 360 - result;
    }
}
