package lesson_30_interfaces;

public interface Stackable<T> {
    boolean isEmpty();
    boolean isFull();
    void push(T element);
    T pop();
    T peek();
}