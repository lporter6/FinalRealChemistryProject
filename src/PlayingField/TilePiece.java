package PlayingField;

import GameObject.GameObject;

public class TilePiece {

    public int row;
    public int column;
    public GameObject item;
    public int x;
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getRow() {
        return row;
    }

    public GameObject getItem() {
        return item;
    }

    public void setItem(GameObject item) {
        this.item = item;
    }

    public int getColumn() {

        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {

        this.row = row;
    }

    public TilePiece(int row, int column){

        this.row = row;
        this.column = column;
        this.x = row*32;
        this.y = column*32;

    }

}
