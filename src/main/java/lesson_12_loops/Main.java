package lesson_12_loops;

public class Main {
    static void main() {

        int[] arr = {-13, -12, -3, 0, 1, 5, 8, 15, 20};

        System.out.println("Парні числа в масиві:");
        for (int number : arr) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
