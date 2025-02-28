import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
    private DoublyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new DoublyLinkedList<>();
    }

    @Test
    void testIsEmptyInitially() {
        assertTrue(list.isEmpty(), "La lista debe estar vacía al inicio");
    }

    @Test
    void testAdd() {
        list.add(15);
        assertTrue(list.isEmpty(), "La lista no debería tener un dato al ingresar un elemento");
    }

    @Test
    void testRemove() {
        list.add(30);
        list.add(40);
        assertEquals(30, list.remove(), "El primer elemento agregado debería ser el primero eliminado");
        assertEquals(40, list.remove(), "El segundo elemento agregado debería ser el siguiente eliminado");
        assertTrue(list.isEmpty(), "La lista debería estar vacía después de eliminar todos los elementos de la lista");
    }

    @Test
    void testRemoveEmpty() {
        assertNull(list.remove(), "Eliminar de una lista vacía debería retornar null");
    }
}
