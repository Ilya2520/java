package prac7;

import java.util.Stack;

public class first {
    Stack<Integer> firstpl, secpl;

    public first(String firstpl, String secpl) {
        this.firstpl = new Stack<>();
        this.secpl = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.firstpl.push(Integer.parseInt(firstpl.substring(i, i+1)));
            this.secpl.push(Integer.parseInt(secpl.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play(){
        int count = 0;
        while(!firstpl.isEmpty() && !secpl.isEmpty() && count <= 106){
            if(firstpl.peek() > secpl.peek()
                    && secpl.peek() != 0){
                pushBack(firstpl, firstpl.pop());
                pushBack(firstpl, secpl.pop());
            }else{
                pushBack(secpl, firstpl.pop());
                pushBack(secpl, secpl.pop());
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
        System.out.println(new first("13579", "24680").play());
        System.out.println(new first("12345", "67890").play());
        System.out.println(new first("13029", "42685").play());
    }

}
