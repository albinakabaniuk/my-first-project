package lesson_30_interfaces;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testUnderflow() {

        // given
        Stack<Integer> stack = new Stack<>(2);

        // when + then
        StackUnderflowException ex = assertThrows(
                StackUnderflowException.class,
                stack::pop
        );
    }

    @Test
    void testOverflow() {

        // given
        Stack<Integer> stack = new Stack<>(2);
        stack.push(10);
        stack.push(20);

        // when + then
        StackOverflowException ex = assertThrows(
                StackOverflowException.class,
                () -> stack.push(30)
        );
    }

    @Test
    void testSafePop() {

        // given
        Stack<Integer> stack = new Stack<>(2);

        // when + then
        Optional<Integer> result1 = stack.safePop();
        assertTrue(result1.isEmpty());

        // given
        stack.push(10);

        // when
        Optional<Integer> result2 = stack.safePop();

        // then
        assertTrue(result2.isPresent());
        assertEquals(10, result2.get());
        assertTrue(stack.safePop().isEmpty());
    }
}