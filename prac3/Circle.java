package prac3;
import java.math.*;

public class Circle extends Shape {
    protected double radius;

    public Circle(){
        radius=0.0;
        color="none";
        filed=false;
    }

    public Circle(double r,String c, boolean f){
        radius = r;
        color=c;
        filed=f;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+" color: "+this.color;
    }
}
