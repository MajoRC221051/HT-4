// This code defines an interface named `Stack` with a generic type `T`. It declares four methods that
// a class implementing this interface must provide:

interface Stack<T> {
    void push(T item);

    T pop();

    T peek();

    boolean isEmpty();
}
