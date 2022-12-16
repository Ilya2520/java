package prac3;

public abstract class Shape {
    protected String color;
    protected boolean filed;

    public Shape(){
        color="";
        filed=false;
    }

    public Shape(String c, boolean f){
        color=c;
        filed=f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filed;
    }

    public void setFiled(boolean filed) {
        this.filed = filed;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
