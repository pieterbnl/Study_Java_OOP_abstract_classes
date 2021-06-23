package com.pbe;

/** Study on Java Object Oriented Programming: abstract classes
 @author Pieter Beernink
 @version 1.0
 @since 1.0
 */

// *********************
// ABSTRACT CLASSES
// *********************
// Abstracting is defining certain functionality, without implementing the details.
// Or said differently: abstraction is focussing on what needs to be done and not on how it needs to be done.

// Abstract classes are similar to Interfaces; they cannot be instantiated and they may contain a mix of methods declared with or without an implementation.

// However, the difference between an abstract class and interface:
// * An abstract class can 1) declare fields that are not static and final and 2) define public, protected and private concrete methods.
// Whereas an interface can have variables but they are all public static final: essentially being constant values that never change, with a static scope.
// Non static variables can be instantiated and you can't instantiate an interface.
// * An abstract class can have member variables that can be inherited.
// * An abstract class can extend only one parent class, but it can implement multiple interfaces.
// * With an abstract class that is subclassed, it's subclass should provide implementations for all of the abstract methods in its parent class.
// If it does not, then the subclass must also be declared abstract!
// * An abstract class can have constructors. Interfaces can't.
// * An abstract class methods can have any visibility. Methods of an interface are automatically public.
// * Abstract classes can have defined methods (methods with an implementation). Whereas methods in an interface are abstract
// (implementation code to be written in the class that implements the interface).

// The purpose of an abstract class is to provide a common definition of a base class that multiple derived classes can share. Use an abstract class when:
// * Code to be shared among several closely related classes (such as animals, vehicles, .. that have common traits).
// * You expect classes that extend the abstract class have many common methods, fields or required access modifiers other than public (protected, private).
// * You want to declare non static or non final fields, enabling to define methods that can access and modify the state of an object (getters & setters).
// * The base class should provide a default implementation of certain methods, but other methods should be open to being overridden by child classes.

// To make a class abstract you add the keyword 'abstract' before the class name.
// Also methods can be made abstract by adding 'abstract' before the method name. Such method does not have a body.
// For example "abstract void display();"

//Key Points to Remember
// * abstract keyword is used to create abstract classes and methods
// * an abstract method doesn't have any implementation; i.e.: it has no method body
// * a class containing abstract methods should also be abstract
// * it's not possible to create objects of an abstract class
// * objects can be created from subclasses that inherit from the abstract class (to implement features of the abstract class)
// * a subclass must override all abstract methods of an abstract class, unless a subclass is declared abstract
// * access the static attributes and methods of an abstract class using the reference of the abstract class

public class Main {

    public static void main(String[] args) {

        // creating objects
        Rectangle r = new Rectangle(10,5);
        Triangle t = new Triangle(9,8);

        // Creating reference to Figure. Meaning it can be used to refer to an object of any class derived from Figure.
        // It is through superclass reference variables that overridden methods are resolved at run time.
        // A reference variable of a superclass can be assigned a reference to any subclass derived from that superclass.
        // Since Rectangle and Triangle are subclasses of Figure, it is permissible to assign figref a reference to the Rectangle and Triangle objects.
        // When a reference to a subclass object is assigned to a superclass reference variable, only those parts of the object defined by the superclass can be accessed.
        Figure figref;

        // referring to rectangle object to get rectangle area
        figref = r;
        System.out.println("Area is " + figref.area());

        // referring to triangle object to get triangle area
        figref = t;
        System.out.println("Area is " + figref.area());

        // referring to figure object to get figure area
        // not possible since figure is abstract
        // Figure f = new Figure(10,10);

    }
}