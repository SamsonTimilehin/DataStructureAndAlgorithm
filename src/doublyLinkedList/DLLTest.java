package doublyLinkedList;

public class DLLTest {

    public static void main(String[] args) {

        DLL list = new DLL();

        list.addFront(3);
        list.addFront(2);
        list.addFront(8);
        list.addFront(17);
        list.addEnd(99);
        list.insert(8,65);

        list.display();
    }

}
