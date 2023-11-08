package edu.realemj.exercises12;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        String old = super.toString();
        int pindex = old.indexOf("(");
        old = old.substring(pindex + 1);
        return "Rectangle (width="
                + width + ", height="
                + height + ", " + old;
    }

    public double getArea() {
        return width*height;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(obj instanceof Rectangle other) {
            if(width == other.width
                    && height == other.height
                    && super.equals(other)) {
                isEqual = true;
            }
        }
        return isEqual;
    }
}
