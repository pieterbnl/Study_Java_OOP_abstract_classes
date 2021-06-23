package com.pbe;

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Rectangle area()");
        return dim1 * dim2;
    }
}
