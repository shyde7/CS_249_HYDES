package edu.hydes.exercises10;

import edu.hydes.exercises09.Matrix;

public class Circle {
    private double radius = 1.0;
    private Matrix center = Matrix.makePoint3D(0,0,0);


    public double getRadius(){
        return radius;
    }

    public void setRadius(double r ){
        radius = r;
    }
}
