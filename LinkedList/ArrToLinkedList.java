package LinkedList;

public class ArrToLinkedList {

    public static void main(String args[]) {
        String[] arr = {"1", "2", "3", "4", "5", "6"};

        LinkedList l = new LinkedList(arr[0]);
        l.add(new LinkedList.Node(arr[1]));

        LinkedList.Node head = l.head();

        for(int i=2; i<arr.length; i++){
            int curr_mid;
            
            if(l.length() %2 == 0){
                curr_mid = l.length() / 2;
            } else{
                curr_mid = l.length() / 2 + 1;
            }

            LinkedList.Node pointer = head;
            int count = 1;

            while(count != curr_mid) {
                pointer = pointer.next();
                count++;
            }

            LinkedList.Node newNode = new LinkedList.Node(arr[i]);
            newNode.setNext(pointer.next());
            pointer.setNext(newNode);

            l.displayLinkedList(head);
        }

    }

}
