package prac7;

import java.util.ArrayDeque;
import java.util.Queue;

public class sec {
    Queue<Integer> firstpl, secpl;

    public sec(String firstpl, String secpl) {
        this.firstpl = new ArrayDeque<>();
        this.secpl = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.firstpl.add(Integer.parseInt(firstpl.substring(i, i+1)));
            this.secpl.add(Integer.parseInt(secpl.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!firstpl.isEmpty() && !secpl.isEmpty() && count < 106){
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
        else if (secpl.isEmpty()) res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new sec("13579", "24680").play());
        System.out.println(new sec("12345", "67890").play());
        System.out.println(new sec("13029", "42685").play());
    }

}