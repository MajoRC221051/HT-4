interface ListADT<T> {
    void add(T item);

    T remove();

    boolean isEmpty();
}

abstract class AbstractListADT<T> implements ListADT<T> {
    protected LinkedList<T> list = new LinkedList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

class SinglyLinkedList<T> extends AbstractListADT<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    @Override
    public void add(T data) {
        if (head == null)
            head = new Node(data);
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = new Node(data);
        }
    }

    @Override
    public T remove() {
        if (head == null)
            return null;
        T data = head.data;
        head = head.next;
        return data;
    }
}
