package alm1.workhub.tictactoe.component;

import alm1.workhub.tictactoe.model.Cell;
import alm1.workhub.tictactoe.model.GameTable;

public class DataPrinter {

    public void printMappingTable() {
        System.out.println(
                "-------------\n" +
                        "| 7 | 8 | 9 |\n" +
                        "-------------\n" +
                        "| 4 | 5 | 6 |\n" +
                        "-------------\n" +
                        "| 1 | 2 | 3 |\n" +
                        "-------------\n"
        );
    }


    public void printGameTable(final GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable.getSign(new Cell(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }
}
