import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userInt;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Задача: угадай число от 0 до 100");

        int num = (int)Math.floor(Math.random() * 10);

        do {
            count++;
            System.out.print("Введите ваше число: ");
            userInt = input.nextInt();

            if (userInt > num) {
                System.out.println("Мое число меньше");
            } else if (userInt < num) {
                System.out.println("Мое число больше");
            } else {
                System.out.println("Вы угадали число. Это действительно " + num);

            }

        } while(userInt != num);

        System.out.println("Число затраченных попыток: " + count);

    }
}
/*
Компьютер должен загадать число от 0 до 9
Пользователю нужно угадать это число
В программе должен вестись подсчет кол-ва попыток
 */
