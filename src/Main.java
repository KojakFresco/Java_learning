import java.util.Scanner;

public class Main {

    public static void solutionSingleNum() {

        int userNum;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Задача: угадай число от 0 до 9");

        int num = (int)Math.floor(Math.random() * 10);

        do {
            count++;
            System.out.print("Введите ваше число: ");
            userNum = input.nextInt();

            if (userNum > num) {
                System.out.println("Мое число меньше");
            } else if (userNum < num) {
                System.out.println("Мое число больше");
            } else {
                System.out.println("Вы угадали число. Это действительно " + num);
            }

        } while(userNum != num);

        System.out.println("Число затраченных попыток: " + count);

    }


    public static void solutionDualNum() {

        int userNum1 = -1;
        int userNum2 = -1;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Задача: угадать 2 числа (от 1 до 15 и от 0 до 5)");

        int num1 = (int) Math.floor(Math.random() * 15 + 1);
        int num2 = (int) Math.floor(Math.random() * 6);

        do {
            count++;

            if (userNum1 != num1) {
                System.out.println("Введите 1 число: ");

                userNum1 = input.nextInt();

                if (userNum1 > num1) {
                    System.out.println("1 число меньше");
                } else if (userNum1 < num1) {
                    System.out.println("1 число больше");
                } else {
                    System.out.println("Вы угадали первое число");
                }
            }
            if (userNum2 != num2) {
                System.out.println("Введите 2 число: ");

                userNum2 = input.nextInt();

                if (userNum2 > num2) {
                    System.out.println("2 число меньше");
                } else if (userNum2 < num2) {
                    System.out.println("2 число больше");
                } else {
                    System.out.println("Вы угадали второе число");
                }
            }

        } while (userNum1 != num1 || userNum2 != num2);

        System.out.println("Число затраченных попыток: " + count);
    }


    public static void main(String[] args) {
        System.out.println("Выберите вариант решения: \n '1' - угадывать одно число \n '2' - угадывать два числа");
        Scanner input = new Scanner(System.in);
        int solN = input.nextInt();
        if (solN == 1) {
            solutionSingleNum();
        } else {
            solutionDualNum();
        }
    }
}
/*
Компьютер должен загадать число от 0 до 9
Пользователю нужно угадать это число
В программе должен вестись подсчет кол-ва попыток
 */
