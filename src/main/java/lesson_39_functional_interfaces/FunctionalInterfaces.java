package lesson_39_functional_interfaces;

import java.util.Random;
import java.util.function.*;

public class FunctionalInterfaces {
    // ===== Частина 1 =====
    //Реалізувати Predicate (без тестів). Перевірка, чи є число негативним.
    public static Predicate<Integer> isNegative = num -> num < 0;

    //Реалізувати Consumer (без тестів). Реалізувати консюмер, який виводить в консоль об'єкт Кота в красивому вигляді в консоль.
    public static class Cat {
        String name;
        int age;

        Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static Consumer<Cat> printCat = cat ->
            System.out.println("Котик: " + cat.name + ", вік: " + cat.age + " роки(-ів) 😺");

    //Реалізувати Supplier (без тестів), який повертає рандомне число та який кидає NullPointerException.
    public static Supplier<Integer> randomNumber = () -> new Random().nextInt();

    public static Supplier<String> throwNPE = () -> {
        throw new NullPointerException("Спеціально кинута помилка");
    };

    //Реалізувати Function (без тестів), який переводить int у String та кота в єнота.
    public static Function<Integer, String> intToString = String::valueOf;

    public static class Raccoon {
        String name;

        Raccoon(String name) {
            this.name = name;
        }
    }

    public static Function<Cat, Raccoon> catToRaccoon =
            cat -> new Raccoon(cat.name + " the Raccoon");

    //Реалізувати UnaryOperator (без тестів), який бере корінь з числа* який обчислює факторіал числа.
    public static UnaryOperator<Double> sqrtOp = num -> Math.sqrt(num);

    public static UnaryOperator<Integer> factorial = n -> {
        int result = 1;
        for (int i = 1; i <= n; i++) {
           result *= i;
        }
        return result;
    };

    // ===== Частина 2 =====
    //Predicate: перевірка, чи є число простим.
    public static Predicate<Integer> isPrime = number -> {
        if (number <= 1) {
           return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    };

    //Consumer: генерує число від 0 до заданого та виводимо в консоль.
    public static Consumer<Integer> printRandomToN = max -> {
        int random = new Random().nextInt(max + 1);
        System.out.println(random);
    };

    //Supplier: повертає випадковий день тижня.
    public static Supplier<String> randomDayOfWeek = () -> {
        String[] days = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Нд"};
        return days[new Random().nextInt(days.length)];
    };

    //Function: округляє Double у Long за правилами математики.
    public static Function<Double, Long> roundDouble = Math::round;

    //UnaryOperator: обчислює число Фібоначчі.
    public static UnaryOperator<Integer> fibonacci = n -> {
        if (n <= 1) return n;

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    };
}
