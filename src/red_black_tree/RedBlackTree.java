package red_black_tree;

public class RedBlackTree {
    Node root;

    Node getRoot(){
        return root;
    }

    Node getParent(Node node){
        return node.parent;
    }

    Node getGrandParent(Node node){
        Node parent = getParent(node);
        if(parent==null) return null;
        return getParent(parent);
    }
    Node getSibling(Node node){
        if (node.parent==null) return null;
        if(node == node.parent.left) return node.right;
        else return node.left;
    }

    Node getUncle(Node node){
        Node parent = getParent(node);
        Node grandParent = getGrandParent(node);
        if(grandParent == null) return null;
        return getSibling(parent);
    }

    Node insert(Node node){
        root = insertRec(root, node);
        repairTree(node);
        return root;
    }

    private Node insertRec(Node current, Node toBeInserted){
        if(current == null) {
            return toBeInserted;
        }
        else if (toBeInserted.value < current.value) {
            toBeInserted.parent = current;
            current.left = insertRec(current.left, toBeInserted);
        }
        else {
            toBeInserted.parent = current;
            current.right = insertRec(current.right, toBeInserted);
        }
        return current;
    }

    void repairTree(Node node){
        if(getParent(node) == null) repairCase1(node);
    }
    void repairCase1(Node node){
        node.color = NodeColor.BLACK;
    }

}
