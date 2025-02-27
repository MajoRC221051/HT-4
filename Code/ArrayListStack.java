import java.util.ArrayList;

class ArrayListStack<T> extends AbstractStack<T> {
    public ArrayListStack() { list = new ArrayList<>(); }
    public void push(T item) { list.add(item); }
    public T pop() { return list.remove(list.size() - 1); }
    public T peek() { return list.get(list.size() - 1); }
}