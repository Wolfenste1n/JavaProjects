package models;
import java.util.ArrayList;
public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> points = new ArrayList<>();
    // addPoint(Point) - adds to the container
    public void addPoint(Point point) {
        points.add(point);
    }
    // calculatePerimeter()
    public double calculatePerimeter() {
        double p = 0;
        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next = points.get((i + 1) % points.size()); // Замкнуть фигуру
            p += current.distance(next);
        }
//        double p = 0;
//        for (int i = 0; i < points.size() - 1; i++) {
//            p += points.get(i).distance(points.get(i));
//        }
//        p+=points.getLast().distance(points.getFirst());
//        Point prev = points.getLast();
//        for (Point point : points) {
//            p += point.distance(point);
//            prev = point;
//        }
        return p;
    }
    // getAverageSide()
    public double getAverageSide() {
        return calculatePerimeter() / points.size();
    }
    // getLongestSide()
    public double getLongestSide() {
        double longest = 0;
        for(int i = 0; i < points.size(); i++) {
            Point cur = points.get(i);
            Point nex = points.get((i + 1) % points.size());
            double len = cur.distance(nex);
            if(len>longest){
                longest = len;
            }
        }
//        for (Point point : points) {
//            if(point.distance(points.get(0))>longest){
//                longest = point.distance(points.get(0));
//            }
//        }
        return longest;
    }
}
