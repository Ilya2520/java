package prac5;

import static java.lang.Math.pow;

public class Simple {
    public static String m(int n,int i) {
        if (i<2) {return  "NO";}
        else if(n%i==0){return "NO";}
        else if (i<pow(n,0.5)){
            return m(n,i+1);
        }
        else return "YES";
    }

    public static void ms(int n,int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            ms(n / k, k);
        }
        else {
            ms(n, ++k);
        }
    }

    public static boolean palindrom(String c) {
        if (c.length()<2){
            return true;
        }
        else if (c.charAt(0)==c.charAt(c.length()-1)){
            return palindrom(c.substring(1,c.length()-1));
        }
        else {return false;}

    }
    public static int withoutTwoNulls(int a,int b){
        if (a-1>b)
            return 0;
        else if (a==0 || b==0) {
            return 1;
        }
        else {
            return withoutTwoNulls(a,b-1)+ withoutTwoNulls(a-1,b-1);
        }
    }
    public static int reverse(int a,int b) {
        if (a!=0){
            return reverse(a/10,b*10+a%10 );
        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println(palindrom("vbvB"));
        System.out.println(palindrom("BvbvB"));
        System.out.println(m(19,2));
        ms(24,2);
        System.out.println(withoutTwoNulls(5,5));
        System.out.println(reverse(1234,0));
    }
}
