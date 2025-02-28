import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListStackTest {
    private ListStack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new ListStack<>();
    }

    @Test
    void testPush() {
        stack.push(10);
        stack.push(20);
        // No hay pop() para verificar si los datos se añaden correctamente
        assertFalse(stack.isEmpty(), "La pila no debería estar vacía después de agregar elementos");
    }
}
