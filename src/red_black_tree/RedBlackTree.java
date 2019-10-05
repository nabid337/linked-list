package red_black_tree;

public class RedBlackTree {
    Node node;
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
}
