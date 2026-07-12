package technicalTasks;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        boolean playAgain = true;

        while (playAgain) {
            playGame();
            System.out.println("\nХотите сыграть еще раз? (Да/Нет)");
            String answer = sc.nextLine();
            if (!answer.equalsIgnoreCase("Да")) {
                System.out.println("Прощайте, до свидания.");
                playAgain = false;
            }
        }
    }

    public static void playGame() {
        char[][] board = {
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'}
        };

        boolean isPlayerTurn = random.nextBoolean();
        char playerSymbol = isPlayerTurn ? 'X' : 'O';
        char compSymbol = isPlayerTurn ? 'O' : 'X';
        char currentSymbol = 'X';

        System.out.println("\n=== ИГРА НАЧАЛАСЬ ===");
        System.out.println("Вы играете за: " + playerSymbol + ". Компьютер за: " + compSymbol);
        System.out.println(isPlayerTurn ? "Ваш ход первый!" : "Компьютер ходит первым!");

        while (true) {
            printBoard(board);

            if (isPlayerTurn) {
                playerMove(board, currentSymbol);
            } else {
                computerMove(board, currentSymbol);
            }

            if (checkWin(board, currentSymbol)) {
                printBoard(board);
                if (isPlayerTurn) {
                    System.out.println("ПОБЕДА! Вы выиграли!");
                } else {
                    System.out.println("ПОРАЖЕНИЕ! Победил искусственный интеллект!");
                }
                break;
            }

            if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("НИЧЬЯ! Свободных клеток не осталось.");
                break;
            }

            isPlayerTurn = !isPlayerTurn;
            currentSymbol = (currentSymbol == 'X') ? 'O' : 'X';
        }
    }

    public static void printBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void playerMove(char[][] board, char symbol) {
        while (true) {
            System.out.println("Ваш ход (" + symbol + "). Введите координаты (строка и столбец):");
            String input = sc.nextLine();
            String[] parts = input.split("[,\\s]+");

            if (parts.length != 2) {
                System.out.println("Ошибка! Нужно ввести два числа (например: 1 2 или 1,2).");
                continue;
            }

            if (!isNumeric(parts[0]) || !isNumeric(parts[1])) {
                System.out.println("Ошибка! Введите числа, а не текст.");
                continue;
            }

            int row = Integer.parseInt(parts[0]) - 1;
            int col = Integer.parseInt(parts[1]) - 1;

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Ошибка! Координаты должны быть от 1 до 3.");
                continue;
            }

            if (board[row][col] != '*') {
                System.out.println("Ошибка! Эта клетка уже занята.");
                continue;
            }

            board[row][col] = symbol;
            break;
        }
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static void computerMove(char[][] board, char symbol) {
        System.out.println("Компьютер делает ход (" + symbol + ")...");
        while (true) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);

            if (board[row][col] == '*') {
                board[row][col] = symbol;
                break;
            }
        }
    }

    public static boolean checkWin(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '*') {
                    return false;
                }
            }
        }
        return true;
    }
}