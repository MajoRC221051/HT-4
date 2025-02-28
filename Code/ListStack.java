class ListStack<T> {
    private SinglyLinkedList<T> list = new SinglyLinkedList<>();

    public void push(T data) {
        list.add(data);
    }

}
