package taskFolder;

public interface DoublyLinkedList {

     void addFront(int number);

     void addEnd(int number);

     int size();

     Node find(int value);

     void insert(int after, int val);
}
