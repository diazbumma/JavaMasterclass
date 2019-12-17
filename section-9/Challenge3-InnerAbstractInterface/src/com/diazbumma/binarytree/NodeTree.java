package com.diazbumma.binarytree;

import com.diazbumma.ListItem;

public class NodeTree extends ListItem {

    private NodeTree left;
    private NodeTree right;

    public NodeTree(String data) {
        super(data);
        this.left = null;
        this.right = null;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }

    @Override
    public String getData() {
        return super.getData();
    }

    public NodeTree getLeft() {
        return left;
    }

    public void setLeft(NodeTree left) {
        this.left = left;
    }

    public NodeTree getRight() {
        return right;
    }

    public void setRight(NodeTree right) {
        this.right = right;
    }

    @Override
    public int compareTo(ListItem item) {
        return this.data.compareTo(item.getData());
    }
}
