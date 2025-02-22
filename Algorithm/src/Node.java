class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    private Node head;

    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void delete(int key){
        Node temp = head, prev = null;

        if(temp != null &&temp.data != key){
            prev = temp = temp.next;
        }
        if(temp == null)return;
        prev.next = temp.next;
    }
    public void printList(){
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

//public class Main{
//    public static void main(String[] args){
//        LinkedList list = new LinkedList();
//        list.insertFirst(10);
//        list.insertFirst(20);
//        list.insertLast(30);
//        list.printList(); // 20 -> 10 -> 30 -> null
//
//        list.delete(10);
//        list.printList(); // 20 -> 30 -> null
//    }
//}