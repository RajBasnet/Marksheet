/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pc.util;

/**
 *
 * @author Dell
 */
public class Calculator {

    public double getTotal(double Sci, double Math, double Comp) {
        return Sci + Math + Comp;

    }

    public double getPercentage(double Sci, double Math, double Comp){
    return  (Sci+ Math+ Comp)/3;
    }

}
