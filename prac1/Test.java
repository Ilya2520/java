package prac1;
import java.math.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void m() {
        double []arr=new double[10];
        System.out.println("First method");
        for(int i=0;i<10;i++){
            arr[i]=Math.random();
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        double x;
        for(int i=0;i<9;i++){
            for(int j=i+1;j<10;j++){
            if(arr[i]>arr[j]) {
                x = arr[i];
                arr[i]=arr[j];
                arr[j]=x;
            }
        }
        }
        System.out.println("After sort:");
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        Random rand =new Random();
        System.out.println("Second method");
        for(int i=0;i<10;i++){
            arr[i]=rand.nextDouble();
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<9;i++){
            for(int j=i+1;j<10;j++){
                if(arr[i]>arr[j]) {
                    x = arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
        System.out.println("After sort:");
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
    public static void m2() {
        double a;
        String h = "5.8",r;
        a = Double.parseDouble(h);
        System.out.println(a);
        a = Double.valueOf(h);
        System.out.println(a);
        r=Double.toString(a);
        System.out.println(r);
        int t=(int)(a);
        System.out.println(t);
    }

    public static boolean posled(int [] n,int nl) {
        for(int i=0;i<nl-1;i++){
            if(n[i]>=n[i+1])
                return false;
        }
        return true;
    }
    public static void t3() {
        int[] a=new int[4];
        Random r=new Random();
        for (int i=0;i<4;i++){
            a[i]=r.nextInt(10,99);
        }
        for (int i=0;i<4;i++){
            System.out.println(a[i]);
        }
        System.out.println("Является строго возраст последовательностью: "+ posled(a,4));
    }

    public static void t4() {
        Scanner a=new Scanner(System.in);
        Random r=new Random();
        int n;
        System.out.println("Введите количество элементов");
        n=a.nextInt();
        while (!(n>0)){
            System.out.println("Введите количество элементов");
            n=a.nextInt();
        }
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=r.nextInt(0,n);
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int [] arr2=new int[n/2+1];
        int i2=0;
        for (int i=0;i<n;i=i+2)
        {
            arr2[i2]=arr[i];
            i2++;
        }
        System.out.println("______ARRAY2______");
        for (int i=0;i<i2;i++){
            System.out.println(arr2[i]);
        }


    }
    public static void main(String[] args) {
        NumberFormat numb= NumberFormat.getCurrencyInstance(Locale.US);
        int n=1;
        System.out.println(numb.format(n));
    }
}
