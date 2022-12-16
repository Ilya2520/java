package prac3;

public class Square extends Rectangle{
    public Square(){
        width=0.0;
        length = 0.0;
        color="none";
        filed=false;
    }
    public Square(double side){
        width=side;
        length = side;
        color="none";
        filed=false;
    }

    public Square(double side,String c,boolean f){
        width=side;
        length = side;
        color=c;
        filed=f;
    }
    public double getSide(){
        return width;
    }
    @Override
    public String toString(){
        return "Shape: square, side: "+this.width+" color: "+this.color;
    }
}
