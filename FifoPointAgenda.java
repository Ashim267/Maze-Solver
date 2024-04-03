

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

