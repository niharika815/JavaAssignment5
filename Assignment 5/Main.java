class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Circle {
    Point p;
    double r;

    Circle(int x, int y, double r) {
        p = new Point(x, y);
        this.r = r;
    }

    void display() {
        System.out.println("Point: (" + p.x + ", " + p.y + ")");
        System.out.println("Radius: " + r);
        System.out.println("Area: " + (3.14 * r * r));
    }
}
public class Main {
    public static void main (String[] args) {
        Circle c = new Circle(2, 3, 4);
        c.display();
    }
 }