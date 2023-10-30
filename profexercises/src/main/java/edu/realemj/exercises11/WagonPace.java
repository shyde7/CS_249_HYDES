package edu.realemj.exercises11;

public enum WagonPace {
    STOPPED(0),
    SLOW(7),
    MEDIUM(15),
    FAST(18);

    private int speed;

    private WagonPace(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
