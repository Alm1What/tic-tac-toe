package alm1.workhub.tictactoe.keypad;

import alm1.workhub.tictactoe.component.CellNumberConverter;
import alm1.workhub.tictactoe.model.Cell;

public class DesktopNumericKeypadCellNumberConverter implements CellNumberConverter {

    private final char[][] mapping = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'}
    };


    @Override
    public Cell toCell(final char number) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mapping[i][j] == number) {
                    return new Cell(i, j);
                }
            }
        }
        return null;
    }

    @Override
    public char toNumber(final Cell cell) {
        return mapping[cell.getRow()][cell.getCol()];
    }
}
