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
    }}