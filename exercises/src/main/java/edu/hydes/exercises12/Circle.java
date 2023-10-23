package edu.hydes.exercises12;

import edu.hydes.exercises09.Matrix;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,
                  Matrix center,
                  boolean filled){
        setRadius(radius);
        setCenter(center);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if(radius >= 0.0){
            this.radius = radius;
        }
    }

    public String toString(){
        return "Circle (radius=" + radius + ", center="
                + getCenter().toPoint3DString()
                + ", filled="
                + isFilled()
                + ")";
    }
}
