package prac1;

public class Dog1 {
    private String name;
    private int age;
    private String color;



    public Dog1(String a,int b,String c){
        name = a;
        age = b;
        color=c;
    }
    public Dog1(String a,String c){
        name = a;
        age = 0;
        color=c;
    }
    public Dog1(String a,int b){
        name = a;
        age = b;
        color="none";
    }
    public Dog1(int b,String c){
        name = "none";
        age = b;
        color=c;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void yearsLeft() {
        if (age < 20) {
            System.out.println(name + " has about " + Integer.toString(20 - age) + " years to live");
        }
        else {
            System.out.println("impossible to predict remaning years of " + name +"'s life");

        }
    }
    public void allInfo(){
        System.out.println(name + " age - " +age + ", color - " + color);
    }
}

