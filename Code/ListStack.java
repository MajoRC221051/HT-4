/**
 * The `ListStack` class implements a stack using composition with a `ListADT` and provides methods for
 * push, pop, peek, and isEmpty operations.
 */
class ListStack<T> implements Stack<T> {
    private ListADT<T> listADT;  // Composición con ListADT<T>

    public ListStack(ListADT<T> listADT) { 
        this.listADT = listADT; 
    }

    
    /** 
     * @param item
     */
    @Override
    public void push(T item) { 
        listADT.add(item); 
    }

    @Override
    public T pop() { 
        return listADT.remove(); 
    }

    @Override
    public T peek() { 
        throw new UnsupportedOperationException("Peek not implemented for ListStack");
    }

    @Override
    public boolean isEmpty() { 
        return listADT.isEmpty(); 
    }
}
