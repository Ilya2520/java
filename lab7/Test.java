package lab7;

public class Test {
    public static void main(String[] args) {

        ArrList<Integer> ints = new ArrList<>(8);
        for (int i = 0; i < 20; i++)
            ints.add(i);
        System.out.println(ints);
        for (int i = 5; i < 13; i++)
            ints.remove(i);
        System.out.println(ints);
        System.out.println(ints.get(5));
        System.out.println();

        ArrList<String> strs = new ArrList<>();
        System.out.println(strs);
        for (int i = 0; i < 10; i++) {
            strs.add("String number " + (i + 1));
        }
        System.out.println(strs);
        System.out.println();

        ArrList<String> strs2 = new ArrList<>(strs);
        System.out.println(strs2);
        strs2.remove(5);
        System.out.println(strs.get(5));
    }
}

