package prac1;

import java.util.Arrays;

public class Tester {
    Circle [] circles;
    int n;

    public Tester(Circle[] circles, int n) {
        this.circles = circles;
        this.n = n;
    }

    public Circle[] getCircles() {
        return circles;
    }
    public int getN() {
        return n;
    }

    void sort(){
        Circle a;
        for(int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (circles[i].radius>circles[j].radius){
                    a=circles[i];
                    circles[i]=circles[j];
                    circles[j]=a;
                }
            }
        }
    }
    Circle min(){
        int m=111110;
        Circle a=new Circle();
        for(int i=0;i<n;i++){
            if(circles[i].radius<m)
            {
                m=circles[i].radius;
                a=circles[i];
            }
        }
        return a ;
    }
    Circle max(){
        int m=0;
        Circle a=new Circle();
        for(int i=0;i<n;i++){
            if(circles[i].radius>m)
            {
                m=circles[i].radius;
                a=circles[i];
            }
        }
        return a ;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "circles=" + Arrays.toString(circles) +
                ", n=" + n +
                '}';
    }

    public static void main(String[] args) {
        Circle[] a=new Circle[10];
        for (int i=0;i<10;i++){
            a[i]=new Circle();
        }
        Tester l=new Tester(a,10);
        System.out.println(l);
        l.sort();
        System.out.println(l);
        System.out.println(l.min());
        System.out.println(l.max());
    }

}
