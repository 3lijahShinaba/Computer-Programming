import java.util.Scanner;

public class TicTacToe {
    private static final int ROW = 3;
    private static final int COL = 3;
    private static String[][] board = new String[ROW][COL];
    private static String currentPlayer = "X"; // X starts first

    public static void main(String[] args) {
        initializeBoard();
        display();

        // Game loop
        while (true) {
            getMove();
            display();

            if (isWin(currentPlayer)) {
                System.out.println(currentPlayer + " wins!");
                break;
            }

            if (isTie()) {
                System.out.println("It's a tie!");
                break;
            }

            togglePlayer();
        }
    }

    // Helper methods
    private static void initializeBoard() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                board[i][j] = " ";
            }
        }
    }

    private static void display() {
        System.out.println("-------------");
        for (int i = 0; i < ROW; i++) {
            System.out.print("| ");
            for (int j = 0; j < COL; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private static void getMove() {
        int row, col;
        do {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            row = getRangedInt(1, 3) - 1; // Convert to array index
            col = getRangedInt(1, 3) - 1; // Convert to array index
        } while (!isValidMove(row, col));
        board[row][col] = currentPlayer;
    }

    private static boolean isValidMove(int row, int col) {
        if (row < 0 || row >= ROW || col < 0 || col >= COL || !board[row][col].equals(" ")) {
            System.out.println("Invalid move. Try again.");
            return false;
        }
        return true;
    }

    private static boolean isWin(String player) {
        return isRowWin(player) || isColWin(player) || isDiagonalWin(player);
    }

    private static boolean isRowWin(String player) {
        for (int i = 0; i < ROW; i++) {
            if (board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isColWin(String player) {
        for (int j = 0; j < COL; j++) {
            if (board[0][j].equals(player) && board[1][j].equals(player) && board[2][j].equals(player)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDiagonalWin(String player) {
        return (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) ||
                (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player));
    }

    private static boolean isTie() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (board[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void togglePlayer() {
        currentPlayer = (currentPlayer.equals("X")) ? "O" : "X";
    }

    private static int getRangedInt(int low, int high) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("Enter a number between " + low + " and " + high + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input < low || input > high);
        return input;
    }
}
