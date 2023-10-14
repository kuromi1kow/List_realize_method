import java.util.NoSuchElementException;

public class LinkedList {
    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;
    private Node next;

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void contains(int item) {
        var current = first;
        while (current != null) {
            current = current.next;
            if (current.value == item) {
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        } else {
            var second = first.next;
            first = null;
            second = first;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        } else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    public Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == last) return current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] arr = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            arr[index++] = current.value;
            current = current.next;
        }
        return arr;
    }

    public void reverse() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        }
        var current = first;
        while (current != null) {
            next = current.next;
            current.next = last;
            last = current;
            current = next;
        }
        last=current;
    }

    public int findMiddle() {
        var current = first;
        int middle = size() / 2 + 1;
        int i = 1;
        while (i < middle) {
            i++;
            current = current.next;
        }
       return current.value;
    }
}

