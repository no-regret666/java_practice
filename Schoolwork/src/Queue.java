public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[8]; // Initial array size
        size = 0;
    }

    public void enqueue(int v) {
        if (size == elements.length) {
            expandArray(); // Expand the array if it's full
        }
        elements[size++] = v;
    }

    private void expandArray() {
        int[] newElements = new int[elements.length * 2]; // Double the size
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = elements[0];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return value;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}