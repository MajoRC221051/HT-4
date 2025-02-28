/**
 * The `AbstractListADT` class is an abstract class that implements the `ListADT` interface and
 * provides a protected `LinkedList` field with methods to check if the list is empty.
 */
abstract class AbstractListADT<T> implements ListADT<T> {
    protected LinkedList<T> list = new LinkedList<>();
    public boolean isEmpty() { return list.isEmpty(); }
}

