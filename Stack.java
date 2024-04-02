// File name: Stack.java
// Author: Ashim Chand
// VUnetid: chanda
// Email: ashim.chand@vanderbilt.edu
// Class: CS2201 @ Vanderbilt U.
// Honor Statement: Will not use unfair means
// Assignment Number: 7
// Description: Stack
// Last Changed: 4/1/2024
//

// TODO
// Define your generic Stack class here

public class Stack<T> {

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

    private Node<T> top;
    private int sizeS;


    /**
     * Default Constructor -- Create an empty stack.
     */
    public Stack() {
        this.top = null;
        this.sizeS = 0;
    }


    /**
     *  isEmpty
     *  Checks if the stack is empty
     *  pre:  A stack exists.
     *  post: Returns true if it IS empty, false if NOT empty.
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     *  push
     *  Pushes an item on top of the stack.
     *  pre:  Stack exists and item is passed.
     *  post: the item is placed on top of the stack, and size is incremented.
     */

    public void push(T item) {
        Node<T> newNode = new Node<>(item, top);
        top = newNode;
        sizeS++;
    }

    /**
     * pop
     * Pops the top item off the stack.
     * pre:  Stack exists.
     * post: Removes item on top of stack.  If the stack
     *       was already empty, throws a RuntimeException exception.
     */
    public void pop() {
       if (isEmpty()) {
            throw new RuntimeException("empty stack");
        }
        top = top.next;
        sizeS--;
    }


    /**
     *  top
     *  Returns the top item of the stack without popping it.
     *  pre:  Stack exists.
     *  post: Returns item on top of stack.  If the stack
     *        was already empty, throws a RuntimeException exception.
     */
    public T top() {
       if (isEmpty()) {
            throw new RuntimeException("empty stack");
        }
        return top.data;
    }

    /**
     *  size
     *  Returns the number of items on the stack.
     *  post: Returns size from the private section of class.
     */

    public int size() {
        return sizeS;
    }


    /**
     * clone
     * Return a new DblStack object that is a clone of the 'this' object.
     * The clone should have its own list (of the same size) and contain all the values
     * of 'this' object.
     */
    public Stack<T> clone() {
        Stack<T> copy = new Stack<>();

        Node<T> current = top;

        Node<T> newy = new Node<>();
        newy.data = current.data;
        copy.top = newy;
        current = current.next;
        copy.sizeS = this.sizeS;

        while(current != null){
            newy.next = new Node<>();
            newy = newy.next;
            newy.data = current.data;
            current = current.next;
        }
        return copy;

    }

    /**
     * equals
     * Determine if two DblStack objects are equal
     * @param other -- The object to compare
     * @return true if the two DblStacks are equivalent (same size and same data)
     */


    public boolean equals(Object other) {
        if (!(other instanceof Stack)) return false;
        Stack<T> that = (Stack<T>) other;
        if (this.sizeS != that.sizeS) {
            return false;
        }
        Node<T> thisCurrent = this.top;
        Node<T> thatCurrent = that.top;
        while (thisCurrent != null && thatCurrent != null) {
            if (!(thisCurrent.data.equals(thatCurrent.data))) {
                return false;
            }
            thisCurrent = thisCurrent.next;
            thatCurrent = thatCurrent.next;
        }
        return true;
    }


}