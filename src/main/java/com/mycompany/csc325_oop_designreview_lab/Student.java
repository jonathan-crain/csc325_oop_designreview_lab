package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {

    double gpa;

    /**
     * Constructor.
     *
     * @param name
     * @param age
     */
    public Student(String name, short age) {
        super(name, age);
    }

    /**
     * Gets the student's GPA.
     * @return
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Sets the student's GPA.
     *
     * @param gpa
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
