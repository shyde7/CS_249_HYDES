package edu.hydes.exercises15.adapter;

public interface Tensor {
    int getRowCnt();
    int getColCnt();
    double get(int row, int col);

    public void set(int row, int col, double val);
}
