package LinkedList;
public class RotateLinkedList {
    public static void main(String args[]) {
        LinkedList l = new LinkedList("1");
        LinkedList.Node head = l.head();

        l.add(new LinkedList.Node("2"));
        l.add(new LinkedList.Node("3"));
        l.add(new LinkedList.Node("4"));
        l.add(new LinkedList.Node("5"));

        System.out.println("Original Linked List");
        l.displayLinkedList(head);

        // int n = 3;
        // n = n%l.length();

        // for (int i = 0; i < n; i++) {
        //     head = rotateNTimesC(head);
        //     System.out.println("Rotation #"+(i+1));
        //     l.displayLinkedList(head);
        // }

        int k = 3;
        // k = l.length() - k;  //Clockwise
        head = rotateByKNodes(head, k);
        l.displayLinkedList(head);
    }

    public static LinkedList.Node rotateNTimesAC(LinkedList.Node head) {
        LinkedList.Node current = head;
        LinkedList.Node kthNode = current;

        while (current.next() != null) {
            current = current.next();
        }

        current.setNext(head);
        head = kthNode.next();
        kthNode.setNext(null);

        return head;
    }

    public static LinkedList.Node rotateNTimesC(LinkedList.Node head) {
        
        LinkedList.Node current = head;
        LinkedList.Node prev = null;

        while(current.next() != null) {
            prev = current;
            current = current.next();
        }

        current.setNext(head);
        head = current;
        prev.setNext(null);

        return head;
    }

    public static LinkedList.Node rotateByKNodes(LinkedList.Node head, int k) {

        if(k == 0) return head;

        LinkedList.Node current = head;
        int count = 1;

        while(current != null && count <k){
            current = current.next();
            count++;
        }
        
        if(current == null) return head;

        LinkedList.Node kthNode = current;

        while(current.next() != null) {
            current = current.next();
        }

        current.setNext(head);
        head = kthNode.next();
        kthNode.setNext(null);

        return head;
    }

}
