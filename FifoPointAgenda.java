// File name: FifoPointAgenda.java
// Author: Ashim Chand
// userid: chanda
// Email: ashim.chand@vanderbilt.edu
// Class: CS2201 @ Vanderbilt U.
// Assignment Number: 7
// Description:  Maintains an agenda of Points in FIFO order.
//     Implements PointAgenda interface: add, remove, peek, isEmpty, size.
// Last Changed: 4/1/2024

// TODO
// Define the FifoPointAgenda class here

public class FifoPointAgenda implements PointAgenda {

    private Queue<Point> agenda;

    public FifoPointAgenda() {
        this.agenda = new Queue<>();
    }

    @Override
    public boolean isEmpty() {
        return agenda.isEmpty();
    }

    @Override
    public void add(Point item) {
        agenda.enqueue(item);
    }

    @Override
    public void remove() {
        agenda.dequeue();
    }

    @Override
    public Point peek() {
        return agenda.front();
    }

    @Override
    public int size() {
        return agenda.size();
    }
}

