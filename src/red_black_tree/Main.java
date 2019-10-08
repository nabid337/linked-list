package red_black_tree;

public class Main {
    public static void main (String args[]){

        RedBlackTree rbTree = new RedBlackTree();
        Node node = new Node(40);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(5);
        Node node4 = new Node(60);
        rbTree.insert(node);
        rbTree.insert(node1);
        rbTree.insert(node2);
        rbTree.insert(node3);
        rbTree.insert(node4);

        System.out.println(rbTree.getRoot().value);
        System.out.println(rbTree.getRoot().left.value);
        System.out.println(rbTree.getRoot().left.right.value);
        System.out.println(rbTree.getRoot().left.left.value);

        rbTree.rotateRight(rbTree.getRoot());

        System.out.println(rbTree.getRoot().value);
        System.out.println(rbTree.getRoot().right.value);
        System.out.println(rbTree.getRoot().right.right.value);
        System.out.println(rbTree.getRoot().right.left.value);

        System.out.println("GP:" + rbTree.getGrandParent(node2).value);

        //System.out.println(rbTree.getRoot().left.parent.value);

    }
}
