package lesson_37_generics;

import java.util.*;

public class UniqueList {

    public static class UniqueNumbersList {

        public static List<Integer> getUniqueList(List<Integer> numbers) {

            List<Integer> uniqueList = new ArrayList<>();
            Set<Integer> addedNumbers = new HashSet<>();

            for (int number : numbers) {

                if (addedNumbers.add(number)) {
                    uniqueList.add(number);
                }
            }

            return uniqueList;
        }

        static void main() {

            List<Integer> numbers = Arrays.asList(3, 2, 4, 2, 3, 4, 5, 6);
            List<Integer> result = getUniqueList(numbers);
            System.out.println(result);
        }
    }
}

