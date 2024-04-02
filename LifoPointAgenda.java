// File name: LifoPointAgenda.java
// Author: Ashim Chand
// userid: chanda
// Email: ashim.chand@vanderbilt.edu
// Class: CS2201 @ Vanderbilt U.
// Assignment Number: 7
// Description:  Maintains an agenda of Points in LIFO order.
//     Implements PointAgenda interface: add, remove, peek, isEmpty, size.
// Last Changed: 4/1/2024

// TODO
// Define the LifoPointAgenda class here

public class LifoPointAgenda implements PointAgenda {

    private Stack<Point> agenda;


    public LifoPointAgenda(){
        this.agenda = new Stack<>();
    }

    @Override
    public boolean isEmpty() {
        return agenda.isEmpty();
    }

    @Override
    public void add(Point item) {
        agenda.push(item);
    }

    @Override
    public void remove() {
        agenda.pop();
    }

    @Override
    public Point peek() {
        return agenda.top();
    }

    @Override
    public int size() {
        return agenda.size();
    }
}
