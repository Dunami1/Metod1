package app;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        System.out.println("Квадрат числа " + number + " дорівнює " + (number * number) + ".");

        double radius = 3.5;
        double height = 10.0;
        double volume = Math.PI * radius * radius * height;
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Масив чисел: [10, 20, 30, 40, 50]");
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        scanner.nextLine();
        System.out.print("Введіть рядок: ");
        String inputString = scanner.nextLine();
        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("Рядок в зворотньому порядку: " + reversedString);

        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        int powerResult = (int) Math.pow(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + powerResult + ".");

        System.out.print("Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String textString = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(textString);
        }

        scanner.close();
    }
}