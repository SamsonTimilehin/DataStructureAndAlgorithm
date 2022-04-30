package doublyLinkedList;

public class DLL {

   private Node head;

   public void addFront(int val){
       Node node = new Node(val);
       node.next = head;
       node.prev = null;
       if(head != null){
           head.prev = node;
       }
       head = node;
   }

   public void display(){
       Node node = head;
       Node last = null;
       while(node != null){
           System.out.print(node.val + " -> ");
           last = node;
           node = node.next;
       }
       System.out.println("END");

       System.out.println("Print in reverse");
       while(last != null){
           System.out.print(last.val + " -> ");
           last = last.prev;
       }
       System.out.println("START");
   }

    public void addEnd(int val){
       Node node = new Node(val);
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
    public Node find(int value){
       Node node = head;

       while(node != null){
          if(node.val == value){
              return node;
          }
          node = node.next;
       }
       return null;
    }
    public void insert(int after, int val){
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
   //Insert using recursion
    public void insertRec(int val, int index){
       head = insertRec(val,index,head);
    }
    private Node insertRec(int val, int index, Node node){
       if(index == 0){
           Node temp = new Node(val,node);
           //size++;
           return temp;
       }
       node.next = insertRec(val,index--,node.next);
       return node;
    }
}
