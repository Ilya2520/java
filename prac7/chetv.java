package prac7;

import java.util.LinkedList;

public class chetv {
    LinkedList<Integer> firstpl, secpl;

    public chetv(String firstpl, String secpl) {
        this.firstpl = new LinkedList<>();
        this.secpl = new LinkedList<>();
        for(int i = 0; i < 5; i ++){
            this.firstpl.add(Integer.parseInt(firstpl.substring(i, i+1)));
            this.secpl.add(Integer.parseInt(secpl.substring(i, i+1)));
        }
    }


    public String play(){
        int count = 0;
        while(!firstpl.isEmpty() && !secpl.isEmpty() && count <= 106){
            if(firstpl.peek() > secpl.peek()
                    && secpl.peek() != 0){
                firstpl.add(firstpl.remove());
                firstpl.add(secpl.remove());

            }else{
                secpl.add(firstpl.remove());
                secpl.add(secpl.remove());
            }
            count++;
        }
        String res = "";
        if(firstpl.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new chetv("13579", "24680").play());
        System.out.println(new chetv("12345", "67890").play());
        System.out.println(new chetv("13029", "42685").play());
    }

}
