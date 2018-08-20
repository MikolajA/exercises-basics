import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj dwie liczby cakowite: ");

        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();

        int result = sum2(value1, value2);
        System.out.println("Wynik: " +result);
    }

    // 1/2

    public static int sum(int a, int b) {

        return a * b;
    }

    // 3

    public static int sum2(int a, int b) {

        int result = 0;

        for (int i = 1; i <= b; i++) {
            result = result + a;
        }
        return result;
    }
}