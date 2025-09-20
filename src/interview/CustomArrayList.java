package interview;

class CustomArrayList<T> {
    private Object[] data;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    public CustomArrayList() {
        data = new Object[INITIAL_CAPACITY];
    }

    // Add element at end
    public void add(T element) {
        ensureCapacity();
        data[size++] = element;
    }

    // Get element at index
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) data[index];
    }

    // Remove element at index
    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null; // Avoid memory leak
    }

    // Current size
    public int size() {
        return size;
    }

    // Ensure capacity (resize if full)
    private void ensureCapacity() {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            Object[] newData = new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    // Print all elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
