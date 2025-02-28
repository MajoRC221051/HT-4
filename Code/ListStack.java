class ListStack<T> {
    private SinglyLinkedList<T> list = new SinglyLinkedList<>();

    /**
     * @param data
     */

    public void push(T data) {
        list.add(data);
    }

}
