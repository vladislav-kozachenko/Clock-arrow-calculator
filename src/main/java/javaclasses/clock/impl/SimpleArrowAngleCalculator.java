package javaclasses.clock.impl;

import com.google.common.base.Preconditions;
import javaclasses.clock.ArrowAngleCalculator;

public class SimpleArrowAngleCalculator extends ArrowAngleCalculator{

    public double calculate(int hours, int minutes) {

        validateArguments(hours, minutes);

        final int hoursPosition = 360/12 * hours;
        final int minutesPosition = 360/60 * minutes;

        final int result = Math.abs(hoursPosition - minutesPosition);

        return result <= 180 ? result : 360 - result;

    }

}
