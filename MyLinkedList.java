import java.util.Arrays;

/**
 * @author : Sobornov Vladimir
 * @since : 17.09.2022
 **/
public class MyLinkedList {

    private Node head;
    private int size = 0;

    public void add(int value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;

            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        this.size++;
    }

    public String toString() {
        Node head = this.head;
        int index = 0;
        int[] array = new int[size];

        while (head != null) {
            array[index++] = head.getValue();
            head = head.getNext();
        }
        return Arrays.toString(array);
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
