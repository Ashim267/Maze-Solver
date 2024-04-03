
public class Point {

    public int x;  // x coordinate of the point
    public int y;  // y coordinate of the point


    // default ctor -- initialize the Point to the origin (0,0)
    public Point() {
        this(0,0);
    }

    // alt ctor -- initialize the Point to the provided coordinates
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // equals method -- determine if two Point objects are the same
    public boolean equals(Object other) {
        if (!(other instanceof Point)) {
            return false;
        }
        Point otherPt = (Point) other;
        return this.x == otherPt.x && this.y == otherPt.y;
    }

    // toString -- convert a Point to a printable string
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
