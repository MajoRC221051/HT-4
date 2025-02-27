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
