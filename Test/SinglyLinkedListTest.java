import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {
    private SinglyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
    }

    @Test
    void testIsEmptyInitially() {
        assertTrue(list.isEmpty(), "La lista debe estar vacía al inicio");
    }

    @Test
    void testAdd() {
        list.add(10);
        assertFalse(list.isEmpty(), "La lista tendria que tener un dato después de agregar un elemento");
    }

    @Test
    void testRemove() {
        list.add(30);
        assertEquals(30, list.remove(), "El elemento eliminado debería ser el mismo que se agregó");
        assertTrue(list.isEmpty(), "La lista tendria que estar vacia la eliminar el unico elemento");
    }

    @Test
    void testRemoveEmpty() {
        assertNull(list.remove(), "Eliminar de una lista vacía debería retornar null");
    }
}
