package akoamay.cell;

class Cell {
    public int x;
    public int y;
    Cell[] connections;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        connections = new Cell[6];
    }

}