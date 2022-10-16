import java.util.Scanner; // мпорт библиотеки для работы с вводом

public class App {
    // однострочный комментарий
    /*
        многострочный комментарий
     */
    public static void main(String[] args) {
        // вывод в консоль
        // System.out.println("Hello world!");

        /* ввод с клавиатуры
           Scanner input = new Scanner(System.in);
           int age = input.nextInt();
         */

        /*
            1. Если меньше 18 -> молодой
            2. Если меньше 65 и больше 18, то взрослый
            3. Если больше 65, то пенсионер
         */


        System.out.print("Введите возраст: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age <= 18) {
            System.out.println("Молодой");
        } else if (age < 65) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Старый");
        }


        System.out.print("Введите первое число: ");
        int a = input.nextInt();
        System.out.print("Введите второе число: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("Первое число больше второго");
        } else if (b > a) {
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Числа равны");
        }

    }
}
