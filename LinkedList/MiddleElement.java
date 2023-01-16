package LinkedList;
public class MiddleElement {
    public static void main(String[] args) {
        LinkedList l = new LinkedList("1");
        LinkedList.Node head = l.head();

        l.add(new LinkedList.Node("2"));
        l.add(new LinkedList.Node("3"));
        l.add(new LinkedList.Node("4"));
        l.add(new LinkedList.Node("5"));
        l.add(new LinkedList.Node("6")); 


        LinkedList.Node current = head;
        LinkedList.Node middle = head;

        int length = 1;

        while(current.next() != null) {
            if(length % 2 == 0){
                middle = middle.next();
            }
            current = current.next();
            length++;
        }

        System.out.println("Length = " + length);
        System.out.println("Middle = " + middle.data());
    }
}
