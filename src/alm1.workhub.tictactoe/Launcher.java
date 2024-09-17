package alm1.workhub.tictactoe;

import alm1.workhub.tictactoe.component.*;

public final class Launcher {
    public static void main(String[] args) {
        Game game = new Game(new DataPrinter(), new ComputerMove(), new UserMove(), new WinnerVerifier(), new CellVerifier());
        game.play();

    }
}
