package javaclasses.clock;

import com.google.common.base.Preconditions;

public abstract class ArrowAngleCalculator {

    public abstract double calculate(int hours, int minutes);

    protected void validateArguments(int hours, int minutes) {
        Preconditions.checkArgument(hours >= 0 && hours <=12);
        Preconditions.checkArgument(minutes >= 0 && minutes <=60);
    }


}
