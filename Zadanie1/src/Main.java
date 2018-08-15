import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj dwie liczby cakowite: ");

        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();

        int result = sum(value1, value2);
        System.out.println("Wynik: " +result);
    }

    public static int sum(int a, int b) {

        return a * b;
    }
}