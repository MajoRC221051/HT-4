import java.util.LinkedList;

interface ListADT<T> {
    void add(T item);

    T remove();

    boolean isEmpty();
}

abstract class AbstractListADT<T> implements ListADT<T> {
    protected LinkedList<T> list = new LinkedList<>();

    /**
     * @return boolean
     */

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

class SinglyLinkedList<T> extends AbstractListADT<T> {

    @Override
    public void add(T data) {
        list.add(data); // Usa la lista heredada en lugar de head
    }

    @Override
    public T remove() {
        if (list.isEmpty())
            return null;
        return list.removeFirst(); // Usa removeFirst() para mantener la lógica de pila
    }
}
