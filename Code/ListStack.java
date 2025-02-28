/**
 * The ListStack class implements a stack data structure using a singly linked list.
 */
class ListStack<T> {
    private SinglyLinkedList<T> list = new SinglyLinkedList<>();

    
    /** 
     * @param data
     */
    public void push(T data) {
        list.add(data);
    }

}