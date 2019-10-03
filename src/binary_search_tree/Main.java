package binary_search_tree;

public class Main {
    public static void main(String args[]){

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(15);
        //tree.insert(45);
        tree.insert(60);
        tree.insert(70);
        tree.insert(55);
        tree.inOrderPrint();
        System.out.println("fdasf");
       // System.out.println(tree.search(45));
        //System.out.println(tree.getRoot().value);
        tree.delete(30);
        tree.delete(55);

        tree.inOrderPrint();
        System.out.println("fdasf");

        tree.delete(70);

        tree.inOrderPrint();
        System.out.println("fdasf");
       // System.out.println(tree.search(45));

    }
}
