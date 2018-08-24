package com.isa;

public class Kolo extends Print implements GeometricFigure {

    double r;

    public Kolo(double r) {

        this.r = r;

    }

    @Override
    public double obwod() {

        return Math.PI * r * 2;
    }

    @Override
    public double pole() {

        return Math.PI * Math.pow(2, r);
    }

    @Override
    public void figura() {

        System.out.println("Kolo");
    }
}
