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
        }
        else if (root.value < value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }
    void inOrderPrint(){
        inOrderPrintRec(root);
    }

    void inOrderPrintRec(Node root){
        if (root!=null){
            inOrderPrintRec(root.left);
            System.out.println(root.value);
            inOrderPrintRec(root.right);
        }
    }

    boolean search(int value){
        Node node =  searchValueRec(root, value);
        if(node==null) return false;
        else return true;
    }
    Node searchValueRec(Node root, int value){
        if(root ==null || root.value == value) return root;
         if(root.value > value) return searchValueRec(root.left, value);
        else return searchValueRec(root.right, value);
    }

    Node getRoot(){
        return root;
    }

    boolean deleteNode(int value){
        return false;
    }


}
