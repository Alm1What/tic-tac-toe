package alm1.workhub.tictactoe.component;

import alm1.workhub.tictactoe.model.Cell;
import alm1.workhub.tictactoe.model.GameTable;

public class WinnerVerifier {
    public boolean isUserWin(final GameTable gameTable) {
        return isWinner(gameTable, 'X');
    }

    public boolean isComputerWin(final GameTable gameTable) {
        return isWinner(gameTable, '0');
    }

    private boolean isWinner(final GameTable gameTable, final char sign) {
        return isWinnerByRows(gameTable, sign) ||
                isWinnerByCol(gameTable, sign) ||
                isWinnerByMainDiagonal(gameTable, sign) ||
                isWinnerBySecondaryDiagonal(gameTable, sign);


    }

    private boolean isWinnerBySecondaryDiagonal(final GameTable gameTable, final char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(2, 2)) == gameTable.getSign(new Cell(1, 1)) &&
                    gameTable.getSign(new Cell(2, 2)) == gameTable.getSign(new Cell(0, 0)) &&
                    gameTable.getSign(new Cell(2, 2)) == sign) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByMainDiagonal(final GameTable gameTable, final char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(2, 0)) == gameTable.getSign(new Cell(1, 1)) &&
                    gameTable.getSign(new Cell(2, 0)) == gameTable.getSign(new Cell(0, 2)) &&
                    gameTable.getSign(new Cell(2, 0)) == sign) {
                return true;
            }
        }
        return false;
    }


    private boolean isWinnerByRows(final GameTable gameTable, final char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(i, 0)) == gameTable.getSign(new Cell(i, 1)) &&
                    gameTable.getSign(new Cell(i, 0)) == gameTable.getSign(new Cell(i, 2)) &&
                    gameTable.getSign(new Cell(i, 0)) == sign) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByCol(final GameTable gameTable, final char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(0, i)) == gameTable.getSign(new Cell(1, i)) &&
                    gameTable.getSign(new Cell(0, i)) == gameTable.getSign(new Cell(2, i)) &&
                    gameTable.getSign(new Cell(2, i)) == sign) {
                return true;
            }
        }
        return false;
    }
}
