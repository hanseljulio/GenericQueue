import java.util.*;

public class Queue<E> {
    private int top = -1;
    private E[] elements = (E[]) new Object[10];

    public void add(E value) {
        if (top >= elements.length - 1) {
            expandSize();
        }
        top++;
        elements[top] = value;
    }

    public E remove() {
        if (top < 0) {
            throw new NoSuchElementException();
        }
        E result = elements[0];
        remove(0);
        return result;
    }

    public void push(E value) {
        if (top >= elements.length - 1) {
            expandSize();
        }
        top++;
        elements[top] = value;
    }

    public E peek() {
        if (top < 0) {
            throw new NoSuchElementException();
        }
        return elements[0];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void remove(int index) {
        if (index > top || index < 0) {
            throw new NoSuchElementException();
        }

        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        top--;
    }

    public void removeAll(E value) {
        int size = size();
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i].equals(value)) {
                remove(i);
            }
        }
    }

    public void removeDuplicates() {
        Set<E> duplicates = new HashSet<>();
        for (int i = 0; i < size(); i++) {
            E value = elements[i];
            if (!duplicates.contains(value)) {
                duplicates.add(value);
            } else {
                remove(i);
            }
        }
    }

    public int size() {
        return top + 1;
    }

    public boolean equals(Object o) {
        if (o instanceof Queue<?> && ((Queue<E>) o).size() == this.size()) {
            for (int i = 0; i < this.size(); i++) {
                if (!((Queue<?>) o).get(i).equals(elements[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public E get(int index) {
        if (top < index) {
            throw new IndexOutOfBoundsException();
        }

        return elements[index];
    }


    private void expandSize() {
        int increasedSize = elements.length * 2;
        elements = Arrays.copyOf(elements, increasedSize);
    }

}

