package com.isa;

public class Prostokat extends Print implements GeometricFigure {

    double a;
    double b;

    public Prostokat(double a, double b) {

        this.a = a;
        this.b = b;
    }

    @Override
    public double obwod() {

        return 2 * a + 2 * b;
    }

    @Override
    public double pole() {

        return a * b;
    }

    @Override
    public void figura() {

        System.out.println("Prostokat");
    }
}
