package com.challenges.orm.utils;

public class Node <T> {
    T value;
    Node<T> next;
    Node<T> prev;

    public Node (T value) {
        this.value = value;
    }
}
