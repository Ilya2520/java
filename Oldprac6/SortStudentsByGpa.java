package prac6;

import java.util.Comparator;

public class SortStudentsByGpa implements Comparator {
    @Override
    public int compare(Object q1,Object q2){
        if (!(q1 instanceof Student && q2 instanceof Student))
            throw new IllegalArgumentException("");
        return ((Student) q1).getGpa() - ((Student) q2).getGpa();
    }
}
