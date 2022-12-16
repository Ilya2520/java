package prac6;

public class Cls implements Convert{
    double l;

    public Cls(int l) {
        this.l = l;
    }

    public void convert() {
        double n;
        double k;
        n = 1.8 * l + 32;
        k = 273 + l;
        System.out.println(n + " Фаренгейт");
        System.out.println(k + " Кэльвин");
    }
}
