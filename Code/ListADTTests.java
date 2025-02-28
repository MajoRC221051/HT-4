/**
 * The `ListADTTests` class contains test methods for singly linked list and doubly linked list
 * implementations.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * The class `ListADTTests` contains test methods for singly linked list and doubly linked list
 * implementations.
 */
class ListADTTests {
    @Test
    void testSinglyLinkedList() {
        ListADT<Integer> list = new SinglyLinkedList<>();
        assertTrue(list.isEmpty());
        list.add(30);
        assertFalse(list.isEmpty());
        assertEquals(30, list.remove());
        assertTrue(list.isEmpty());
    }

    @Test
    void testDoublyLinkedList() {
        ListADT<Integer> list = new DoublyLinkedList<>();
        list.add(40);
        assertFalse(list.isEmpty());
        assertEquals(40, list.remove());
        assertTrue(list.isEmpty());
    }
}