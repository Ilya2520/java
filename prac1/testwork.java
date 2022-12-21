package prac1;

public class testwork {
    public static void testdog(){
        Dog1 d1= new Dog1("John",15,"Black");
        Dog1 d2= new Dog1("Fred","White");
        Dog1 d3= new Dog1("Carlos",2);
        d2.setAge(21);
        d3.setColor("Pink");
        d1.yearsLeft();
        d2.yearsLeft();
        d3.yearsLeft();
        d2.allInfo();
    }
    public static void testBall(){
        Ball b1 = new Ball("Sochi2014",100);
        System.out.println(b1.getSpeed());
        b1.isMove();
        b1.stopBall();
        b1.isMove();
        System.out.println(b1.getSpeed());
        b1.rebound();
        System.out.println(b1.getSpeed());
        b1.setSpeed(10);
        System.out.println(b1.getSpeed());
        b1.rebound();
        System.out.println(b1.getSpeed());
    }
    public static void testBook(){
        Book b1 = new Book("Martin Iden",450,350);
        System.out.println("Current page= "+b1.getCurrentPage());
        b1.nextPage();
        System.out.println("Current page= "+b1.getCurrentPage());
        b1.bookIsEnd();
        b1.remaningPages();
        b1.close();
        b1.isOpen();
    }
    public static void main(String[] args){
        testdog();
        testBall();
        testBook();
    }
}
