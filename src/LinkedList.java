import org.w3c.dom.Node;

public class LinkedList {
    public static  int size = 0;
    public NodeClass head;

    public void push(int data){
        NodeClass node = new NodeClass(data);
        node.next = head;
        this.head = node;
        size++;
    }

    public int getSize(){
        return size;
    }

    public void printNodes(){
        NodeClass nodeClass = head;
        for(int i=0; i<size; i++){
            System.out.println("Data : " + nodeClass.data);
            nodeClass = nodeClass.next;
        }

    }

    public void printSpecificNode(int pos){
        if(pos>=size){
            System.out.println("Position is greater then linked list size");
        }
        else {
            NodeClass nodeClass = head;
            for(int i=0; i<pos; i++){
                nodeClass = nodeClass.next;
            }
            System.out.println(pos + " Data : " + nodeClass.data);
        }
    }

    public boolean detectLoop(){
        if(size == 1) return false;
        NodeClass slow_mo = head;
        NodeClass fast_mo = head;
        while(slow_mo!=null && fast_mo!=null && fast_mo.next.next!=null){
            slow_mo = slow_mo.next;
            fast_mo = fast_mo.next.next;

            if(slow_mo == fast_mo){
                return true;
            }
        }
        return false;
    }
}
