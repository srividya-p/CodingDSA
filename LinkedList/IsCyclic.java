package LinkedList;
public class IsCyclic {
    public static void main(String args[]) {
        LinkedList l = new LinkedList("1");
        LinkedList.Node head = l.head();

        LinkedList.Node cycleStart = new LinkedList.Node("2");
        l.add(cycleStart);
        l.add(new LinkedList.Node("3"));
        l.add(new LinkedList.Node("4"));
        l.add(new LinkedList.Node("5"));
        l.add(new LinkedList.Node("6"));
        l.add(cycleStart);

        if(isCyclic(head)){
            System.out.println("LinkedList contains Cycle.");
            head = removeLoop(head);
            l.displayLinkedList(head);
        } else {
            System.out.println("LinkedList does not contain Cycle.");
        }
    }

    public static boolean isCyclic(LinkedList.Node head) {

        LinkedList.Node slow = head;
        LinkedList.Node fast = head;

        while(fast != null && fast.next() != null) {
            slow = slow.next();
            fast = fast.next().next();
            if(slow == fast) {
                slow=head;
                while(slow.next() != fast.next()){
                    slow = slow.next();
                    fast = fast.next();
                }
                System.out.println("Start of Loop = "+slow.next().data());
                System.out.println("End of Loop = "+fast.data());
                return true;
            }
        }
        return false;
    }

    public static LinkedList.Node removeLoop(LinkedList.Node head) {

        LinkedList.Node fast = head;
        LinkedList.Node slow = head;

        while(fast!=null && fast.next()!=null){
            fast = fast.next().next();
            slow = slow.next();
            if(fast == slow){
                slow = head;
                if(fast != slow){
                    while(fast.next() != slow.next()) {
                        fast = fast.next();
                        slow = slow.next();
                    }
                    fast.setNext(null);
                } else {
                    while(slow != fast.next()){
                        fast = fast.next();
                    }
                    fast.setNext(null);
                }
            }
        }

        return head;
    }
}
