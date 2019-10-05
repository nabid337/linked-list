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
       // System.out.println(tree.getRoot().value);
        tree.inOrderPrint();
        System.out.println(tree.nodes.size());

        for(int i=0; i<tree.nodes.size(); i++){
            System.out.println(tree.nodes.get(i).value);
        }

    }
}
