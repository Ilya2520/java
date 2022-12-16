package prac6;

public class FG implements Convert{
    double l;

    public FG(double l) {
        this.l = l;
    }

    public void convert() {
        double n;
        double k;
        n = (l - 32) / 1.8;
        k = n + 273;
        System.out.println(n + " Цельсий");
        System.out.println(k + " Кэльвин");
    }

}
