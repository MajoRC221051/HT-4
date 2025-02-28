class DublyLinkedList<T> extends AbstractListADT<T> {
    private class Node {
        T data;
        @SuppressWarnings("unused")
        Node next, prev;

        Node(T data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }

    private Node head, tail;

    @Override
    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    @Override
    public T remove() {
        if (head == null) {
            return null;
        }
        T data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return data;
    }
}



 
 * 
 

    
        
        
        

        
            
            
        
    

    

    
    
        
        
            
        
            
            
            
        
    

    
