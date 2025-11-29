package lesson_35_collections;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public int getSum(List<Integer> numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 != 0) {
                result.add(num * 2);
            }
        }
        return result;
    }
}
