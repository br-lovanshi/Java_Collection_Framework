import sun.awt.image.ImageWatched;

class Node {

    int data;
    Node next;

//    constructor
    public Node (int data){
        this.data = data;
        this.next = null;
    }

//    print
    public void printNode(){
        System.out.println(this.data + " " + this.next);
    }

}

 class LinkedList {

    Node head;
    Node tail;

//    constructor

     public LinkedList(){

         this.head = null;
         this.tail = null;
     }
//     mathod to get the head of the linked list
     public int getHead(){
         return head.data;
     }
     //     mathod to get the tail of the linked List
     public int getTail(){
         return tail.data;
     }

//     mathod to add element at the head of linkedList

     public void insertAtHead(int data){

         if(head == null){
             head = new Node(data);
             return ;
         }
         Node new_Node = new Node(data);
         new_Node.next = head;
         head  = new_Node;
         return;
     }
//    function/mathod to insert elements tail at the linkedListThe
     public void insertAtTail(int data){
        if(head == null ){
            head = new Node(data);
            tail = head;
            return;
        }
        tail.next = new Node(data);
        tail = head;
        tail = tail.next;
//
//        Node curr = head;
//
//        while (curr.next != null ){
//
//            curr = curr.next;
//        }
//        curr.next = new Node(data);

     }
//Print linked list
     public void printLinkedList(){
         if(head == null) return ;
         Node curr = head;

         while (curr.next != null ){
             System.out.print(curr.data + " ");
             curr = curr.next;
         }
//         mathod for delete from linkedlist


     }

     public void deleteNode(int data){
         if(head.data == data){
             head = head.next;
             return;
         }
         Node curr = head;
         while(curr.next.data != data ){

             curr = curr.next;
         }
            curr.next = curr.next.next;
         return;
     }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        LinkedList linkedList = new LinkedList();

        int i = 0;
        while(i<=5){
            linkedList.insertAtTail(i);
            i++;
        }
        linkedList.insertAtHead(6);
        linkedList.deleteNode(1);
        linkedList.printLinkedList();

    }
}
