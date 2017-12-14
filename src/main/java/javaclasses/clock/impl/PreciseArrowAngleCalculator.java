package javaclasses.clock.impl;

import javaclasses.clock.ArrowAngleCalculator;

/**
 * Represents calculator which receives hours and minutes and calculates angle in degrees between clock hands.
 * Calculates the angle considering the minute shift of hour hand.
 */
public class PreciseArrowAngleCalculator extends ArrowAngleCalculator {
    @Override
    public double calculate(int hours, int minutes) {
        validateArguments(hours, minutes);

        final double hourArrowShift = minutes * 0.5;
        final double hoursArrowPosition = 360/12 * hours + hourArrowShift;
        final double minutesArrowPosition = 360/60 * minutes;

        final double result = Math.abs(hoursArrowPosition - minutesArrowPosition);

        return result <= 180 ? result : 360 - result;
    }
}
