/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *Exception thrown if a subtype of Student is created with insufficient credits for that subtype.
 * @author niarc
 */
public class InsufficientCreditsException extends Exception{
    public InsufficientCreditsException(String errorMessage){
        super(errorMessage);
    }
}
