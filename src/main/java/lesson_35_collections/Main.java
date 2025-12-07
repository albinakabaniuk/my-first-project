package lesson_35_collections;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumberUtils utils = new NumberUtils();

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        long sum = utils.getSum(numbers);
        System.out.println("Сума чисел: " + sum);

        List<Integer> multiplyOdd = utils.multiplyOddNumber(numbers);
        System.out.println("Помножені непарні числа: " + multiplyOdd);
    }
}
