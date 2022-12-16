package prac1;

import java.util.Random;

public class Circle {
    Point center;
    int radius;

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public Circle() {
        Random r=new Random();
        this.center = new Point();
        this.radius = r.nextInt(1,100);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    double c(){
        return 2*this.radius*3.14;
    }
}
