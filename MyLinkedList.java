import java.util.Arrays;

/**
 * @author : Sobornov Vladimir
 * @since : 17.09.2022
 **/
public class MyLinkedList {

    private Node head;
    private int size = 0;

    public void add(int value) {
        if (this.head == null) {
            this.head = new Node(value);
        } else {
            Node temp = this.head;

            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        this.size++;
    }

    public String toString() {
        Node temp = this.head;
        int index = 0;
        int[] array = new int[size];

        while (temp != null) {
            array[index++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(array);
    }

    public int get(int index) {
        Node temp = this.head;
        int currentIndex = 0;
        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    private static class Node {
        private int value;
        private Node next;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }

    }
}
