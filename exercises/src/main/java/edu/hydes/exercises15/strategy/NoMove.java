package edu.hydes.exercises15.strategy;

public class NoMove implements Moveable{
    @Override
    public void move() {
        System.out.println("Not moving!");
    }
}
