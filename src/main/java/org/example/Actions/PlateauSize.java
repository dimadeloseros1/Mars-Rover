package org.example.Actions;

public class PlateauSize {

    private int x;
    private int y;
//    private int[][] grid;

    public PlateauSize(int x, int y) {
        this.x = x;
        this.y = y;
//        this.grid = new int[x][y];
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



    @Override
    public String toString() {
        return  "ROWS " + x +
                " COLUMNS " + y;
    }
}
