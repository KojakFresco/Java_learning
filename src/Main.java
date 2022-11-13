import java.util.Scanner;

public class Main {

    private static final String word = "ярослав";

    private static void application() {
        Scanner input = new Scanner(System.in);

        System.out.println("Угадай слово");
        int len = word.length();

        String wordMask = "_".repeat(len);

        System.out.println(wordMask);

        do {
            System.out.print("Введите букву: ");
            String c0 = input.next();
            char c = c0.charAt(0);

            if (word.indexOf(c) >= 0) {
                System.out.println("Такая буква есть в слове!");

                for (int i = 0; i < len; i++) {
                    if (word.charAt(i) == c) {
                        wordMask = replaceLetter(Character.toString(c), wordMask);
                    }
                }
                System.out.println(wordMask);
            } else {
                System.out.println("Такой буквы нет в слове.");
            }

        } while (wordMask.contains("_"));
        System.out.println("Вы угадали слово!");
    }

    public static void main(String[] args) {
        application();
    }

    private static String replaceLetter(String letter, String wordMask) {
        StringBuilder sB = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                sB.append(letter);
            } else if (wordMask.charAt(i) != '_') {
                sB.append(wordMask.charAt(i));
            }
            else {
                sB.append("_");
            }
        }
        return sB.toString();
    }
}