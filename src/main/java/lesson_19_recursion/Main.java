package lesson_19_recursion;

import java.util.Scanner;

public class Main {

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер числа Фібоначчі: ");
        int n = scanner.nextInt();

        int result = fibonacci(n);

        System.out.println("Число Фібоначчі з номером " + n + " = " + result);

        scanner.close();
    }
}

