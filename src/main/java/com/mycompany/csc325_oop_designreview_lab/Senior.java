package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Jonathan Crain
 */
public class Senior extends Student {

    int credits;

    public Senior(String name, short age, int credits) throws InsufficientCreditsException {
        super(name, age);
        if (credits < 85) {
            throw new InsufficientCreditsException("Insufficient credits. Senior must have 85 or more credits.");
        } else {
            this.credits = credits;
        }
    }

    @Override
    public String toString() {
        return "Senior{" + "credits=" + credits + '}';
    }
}
