package javaclasses.clock;

import com.google.common.base.Preconditions;

/**
 * Represents calculator which receives hours and minutes and calculates angle in degrees between clock hands.
 */
public abstract class ArrowAngleCalculator {

    /**
     * Calculates angle between hour hand and minute hand.
     * @param hours is the position of hours hand.
     * @param minutes is the position of minutes hand.
     * @return the angle in degrees between clock hands.
     */
    public abstract double calculate(int hours, int minutes);

    protected void validateArguments(int hours, int minutes) {
        Preconditions.checkArgument(hours >= 0 && hours <=12);
        Preconditions.checkArgument(minutes >= 0 && minutes <=60);
    }


}
