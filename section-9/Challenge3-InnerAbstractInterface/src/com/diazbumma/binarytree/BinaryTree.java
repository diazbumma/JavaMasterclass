package com.diazbumma.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private NodeTree root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(NodeTree data) {
        if (root == null) {
            root = data;
        } else {
            NodeTree current = root;
            while (true) {
                if (data.compareTo(current) < 0) {
                    if (current.hasLeft()) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(data);
                        return;
                    }
                } else {
                    if (current.hasRight()) {
                        current = current.getRight();
                    } else {
                        current.setRight(data);
                        return;
                    }
                }
            }
        }
    }

    public void printPreorder() {
        if (root == null)
            System.out.print("No Data");
        else
            preorderTraversal(root);

        System.out.print("\n");
    }

    private void preorderTraversal(NodeTree root) {
        System.out.print(root.getData() + " ");

        if (root.hasLeft())
            preorderTraversal(root.getLeft());

        if (root.hasRight())
            preorderTraversal(root.getRight());
    }

    public void printInorder() {
        if (root == null)
            System.out.print("No Data");
        else
            inorderTraversal(root);

        System.out.print("\n");
    }

    private void inorderTraversal(NodeTree root) {
        if (root.hasLeft())
            inorderTraversal(root.getLeft());

        System.out.print(root.getData() + " ");

        if (root.hasRight())
            inorderTraversal(root.getRight());
    }

    public void printPostorder() {
        if (root == null)
            System.out.print("No Data");
        else
            postorderTraversal(root);

        System.out.print("\n");
    }

    private void postorderTraversal(NodeTree root) {
        if (root.hasLeft())
            postorderTraversal(root.getLeft());

        if (root.hasRight())
            postorderTraversal(root.getRight());

        System.out.print(root.getData() + " ");
    }

    public void printLevelOrder() {
        if (root == null)
            System.out.print("No Data");
        else
            levelOrderTraversal(root);

        System.out.print("\n");
    }

    private void levelOrderTraversal(NodeTree root) {
        Queue<NodeTree> queue = new LinkedList<>();
        int upperLevel = 1;
        queue.add(root);
        while (!queue.isEmpty()) {
            int countNextQueue = 0;
            for (int i = 0; i < upperLevel; i++) {
                NodeTree current = queue.poll();
                System.out.print(current.getData() + " ");

                if (current.hasLeft()) {
                    queue.add(current.getLeft());
                    countNextQueue++;
                }

                if (current.hasRight()) {
                    queue.add(current.getRight());
                    countNextQueue++;
                }
            }
            upperLevel = countNextQueue;
        }
    }
}
