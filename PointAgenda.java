
public interface PointAgenda {

     /**
     *  isEmpty
     *  Checks if the agenda is empty
     *  pre:  The agenda exists.
     *  post: Returns true if it IS empty, false if NOT empty.
     */
    public boolean isEmpty();


    /**
     *  add
     *  adds a Point to the agenda.
     *  pre:  The agenda exists and item is passed.
     *  post: the item is added to the agenda, and size is incremented.
     */
    public void add(Point item);


    /**
     *  remove
     *  removes the next Point from the agenda.
     *  pre:  The agenda exists.
     *  post: The next Point is removed from the agenda.  If the agenda
     *        was already empty, throws a RuntimeException exception.
     */
    public void remove();


    /**
     *  peek
     *  returns the next Point from the agenda without removing it from the agenda.
     *  pre:  The agenda exists.
     *  post: Returns the next Point from the agenda.  If the agenda
     *        was already empty, throws a RuntimeException exception.
     */
    public Point peek();


    /**
     *  size
     *  post: Returns the number of Points in the agenda.
     */
    public int size();

}
