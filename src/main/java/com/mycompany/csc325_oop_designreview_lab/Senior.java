package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Jonathan Crain
 */
public class Senior extends Student {

    int credits;

    /**
     * Constructor.
     *
     * @param name
     * @param age
     * @param credits
     * @throws InsufficientCreditsException
     */
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
        return "Senior{" + "name=" + super.getName() + " age=" + super.getAge() + " gpa=" + gpa + " credits=" + credits + '}';
    }
}
