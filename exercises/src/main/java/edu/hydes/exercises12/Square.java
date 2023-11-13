package edu.hydes.exercises12;

//SINCE PARENT IS SHAPE, HAS TO FOLLOW RULES OF SHAPE
//getArea() is abstract in Shape, so it must be implemented in Square
//Square is not abstract and does not override abstract method getArea() in Shape
public class Square extends Shape {
    private double side = 1.0;

    public double getArea() {
        return side * side;
    }
}