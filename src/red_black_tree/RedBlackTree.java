package red_black_tree;

/**
 * Implemented from sudo code described in https://en.wikipedia.org/wiki/Red%E2%80%93black_tree
 * Java Implementation
 */
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

    void rotateLeft(Node node){
        Node nnew = node.right;
        if(nnew == null) return;

        Node parent  = getParent(node);

        node.right = nnew.left;
        nnew.left = node;
        node.parent = nnew;

        node.right.parent = node;

        if(parent!=null){
            if(node == parent.left){
                parent.left = nnew;
            }
            else if(node ==parent.right) parent.right = nnew;
        }
        else {
            root = nnew;
        }
        //nnew.parent = parent;

    }

    void rotateRight(Node node){
        Node nnew = node.left;
        if(nnew == null) return;
        Node parent  = getParent(node);

        node.left = nnew.right;
        nnew.right = node;
        node.parent = nnew;

        node.left.parent = node;

        if(parent!=null){
            if(node == parent.left){
                parent.left = nnew;
            }
            else if(node ==parent.right) parent.right = nnew;
        }
        else {
            root = nnew;
        }
        //nnew.parent = parent;

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
        else if(getParent(node).color == NodeColor.BLACK) repairCase2();
        else if(getUncle(node)!=null && getUncle(node).color == NodeColor.RED ) repairCase3(node);
        else repairCase4(node);
    }
    void repairCase1(Node node){
        node.color = NodeColor.BLACK;
    }

    void repairCase2(){

    }

    void repairCase3(Node node){
        getParent(node).color = NodeColor.BLACK;
        getUncle(node).color = NodeColor.BLACK;
        getGrandParent(node).color = NodeColor.RED;
        repairTree(getGrandParent(node));
    }

    void repairCase4(Node node){
        //step1

        //step2
    }



}
