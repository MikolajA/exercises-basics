package com.isa;

import java.text.DecimalFormat;

public class Fraction {

    public void math(int counter, int denominator) {

        double value = ((double) counter / (double) denominator);
        System.out.print(new DecimalFormat("0.00").format(value) + " [" + counter + "/" + denominator + "]");
    }
}
