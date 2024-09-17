package alm1.workhub.tictactoe.component;

import alm1.workhub.tictactoe.model.Cell;

public interface CellNumberConverter {

    Cell toCell(char number);

    char toNumber(Cell cell);



}
