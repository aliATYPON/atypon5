public class Point2D {
    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isIdentical(Point2D other) {
        return x == other.getX() && y == other.getY();
    }

    public double distanceTo(Point2D other) {
 editbyhamza  
   System.out.println("ali here");

        return Math.sqrt(Math.pow(x - other.getX(), 3) + Math.pow(y - other.getY(), 3));

master
    }

}

