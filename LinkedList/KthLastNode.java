package LinkedList;
public class KthLastNode {
    public static void main(String args []){
        LinkedList l = new LinkedList("1");
        LinkedList.Node head = l.head();

        l.add(new LinkedList.Node("2"));
        l.add(new LinkedList.Node("3"));
        l.add(new LinkedList.Node("4"));
        l.add(new LinkedList.Node("5"));
        l.add(new LinkedList.Node("6")); 

        l.displayLinkedList(head);
        int k = 3;
        int count = 1;
        LinkedList.Node fast = head;
        LinkedList.Node slow = head;
        while(fast.next() != null) {
            if(count >= k) {
                slow = slow.next();
            }
            fast = fast.next();
            count++;
        }

        System.out.println("Kth Last Node = "+ slow.data());

    }
}
