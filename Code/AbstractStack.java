/**
 * The `AbstractStack` class is an abstract class that implements the `Stack` interface and provides a
 * method to check if the stack is empty.
 */
import java.util.List;

abstract class AbstractStack<T> implements Stack<T> {
    protected List<T> list;
    
    /** 
     * @return boolean
     */
    public boolean isEmpty() { 
        return list.isEmpty();
     }
}
