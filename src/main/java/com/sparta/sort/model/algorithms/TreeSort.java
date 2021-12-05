package com.sparta.sort.model.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeSort<T extends Comparable<T>> extends SortingAlgo{
    /*
    - Takes list of elements T
    - Binary search tree by inserting data from list into binary search tree
    - Traverse tree in-order to get elements sorted in order
     */

    // Node class
    private class Node {
        T element;
        Node left, right;

        // Node custom constructor
        public Node(T item) {
            element = item;
            left = right = null;
        }
    }

    // Instance variables
    private String name = "Tree sort";
    private Node root;
    private List<T> list;

    // Custom constructor
    public TreeSort() {
        root = null;
        list = new ArrayList<>();
    }

    // Name getter
    public String getName() { return this.name; }

    // Root getter
    public Node getRoot() {
        return root;
    }

    public void setList(String listType) {
        if (listType.equalsIgnoreCase("linked"))
            list = new LinkedList<>();
        else
            list = new ArrayList<>();
    }

    // Methods
    // Class insert element function
    public void insert(T element) {
        root = insertRec(root, element);
    }

    public Node insertRec(Node root, T element) {
        if (root == null) {
            root = new Node(element);
            return root;
        }

        if (root.element.compareTo(element) > 0) {
            root.left = insertRec(root.left, element);
        } else if (root.element.compareTo(element) < 0) {
            root.right = insertRec(root.right, element);
        }

        return root;
    }

    public List<T> inorderTraverse(Node root) {
        if (root != null) {
            inorderTraverse(root.left);
            list.add(root.element);
            inorderTraverse(root.right);
        }

        return list;
    }

    public void treeInsert(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            insert(list.get(i));
        }
    }

    public List<T> sort(List<T> list, boolean timing) {
        if (list == null) return null;

        List<T> orderedList;
        if (timing) super.timer.start();
        treeInsert(list);
        orderedList = inorderTraverse(this.root);
        if (timing) super.timer.stop();
        return orderedList;
    }
}
