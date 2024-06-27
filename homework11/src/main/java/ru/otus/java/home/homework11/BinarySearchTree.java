package ru.otus.java.home.homework11;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class BinarySearchTree<T> {
    private T root;
    private BinarySearchTree<T> left;
    private BinarySearchTree<T> right;

    public T getRoot() {
        return root;
    }

    public BinarySearchTree<T> getLeft() {
        return left;
    }

    protected boolean setLeft(T element) {
        try {
            this.left = new BinarySearchTree<>(element, null, null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected boolean setRoot(T element) {
        try {
            this.root = element;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected boolean setRight(T element) {
        try {
            this.right = new BinarySearchTree<>(element, null, null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public BinarySearchTree<T> getRight() {
        return right;
    }

    public Optional<T> preOrderFind(T element) {
        if (this.getRoot() == element) {
            return Optional.of(element);
        } else if (this.getLeft() != null || this.getRight() != null) {
            return this.getLeft().preOrderFind(element).or(()->this.getRight().preOrderFind(element));
        }
        return Optional.empty();
    }

    BinarySearchTree(T root, BinarySearchTree<T> left, BinarySearchTree<T> right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    private static <R extends Comparable<R>> void traverseInsertTree(BinarySearchTree<R> tree, R elementToInsert) {
        if (tree.getRoot().compareTo(elementToInsert) < 0) {
            if (tree.getLeft() != null) {
                traverseInsertTree(tree.getLeft(), elementToInsert);
            } else {
                tree.setLeft(elementToInsert);
            }
        } else {
            if (tree.getRight() != null) {
                traverseInsertTree(tree.getRight(), elementToInsert);
            } else {
                tree.setRight(elementToInsert);
            }
        }
    }

    public static <R extends Comparable<R>> BinarySearchTree<R> fromList(List<R> inputList) {
        Collections.shuffle(inputList); // best guess
        BinarySearchTree<R> initialTree = new BinarySearchTree<>(null, null, null);
        if (inputList.isEmpty()) {
            return initialTree;
        } else {
            ListIterator<R> iterator = inputList.listIterator();
            while (iterator.hasNext()) {
                if (initialTree.getRoot() == null) {
                    initialTree.setRoot(iterator.next());
                } else {
                    traverseInsertTree(initialTree, iterator.next());
                }
            }
        }
        return initialTree;
    }
}