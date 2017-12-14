package javaclasses.clock.impl;

import com.google.common.base.Preconditions;

public class ArrowAngleCalculatorImpl {

    public int calculate(int hours, int minutes) {

        validateArguments(hours, minutes);

        final int hoursPosition = 360/12 * hours;
        final int minutesPosition = 360/60 * minutes;

        final int result = Math.abs(hoursPosition - minutesPosition);

        if (result <= 180) {
            return result;
        }

        return 360 - result;

    }

    private void validateArguments(int hours, int minutes) {
        Preconditions.checkArgument(hours >= 0 && hours <=12);
        Preconditions.checkArgument(minutes >= 0 && minutes <=60);
    }

}
