package prac31;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {


    @Test
    void sort() {
        InsertSort arraySort = new InsertSort();

        assertArrayEquals(new int[]{13,15, 42, 48, 65}, arraySort.sort(new int[]{15, 42, 13, 48, 65}));

        assertArrayEquals(new int[]{1,13,15, 42, 48, 65}, arraySort.sort(new int[]{15, 42, 13, 48, 65,1}));



    }

}
