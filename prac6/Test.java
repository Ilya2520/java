package prac6;

import static prac6.Printable.print;

public class Test {
    public static void main(String[] args) {

        Book a=new Book("Hell",55,12);
        Shop l=new Shop("lamoda",500,25000,true);
        Printable[] b=new Printable[]{
                new Book(),
                new Shop(),
                new Book(),
                new Shop(),
                new Book(),
                new Shop()
        };
        for(int i=0;i<6;i++){
            if (i%2==0)
                b[i]=new Book("Hell"+i,55*i,12*i);
            else  b[i]=new Shop("lamoda"+i,500*i,25000*i,true);
        }
        for (int i=0;i<6;i++){
            if(i%2==0)
                System.out.println(((Book)b[i]).print());
            else

                System.out.println(((Shop)b[i]).print());
        }

        l.add(new Comp("AAA",1500));
        l.add(new Comp("AAB",1200));
        l.add(new Comp("AAC",2000));
        l.add(new Comp("AAD",5000));
        l.pr();
        System.out.println("After delete");
        l.delet("AAB");
        l.pr();
        System.out.println("Test3");
        KLv klv =new KLv(50);
        System.out.println(" 50 Кэльвин");
        klv.convert();
        FG fg=new FG(50);

        System.out.println("50 Фаренгейт");
        fg.convert();
        Cls cls=new Cls(50);

        System.out.println("50 Цельсии:");
        cls.convert();
    }
}
