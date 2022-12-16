package prac11.nom5;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>(100);
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i = 0; i < 100000 ; i++){
            al.add(i);
            ll.add(i);
        }

        long startTime = System.nanoTime();
        al.add(51050);
        long estimatedTime =  System.nanoTime()-startTime;
        System.out.println("Array list add: " + estimatedTime+ " ns");
        startTime = System.nanoTime();
        ll.add(5105);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Linked list add: " + estimatedTime+ " ns");

        startTime = System.nanoTime();
        al.add(50000,500106);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Array list add at index: " + estimatedTime+ " ns");
        startTime = System.nanoTime();
        ll.add(50000,5106);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Linked list add at index: " + estimatedTime+ " ns");

        startTime = System.nanoTime();
        al.remove(1000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Array list remove: " + estimatedTime+ " ns");
        startTime = System.nanoTime();
        ll.remove(1000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Linked list remove: " + estimatedTime+ " ns");

        startTime = System.nanoTime();
        al.indexOf(50000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Array list take indexOf: " + estimatedTime+ " ns");
        startTime = System.nanoTime();
        ll.indexOf(50000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Linked list take from index: " + estimatedTime+ " ns");




    }
}
