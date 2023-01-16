package LinkedList;
import java.util.HashSet;

public class RemoveDuplicatesUnsorted {
    public static void main(String args[]) {
        LinkedList l = new LinkedList("2");
        LinkedList.Node head = l.head();

        l.add(new LinkedList.Node("2"));
        l.add(new LinkedList.Node("1"));
        l.add(new LinkedList.Node("5"));
        l.add(new LinkedList.Node("4"));
        l.add(new LinkedList.Node("5"));
        l.add(new LinkedList.Node("3"));
        l.add(new LinkedList.Node("4"));

        l.displayLinkedList(head);

        head = removeDuplicates(head);

        l.displayLinkedList(head);

    }

    public static LinkedList.Node removeDuplicates(LinkedList.Node head) {

        HashSet<String> uniqueSet = new HashSet<>(); 

        LinkedList.Node current = head;
        LinkedList.Node previous = head;

        while (current != null){
            String val = current.data();

            if(uniqueSet.contains(val)){
                previous.setNext(current.next());
            } else{
                uniqueSet.add(val);
                previous = current;
            }
            current = current.next();
        }

        return head;
    }
}
