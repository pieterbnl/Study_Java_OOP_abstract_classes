package com.pbe;

public class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Triangle area()");
        return dim1 * dim2 / 2;
    }
}
