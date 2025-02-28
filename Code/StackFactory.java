/**
 * The `StackFactory` class provides methods to create different types of stacks and perform merge sort
 * on a stack.
 */
class StackFactory {
    
    /** 
     * @param type
     * @return Stack<T>
     */
    public static <T extends Comparable<T>> Stack<T> createStack(String type) {
        switch (type) {
            case "arraylist":
                return new ArrayListStack<>();
            case "vector":
                return new VectorStack<>();
            case "linkedlist":
                return new ListStack<T>(new SinglyLinkedList<T>());


            default:
                throw new IllegalArgumentException("Invalid stack type");
        }
    }

    public static <T extends Comparable<T>> void mergeSort(Stack<T> stack) {
        if (stack.isEmpty() || stack.peek() == null) return;

        int size = 0;
        Stack<T> tempStack = createStack("arraylist");

        // Contamos el tamaño de la pila y transferimos elementos a tempStack
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
            size++;
        }

        Stack<T> sortedStack = mergeSortHelper(tempStack, size);

        // Devolvemos los elementos ordenados a la pila original
        while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
    }

    private static <T extends Comparable<T>> Stack<T> mergeSortHelper(Stack<T> stack, int size) {
        if (size <= 1) return stack;

        int mid = size / 2;
        Stack<T> left = createStack("arraylist");
        Stack<T> right = createStack("arraylist");

        
        for (int i = 0; i < mid; i++) {
            left.push(stack.pop());
        }
        while (!stack.isEmpty()) {
            right.push(stack.pop());
        }

        // Llamadas recursivas
        left = mergeSortHelper(left, mid);
        right = mergeSortHelper(right, size - mid);

        return merge(left, right);
    }

    private static <T extends Comparable<T>> Stack<T> merge(Stack<T> left, Stack<T> right) {
        Stack<T> merged = createStack("arraylist");
        Stack<T> temp = createStack("arraylist"); // Pila auxiliar para invertir el orden

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.peek().compareTo(right.peek()) <= 0) {
                temp.push(left.pop());
            } else {
                temp.push(right.pop());
            }
        }

        while (!left.isEmpty()) {
            temp.push(left.pop());
        }
        while (!right.isEmpty()) {
            temp.push(right.pop());
        }

        while (!temp.isEmpty()) {
            merged.push(temp.pop());
        }

        return merged;
    }
}