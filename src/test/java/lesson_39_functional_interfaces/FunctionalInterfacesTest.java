package lesson_39_functional_interfaces;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalInterfacesTest {

    //Predicate: перевірка, чи є число простим.
    @Test
    void shouldReturnTrueWhenNumberIsPrime() {
        // given
        int number = 7;

        // when
        boolean result = FunctionalInterfaces.isPrime.test(number);

        // then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenNumberIsNotPrime() {
        // given
        int number = 8;

        // when
        boolean result = FunctionalInterfaces.isPrime.test(number);

        // then
        assertFalse(result);
    }

    //Consumer: генерує число від 0 до заданого та виводимо в консоль.
    @Test
    void shouldNotThrowExceptionWhenConsumerIsCalled() {
        // given
        int max = 10;

        // when & then
        assertDoesNotThrow(() ->
                FunctionalInterfaces.printRandomToN.accept(max)
        );
    }

    //Supplier: повертає випадковий день тижня.
    @Test
    void shouldReturnValidDayOfWeek() {
        // given
        String[] validDays = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Нд"};

        // when
        String result = FunctionalInterfaces.randomDayOfWeek.get();

        // then
        assertTrue(Arrays.asList(validDays).contains(result));
    }

    //Function: округляє Double у Long за правилами математики.
    @Test
    void shouldRoundDoubleCorrectly() {
        // given
        double value = 3.6;

        // when
        long result = FunctionalInterfaces.roundDouble.apply(value);

        // then
        assertEquals(4L, result);
    }

    //UnaryOperator: обчислює число Фібоначчі.
    @Test
    void shouldReturnCorrectFibonacciNumber() {
        // given
        int n = 7;

        // when
        int result = FunctionalInterfaces.fibonacci.apply(n);

        // then
        assertEquals(13, result);
    }
}
