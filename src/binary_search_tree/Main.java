package binary_search_tree;

public class Main {
    public static void main(String args[]){

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);
        tree.inOrderPrint();
        System.out.println(tree.search(505));
        System.out.println(tree.getRoot().value);
       // System.out.println("fdsa");

    }
}
