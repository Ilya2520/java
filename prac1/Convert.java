package prac1;

import java.text.NumberFormat;
import java.util.Locale;

public class Convert {
    double n;
    Locale a;

    public Convert(double n, Locale a) {
        this.n = n;
        this.a = a;
    }

    public void conv(){
        System.out.println(a);
        NumberFormat numb1= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numb2= NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        NumberFormat numb3= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat numb4= NumberFormat.getCurrencyInstance(Locale.CHINA);
        if (a==Locale.US){

            System.out.println(numb1.format(n));
            System.out.println(numb2.format(n*0.89));
            System.out.println(numb3.format(n*1.02));
            System.out.println(numb4.format(n*7.29));
        }
        else  if (a==Locale.FRANCE){

            System.out.println(numb1.format(n/1.02));
            System.out.println(numb2.format(n*0.87));
            System.out.println(numb3.format(n));
            System.out.println(numb4.format(n*7.15));
        }

        else  if (a==Locale.ENGLISH){

            System.out.println(numb1.format(n/0.89));
            System.out.println(numb2.format(n));
            System.out.println(numb3.format(n/0.87));
            System.out.println(numb4.format(n*8.12));
        }

        else  if (a==Locale.CHINA){

            System.out.println(numb1.format(n/7.29));
            System.out.println(numb2.format(n/8.12));
            System.out.println(numb3.format(n*7.15));
            System.out.println(numb4.format(n));
        }
        else System.out.println("incorrect input");
        System.out.println();
    }
}
