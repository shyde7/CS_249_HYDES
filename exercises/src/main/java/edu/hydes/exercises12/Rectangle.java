package edu.hydes.exercises12;

public class Rectangle extends Shape {
    private int width;
    private int height;

    private int radius;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        String old = super.toString();
        int pindex = old.indexOf("(");
        old = old.substring(pindex + 1);
        return "Rectangle (width=" +
                +width + ", height="
                + height + ", " + old;
    }
@Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(obj instanceof Rectangle other){

            if(radius == other.radius){
                isEqual = true;
            }
        }
        return isEqual;
    }
}




