/**
 * The class StackTests contains JUnit tests for ArrayListStack and VectorStack implementations of a
 * stack data structure in Java.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class StackTests {
    @Test
    void testArrayListStack() {
        Stack<Integer> stack = new ArrayListStack<>();
        assertTrue(stack.isEmpty());
        stack.push(10);
        assertEquals(10, stack.peek());
        assertEquals(10, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testVectorStack() {
        Stack<Integer> stack = new VectorStack<>();
        stack.push(20);
        assertEquals(20, stack.peek());
        assertEquals(20, stack.pop());
        assertTrue(stack.isEmpty());
    }

    
    /** 
     * @return Object
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
