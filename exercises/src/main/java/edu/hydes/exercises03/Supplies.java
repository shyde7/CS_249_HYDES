package edu.hydes.exercises03;

public class Supplies {
    private double totalFood;

    public double getTotalFood() {
        return totalFood;
    }

    public boolean setTotalFood(double food) {
        boolean valid = false;
        if(food >= 0){
            totalFood = food;
            valid = true;
        }
        return valid;
    }
}

