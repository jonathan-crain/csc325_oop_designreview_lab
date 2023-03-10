package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Jonathan Crain
 */
public class Freshman extends Student {

    int credits;

    /**
     * Constructor.
     *
     * @param name
     * @param age
     * @param credits
     */
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Freshman{" + "credits=" + credits + '}';
    }
}
