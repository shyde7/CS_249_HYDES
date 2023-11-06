package edu.hydes.assign04;

public class Box {
    private final int startRow;
    private final int startCol;
    private final int endRow;
    private final int endCol;
    private final boolean isFilled;
    private final char drawChar;
    public Box(int sr, int sc, int er, int ec, boolean filled, char drawChar){
        this.startRow = sr;
        this.startCol = sc;
        this.endRow = er;
        this.endCol = ec;
        this.isFilled = filled;
        this.drawChar = drawChar;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(isFilled) {
            sb.append("Filled ");
        }
        sb.append("Box from (" + startRow + "," + startCol +
                  ") to (" + endRow + "," + endCol +
                  ") with char " + "'" +drawChar+"'");
        return sb.toString();
    }

    public void draw(ScreenBuffer s){

        for(int r = startRow; r <= endRow; r++){
            for(int c = startCol; c <= endCol; c++){
                if(isFilled || r == startRow || r == endRow || c == startCol || c == endCol){
                    s.setPos(r, c, drawChar);
                }
            }
        }

    }
}
