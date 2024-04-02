// File name: Queue.java
// Author: Ashim Chand
// VUnetid: chanda
// Email: ashim.chand@vanderbilt.edu
// Class: CS2201 @ Vanderbilt U.
// Honor Statement: Will not use unfair means
// Assignment Number: 7
// Description: Queue
// Last Changed: 4/1/2024
//

// TODO
// Define your generic Queue class here


public class Queue<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node () {
            this.data = null;
            this.next = null;
        }

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> front, rear;
    private int size;

    public Queue() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue Empty");
        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public T front() {
     if (isEmpty()) {
            throw new RuntimeException("Queue Empty");
        }
        return front.data;
    }

    public int size() {
        return size;
    }

    public Queue<T> clone() {
        Queue<T> clone = new Queue<>();
        Node<T> current = this.front;
        while (current != null) {
            clone.enqueue(current.data);
            current = current.next;
        }
        return clone;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Queue)) return false;
        Queue<T> otherQ = (Queue<T>) other;
        if (this.size != otherQ.size) return false;
        Node<T> thisCurrent = this.front;
        Node<T> otherCurrent = otherQ.front;
        while (thisCurrent != null) {
            if (!(thisCurrent.data.equals(otherCurrent.data))) {
                return false;
            }
            thisCurrent = thisCurrent.next;
            otherCurrent = otherCurrent.next;
        }
        return true;
    }
}

