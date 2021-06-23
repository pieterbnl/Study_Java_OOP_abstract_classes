package com.pbe;

abstract class Figure {

    double dim1;
    double dim2;

    // Constructor that accepts 2 doubles and sets them as dim1 and dim2
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // Setting area() as abstract method. Meaning that all subclasses of Figure must override area()
    abstract double area();
}