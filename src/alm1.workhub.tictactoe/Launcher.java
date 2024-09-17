package alm1.workhub.tictactoe;

import alm1.workhub.tictactoe.component.*;

public final class Launcher {

    public static void main(String[] args) {
        final CellNumberConverter cellNumberConverter = new CellNumberConverter();
        Game game = new Game(new DataPrinter(cellNumberConverter),
                new ComputerMove(), new UserMove(cellNumberConverter),
                new WinnerVerifier(),
                new CellVerifier()
        );
        game.play();

    }
}
