package taskFolder;

import doublyLinkedList.Node;

public class DoubleLinkedListImpl implements DoublyLinkedList{

     Node head;

    @Override
    public void addFront(int number) {
        Node node = new Node(number);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    @Override
    public void addEnd(int number) {
        Node node = new Node(number);
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    @Override
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null)
        {
            count++;
            current = current.next;
        }
        return count;

    }

    @Override
    public Node find(int value) {
        Node node = head;

        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    @Override
    public void insert(int after, int val) {
        Node p = find(after);

        if( p == null){
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    @Override
    public String toString() {
        return String.format("<< %s >>", head);
    }
}
