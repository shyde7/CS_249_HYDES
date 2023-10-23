package edu.hydes.exercises12;

import edu.hydes.exercises09.Matrix;

public class SuperShapeLand {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape(Matrix.makePoint3D(1, 2, 3), true);

        System.out.println(s1);
        System.out.println(s2);

        Circle c1 = new Circle();
        c1.setFilled(true);
        System.out.println(c1);
    }
}
