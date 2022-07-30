package main.structure.binarytree;

public class BinaryTreeTest {

    public static void main(String[] args) {
        final BinaryTree tree = new BinaryTree();
        tree.insert(41);
        tree.insert(22);
        tree.insert(52);
        tree.insert(1);
        tree.insert(56);
        tree.insert(43);
        tree.insert(45);
        tree.insert(35);
        tree.insert(15);
        tree.insert(44);
        tree.insert(41);

        tree.traverseInOrder();
        System.out.println();
        System.out.println(tree.get(15));
        System.out.println(tree.get(56));
        System.out.println(tree.get(111));
        System.out.println(tree.get(41));

        System.out.println(tree.max());
        System.out.println(tree.min());

        tree.delete(44);
        tree.traverseInOrder();
    }
}
