package edu.realemj.exercises11;

public class Wagon {
    private WagonPace pace = WagonPace.MEDIUM;
    private int milesTraveled = 0;
    private int daysTraveled = 0;

    public Wagon() {}

    public Wagon(WagonPace pace) {
        this.pace = pace;
    }

    public int travelForDay() {
        milesTraveled += pace.getSpeed();
        daysTraveled++;
        return pace.getSpeed();
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public int getDaysTraveled() {
        return daysTraveled;
    }

    public WagonPace getCurrentPace() {
        return pace;
    }

    public boolean setCurrentPace(WagonPace pace) {
        this.pace = pace;
        return true;
    }

}
