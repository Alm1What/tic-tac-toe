package alm1.workhub.tictactoe;

import alm1.workhub.tictactoe.component.*;
import alm1.workhub.tictactoe.keypad.DesktopNumericKeypadCellNumberConverter;

public final class Launcher {

    public static void main(String[] args) {
        final CellNumberConverter cellNumberConverter = new DesktopNumericKeypadCellNumberConverter();
        Game game = new Game(new DataPrinter(cellNumberConverter),
                new ComputerMove(), new UserMove(cellNumberConverter),
                new WinnerVerifier(),
                new CellVerifier()
        );
        game.play();

    }
}
