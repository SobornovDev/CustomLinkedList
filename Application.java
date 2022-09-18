public class Application {
    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);

        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(4));

    }
}
