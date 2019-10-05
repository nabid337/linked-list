package red_black_tree;

public class Main {
    public static void main (String args[]){

        RedBlackTree rbTree = new RedBlackTree();
        Node node = new Node(30);
        Node node1 = new Node(20);
        Node node2 = new Node(40);
        rbTree.insert(node);
        rbTree.insert(node1);
        rbTree.insert(node2);

        System.out.println(rbTree.getRoot().left.parent.value);

    }
}
