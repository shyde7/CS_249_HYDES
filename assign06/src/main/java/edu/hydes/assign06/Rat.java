package edu.hydes.assign06;

import edu.hydes.assign04.ScreenBuffer;

public class Rat extends Creature{

    public Rat(){}

    public Rat(int row, int col) {
        super(row, col);
    }
    public String toString(){
        return "Rat at " + getRow()
                   + "," + getCol();
    }
    public void draw(ScreenBuffer map){
        map.setPos(getRow(), getCol(), 'R');
    }
}

