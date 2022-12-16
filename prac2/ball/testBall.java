package ball;

import ball.Ball;

public class testBall {
    public static void main(String[] args ){
        Ball b=new Ball();
        b.setXY(1.3,2.3);
        System.out.println(b.toString());
        b.move(10,12);
        System.out.println(b.toString());
    }
}
