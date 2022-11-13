import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static String[] gameField;
    static Scanner input;
    static String turn;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        gameField = new String[9];
        turn = "X";
        String winner = null;
        emptyField();
        System.out.println("Добро пожаловать в крестики-нолики!");
        System.out.println("-------------------");
        printField();
        System.out.println("X ходит первый.");

        while (winner == null) {
            int numInput;

            try {
                System.out.print("Введите номер клетки игрового поля: ");
                numInput = input.nextInt();
                if (numInput < 1 || numInput > 9) {
                    System.out.print("Ошибка ввода! Введите корректный номер клетки!");
                    continue;
                }
            } catch (InputMismatchException e) {
                    System.out.print("Ошибка ввода! Введите корректный номер клетки!");
                    continue;
            }
            if (gameField[numInput - 1].equals(String.valueOf(numInput))) {
                gameField[numInput - 1] = turn;
                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
                printField();
                winner = checkWinner();
            } else {
                System.out.println("Тупой? Эта клетка занята!");
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("Ничья!");
        } else {
            System.out.println(winner + " победили!");
        }
    }

    static String checkWinner() {
        for (int i = 0; i < 8; i++) {
            String line = switch (i) {
                case 0 -> gameField[0] + gameField[1] + gameField[2];
                case 1 -> gameField[3] + gameField[4] + gameField[5];
                case 2 -> gameField[6] + gameField[7] + gameField[8];
                case 3 -> gameField[0] + gameField[3] + gameField[6];
                case 4 -> gameField[1] + gameField[4] + gameField[7];
                case 5 -> gameField[2] + gameField[5] + gameField[8];
                case 6 -> gameField[6] + gameField[4] + gameField[2];
                case 7 -> gameField[0] + gameField[4] + gameField[8];
                default -> null;
            };
            if (line.equals("XXX")) {
                return "Крестики";
            } else if (line.equals("OOO")) {
                return "Нолики";
            }
        }
        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(gameField).contains(String.valueOf(i + 1))) {
                break;
            } else if (i == 8) {
                return "draw";
            }
        }
        return null;
    }
    static void emptyField() {
        for (int i = 0; i < 9; i++) {
            gameField[i] = String.valueOf(i + 1);
        }
    }

    static void printField() {
        System.out.println("|---|---|---|");
        System.out.println("| " + gameField[0] + " | " + gameField[1] + " | " + gameField[2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + gameField[3] + " | " + gameField[4] + " | " + gameField[5] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + gameField[6] + " | " + gameField[7] + " | " + gameField[8] + " |");
        System.out.println("|---|---|---|");
    }

}