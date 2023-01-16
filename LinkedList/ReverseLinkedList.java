package LinkedList;
public class ReverseLinkedList {
    public static void main(String args[]) {
        LinkedList l = new LinkedList("1");
        LinkedList.Node head = l.head();

        l.add(new LinkedList.Node("2"));
        l.add(new LinkedList.Node("3"));
        l.add(new LinkedList.Node("4"));
        l.add(new LinkedList.Node("5"));
        l.add(new LinkedList.Node("6"));

        // head = reverseLinkedList(head);
        // l.displayLinkedList(head);

        head = recurReverse(head);
        l.displayLinkedList(head);
    }

    public static LinkedList.Node reverseLinkedList(LinkedList.Node head) {

        LinkedList.Node pointer = head;
        LinkedList.Node current = null;
        LinkedList.Node prev = null;

        while (pointer != null) {
            current = pointer;
            pointer = pointer.next();

            current.setNext(prev);
            prev = current;
            head = current;
        }
        return head;
    }

    public static LinkedList.Node recurReverse(LinkedList.Node node) {
        if (node.next() == null) {
            return node;
        }

        LinkedList.Node newHead = recurReverse(node.next());

        node.next().setNext(node);
        node.setNext(null);
        return newHead;
    }
}
