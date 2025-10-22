package lesson_13_scanner;

import java.util.Scanner;

public class ScannerAndArrays {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву arrayLength: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        System.out.println("Введіть по черзі дані масиву:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int choice;
        do {
            System.out.println("Оберіть дію:");
            System.out.println("1 - Порахувати суму елементів");
            System.out.println("2 - Знайти середнє арифметичне");
            System.out.println("3 - Знайти найбільший елемент");
            System.out.println("4 - Завершити програму");
            System.out.print("Ваш вибір: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int num : array) {
                        sum += num;
                    }
                    System.out.println("Сума елементів: " + sum);
                    break;

                case 2:
                    int total = 0;
                    for (int num : array) {
                        total += num;
                    }
                    double average = (double) total / array.length;
                    System.out.println("Середнє арифметичне: " + average);
                    break;

                case 3:
                    int max = array[0];
                    for (int num : array) {
                        if (num > max) {
                            max = num;
                        }
                    }
                    System.out.println("Найбільший елемент: " + max);
                    break;

                case 4:
                    System.out.println("Завершення програми...");
                    break;

                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
