package ru.otus.java.home.homework11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        BinarySearchTree<Integer> leftTree = new BinarySearchTree<>(1, null, null);
        BinarySearchTree<Integer> rightTree = new BinarySearchTree<>(3, null, null);
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(2, leftTree, rightTree);
        System.out.println(tree.preOrderFind(5));

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5);
        BinarySearchTree<Integer> tree1 = BinarySearchTree.fromList(list);
        System.out.println(tree1.getRoot());
    }
}
