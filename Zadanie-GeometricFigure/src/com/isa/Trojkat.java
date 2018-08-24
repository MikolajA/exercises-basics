package com.isa;

public class Trojkat extends Print implements GeometricFigure {

    double h;
    double a;
    double b;
    double c;

    public Trojkat(double h, double a, double b, double c) {

        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double obwod() {

        return a + b + c;
    }

    @Override
    public double pole() {

        return (a * h) / 2;
    }

    @Override
    public void figura() {

        System.out.println("Trojkat");
    }
}
