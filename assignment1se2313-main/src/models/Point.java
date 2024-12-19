package models;
public class Point {
    private double x;
    private double y;


    // constructor having both parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    // distance(Point dest) - distance from current point to the dest point
    public double distance(Point dest) {
        return Math.sqrt(Math.pow(x - dest.x, 2) + Math.pow(y - dest.y, 2));
    }
    // toString
}
