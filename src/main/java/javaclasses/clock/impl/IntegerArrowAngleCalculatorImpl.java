package javaclasses.clock.impl;

import com.google.common.base.Preconditions;
import javaclasses.clock.ArrowAngleCalculator;

public class IntegerArrowAngleCalculatorImpl implements ArrowAngleCalculator{

    public double calculate(int hours, int minutes) {

        validateArguments(hours, minutes);

        final int hoursPosition = 360/12 * hours;
        final int minutesPosition = 360/60 * minutes;

        final int result = Math.abs(hoursPosition - minutesPosition);

        return result <= 180 ? result : 360 - result;

    }

    private void validateArguments(int hours, int minutes) {
        Preconditions.checkArgument(hours >= 0 && hours <=12);
        Preconditions.checkArgument(minutes >= 0 && minutes <=60);
    }

}
