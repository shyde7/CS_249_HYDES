package edu.hydes.assign04;

public class ScreenBuffer {
    private final int rowCnt;
    private final int colCnt;
    private final char fillChar;
    private final char [][] screen;

    public ScreenBuffer(int rowCnt, int colCnt, char fillChar) {
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;

        screen = new char[rowCnt][colCnt];

        for(int r = 0; r < rowCnt; r++) {
            for(int c = 0; c < colCnt; c++) {
                screen[r][c] = fillChar;
            }
        }
    }


    public void clear() {
        for (int r = 0; r < rowCnt; r++) {
            for (int c = 0; c < colCnt; c++) {
                screen[r][c] = fillChar;
            }
        }
    }

    public int getRowCnt() {
        return rowCnt;
    }

    public int getColCnt() {
        return colCnt;
    }

    public boolean isValidPosition(int row, int col) {
        return row >= 0 && row < rowCnt && col >= 0 && col < colCnt;
    }

    public char getPos(int row, int col) {
        if (isValidPosition(row, col)) {
            return screen[row][col];
        } else {
            return ' ';
        }
    }

    public boolean setPos(int row, int col, char c) {
        if (isValidPosition(row, col)) {
            screen[row][col] = c;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String sb = rowCnt + " x " + colCnt
                + " ScreenBuffer (default: " + fillChar + ")";

        return sb;
    }

    public String getDisplayString() {
        StringBuilder sb = new StringBuilder();

        for(int r = 0; r < rowCnt; r++) {
            for(int c = 0; c < colCnt; c++) {
                sb.append(screen[r][c]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}



