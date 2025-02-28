// This Java code defines an interface named `ListADT` with a generic type `T`. The interface declares
// three methods:
// 1. `add(T item)`: This method is used to add an item of type `T` to the list.
// 2. `remove()`: This method removes and returns an item from the list.
// 3. `isEmpty()`: This method checks if the list is empty and returns a boolean value indicating
// whether the list is empty or not.
interface ListADT<T> {
    void add(T item);
    T remove();
    boolean isEmpty();
}