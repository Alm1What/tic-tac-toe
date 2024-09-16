package alm1.workhub.tictactoe.model;

public class Cell {

    private final int row;

    private final int col;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Cell(final int row, final int col) {
        this.row = row;
        this.col = col;
    }
}
