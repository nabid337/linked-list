public class Main {

    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        System.out.println("size : " + linkedList.getSize());
        linkedList.printNodes();
        linkedList.printSpecificNode(0);
        linkedList.printSpecificNode(1);
        linkedList.printSpecificNode(2);
        linkedList.printSpecificNode(3);
        linkedList.printSpecificNode(4);

        linkedList.head.next.next.next.next = linkedList.head;
        System.out.println(linkedList.detectLoop());
    }
}
