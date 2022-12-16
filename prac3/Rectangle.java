package prac3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        width=0.0;
        length=0.0;
        color="none";
        filed=false;
    }
    public Rectangle(double w,double l){
        width=w;
        length=l;
        color="none";
        filed=false;
    }
    public Rectangle(double w,double l,String c, boolean f){
        width=w;
        length=l;
        color=c;
        filed=f;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width +" length:"+this.length+" color: "+this.color;
    }
}
