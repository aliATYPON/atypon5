public class Circle2D {
    private final Point2D center;
    private final double radius;

    public Circle2D(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point2D getCenter() {
        return center;
    }

    public boolean overlaps(Circle2D other) {
        double d = Math.sqrt(Math.pow(center.getX() - other.getCenter().getX(), 2) +
                Math.pow(center.getY() - other.getCenter().getY(), 2));

        return d < (radius + other.getRadius());
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(Point2D point) {
        double distance = center.distanceTo(point);
        return distance <= radius;
    }

    public boolean contains(Circle2D other) {
        double distance = center.distanceTo(other.getCenter());
        return distance + other.getRadius() <= radius;
    }

    public boolean intersects(Circle2D other) {
        double distance = center.distanceTo(other.getCenter());
        return distance < radius + other.getRadius();
    }
}