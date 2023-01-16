package LinkedList;
public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(String headData) {
        head = new Node(headData);
        tail = head;
    }

    public void add(Node node){
        tail.next = node;
        tail = node;
    }

    public Node head() {
        return head;
    }

    public void displayLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data() + "->");
            current = current.next();
        }
        System.out.print("NULL");
        System.out.println();
    }

    public int length(){
        Node current = head;
        int length = 0;
        while(current != null) {
            length ++;
            current = current.next();
        }
        return length;
    }

    public static class Node {

        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public String data() {
            return data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public void setData(String data){
            this.data = data;
        }
    }

    public static void main(String args[]) {
        System.out.println("Invoke this class only by instansiating it.");
    }
}