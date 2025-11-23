package lesson_30_interfaces;

import java.util.Optional;

public class Stack<T> implements Stackable<T> {
    private final int maxSize;
    private final Object[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == maxSize - 1;
    }

    @Override
    public void push(T element) {
        if (isFull()) {
            throw new StackOverflowException("Стек повний! Неможливо додати елемент: " + element);
        }
            stackArray[++top] = element;

    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Не можу дістати елемент: стек порожній!");
        }
            T elem = (T) stackArray[top];
            stackArray[top--] = null;
            return elem;

    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Немає верхнього елемента: стек порожній!");
            return null;
        } else {
            return (T) stackArray[top];
        }
    }

    public void printStack() {
        System.out.print("Стек (зверху → низ): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public Optional<T> safePop() {
        if (isEmpty()) {
            return Optional.empty();
        }
        T elem = (T) stackArray[top];
        stackArray[top--] = null;
        return Optional.of(elem);
    }
}
