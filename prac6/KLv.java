package prac6;

public class KLv {
    double l;

    public KLv(double l) {
        this.l = l;
    }

    public void convert() {
        double n;
        double k;
        k = l - 273;
        n = 1.8 * k + 32;
        System.out.println(k + " Цельсий");
        System.out.println(n + " Фаренгейт");
    }
}
