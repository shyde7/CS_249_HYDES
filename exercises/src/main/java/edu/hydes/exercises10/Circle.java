package edu.hydes.exercises10;

import edu.hydes.exercises09.Matrix;
import edu.hydes.exercises13.InvalidRadiusException;
public class Circle {
    private double radius = 1.0;
    private Matrix center = Matrix.makePoint3D(0, 0, 0);

    public Circle(){}

    public Circle(double r)throws InvalidRadiusException {
        setRadius(r);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) throws InvalidRadiusException {
        if(radius >= 0) {
            this.radius = radius;
        }
        else{
            throw new InvalidRadiusException("Bad Radius: " + radius);
        }
    }


    public Matrix getCenter() {
        return new Matrix (center);
    }

    public void setCenter(Matrix other){
        center = new Matrix(other);
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "(circle, radius=" + radius
                + ", center =" + center.toPoint3DString() + ")";
    }
}