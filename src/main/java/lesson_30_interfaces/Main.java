package lesson_30_interfaces;

import static java.lang.System.*;

public class Main {
    static void main() {
        Stack<Integer> stack = new Stack<>(3);

        out.println("Наш стек порожній? " + stack.isEmpty());
        stack.pop();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        stack.push(40);

        out.println("Верхній елемент: " + stack.peek());

        out.println("Дістати: " + stack.pop());
        stack.printStack();

        out.println("Дістати: " + stack.pop());
        out.println("Дістати: " + stack.pop());
        stack.pop();
    }
}
