package prac1;

public class Ball {
    String name;
    int speed;


    public Ball(String n,int s){
        name=n;
        speed=s;

    }
    public Ball(String n)     {
        name=n;
        speed=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void isMove() {
        if (speed>0){
            System.out.println(name + " is moving")  ;
        }
        else
        {
            System.out.println(name + " is not moving")      ;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void stopBall(){
        speed=0;
    }
    public void rebound(){
        speed/=2;
    }
}
