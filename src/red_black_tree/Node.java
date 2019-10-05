package red_black_tree;

public class Node {
    int value;
    Node left, right,parent;
    NodeColor color;
    Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
        this.color = NodeColor.RED;
        this.parent = null;
    }
}
