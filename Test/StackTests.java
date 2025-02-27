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
    }}