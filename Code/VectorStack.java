import java.util.Vector;

class VectorStack<T> extends AbstractStack<T> {
    public VectorStack() { list = new Vector<>(); }
    public void push(T item) { list.add(item); }
    public T pop() { return list.remove(list.size() - 1); }
    public T peek() { return list.get(list.size() - 1); }
}
