package binary_search_tree;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {

        if (root == null) {
            // Node node = new Node(value);
            root = new Node(value);
            return root;
        }

        if (root.value > value) {
            root.left = insertRec(root.left, value);
        } else if (root.value < value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    void inOrderPrint() {
        inOrderPrintRec(root);
    }

    void inOrderPrintRec(Node root) {
        if (root != null) {
            inOrderPrintRec(root.left);
            System.out.println(root.value);
            inOrderPrintRec(root.right);
        }
    }

    boolean search(int value) {
        Node node = searchValueRec(root, value);
        if (node == null) return false;
        else return true;
    }

    Node searchValueRec(Node current, int value) {
        if (current == null || current.value == value) return current;
        if (current.value > value) return searchValueRec(current.left, value);
        else return searchValueRec(current.right, value);
    }

    Node getRoot() {
        return root;
    }

    /*void deleteNode(int value) {
        deleteNodeRec(root, value);
    }

    void deleteNodeRec(Node current, int value) {
        if (current == null) {
            System.out.println("cant delete");
        }
        else if (current.right!=null && current.right.value == value && current.right.left == null && current.right.right ==null) {
            current.right = null;
            System.out.println("successfully deleted");
        }
        else if (current.left!=null && current.left.value == value && current.left.left == null && current.left.right ==null){
            current.left = null;
            System.out.println("successfully deleted");
        }
        else if (current.value > value) deleteNodeRec(current.left, value);
        else deleteNodeRec(current.right, value);
    }*/
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Node to delete found
            // ... code to delete the node will go here
            if (current.left == null && current.right == null) {
                return null;
            }
            else if (current.left!=null && current.right == null){
                return current.left;
            }
            else if(current.right!=null && current.left == null){
                return current.right;
            }
            else {

            }

            //}
        }
        else if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

         current.right = deleteRecursive(current.right, value);
          return current;

    }

}
