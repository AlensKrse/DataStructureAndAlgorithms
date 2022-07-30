package main.pojo;

import java.util.Objects;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(final int data) {
        this.data = data;
    }

    public void insert(final int value) {
        if (value != data) {
            if (value < data) {
                if (Objects.isNull(leftChild)) {
                    leftChild = new TreeNode(value);
                } else {
                    leftChild.insert(value);
                }
            } else {
                if (Objects.isNull(rightChild)) {
                    rightChild = new TreeNode(value);
                } else {
                    rightChild.insert(value);
                }
            }
        }
    }

    public TreeNode get(final int value) {
        if (value == data) {
            return this;
        }

        if (value < data) {
            if (Objects.nonNull(leftChild)) {
                return leftChild.get(value);
            }
        } else {
            if (Objects.nonNull(rightChild)) {
                return rightChild.get(value);
            }
        }

        return null;
    }

    public int min() {
        if (Objects.isNull(leftChild)) {
            return data;
        } else {
            return leftChild.min();
        }
    }

    public int max() {
        if (Objects.isNull(rightChild)) {
            return data;
        } else {
            return rightChild.max();
        }
    }


    public void traverseInOrder() {
        if (Objects.nonNull(leftChild)) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (Objects.nonNull(rightChild)) {
            rightChild.traverseInOrder();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(final int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(final TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(final TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final TreeNode treeNode = (TreeNode) o;
        return data == treeNode.data && Objects.equals(leftChild, treeNode.leftChild) && Objects.equals(rightChild, treeNode.rightChild);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, leftChild, rightChild);
    }

    @Override
    public String toString() {
        return "TreeNode{" + "value=" + data + ", leftChild=" + leftChild + ", rightChild=" + rightChild + '}';
    }
}
