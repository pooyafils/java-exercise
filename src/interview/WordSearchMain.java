package interview;

public class WordSearchMain {
    public static void main(String[] args) {

        char[][] board
                = {
                {'T', 'A', 'C'},
                {'A', 'B', 'L'},
                {'X', 'I', 'E'}
        };

        boolean resultTable = WordSearch.exist(board, "TABLE");
        boolean resultTaxi = WordSearch.exist(board, "TAXI");

        System.out.println("Found 'TABLE'? " + resultTable);
        System.out.println("Found 'TAXI'? " + resultTaxi);
    }
}
