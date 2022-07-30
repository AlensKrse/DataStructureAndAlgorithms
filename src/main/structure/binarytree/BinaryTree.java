package main.structure.binarytree;

import main.pojo.TreeNode;

import java.util.Objects;

public class BinaryTree {

    private TreeNode root;

    public void insert(final int value) {
        if (Objects.isNull(root)) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (Objects.nonNull(root)) {
            root.traverseInOrder();
        }
    }

    public TreeNode get(final int value) {
        if (Objects.nonNull(root)) {
            return root.get(value);
        }

        return null;
    }

    public void delete(final int value) {
        root = delete(root, value);
    }

    private TreeNode delete(final TreeNode subTreeRoot, final int value) {
        if (Objects.isNull(subTreeRoot)) {
            return null;
        }

        if (value < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else {
            if (Objects.isNull(subTreeRoot.getLeftChild())) {
                return subTreeRoot.getRightChild();
            } else if (Objects.isNull(subTreeRoot.getRightChild())) {
                return subTreeRoot.getLeftChild();
            }

            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }

        return subTreeRoot;
    }

    public Integer min() {
        if (Objects.nonNull(root)) {
            return root.min();
        } else {
            return null;
        }
    }

    public Integer max() {
        if (Objects.nonNull(root)) {
            return root.max();
        } else {
            return null;
        }
    }
}
