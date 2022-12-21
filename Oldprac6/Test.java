package prac6;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.Date;

public class Test {

    public static void display(int year, int month, int day, int hour, int minute, int second) {

        Student developer = new Student("Ilya", "Emelyanov", 12, 13);

        try {
            Calendar startCal = Calendar.getInstance();
            startCal.set(Calendar.YEAR, year);
            startCal.set(Calendar.MONTH, month);
            startCal.set(Calendar.DAY_OF_MONTH, day);
            startCal.set(Calendar.HOUR_OF_DAY, hour);
            startCal.set(Calendar.MINUTE, minute);
            startCal.set(Calendar.SECOND, second);
            startCal.set(Calendar.MILLISECOND, 0);

            System.out.println("\n\nРазработчик: " +
                    "\nИмя        - " + developer.getName() +
                    "\nФамилмя - " + developer.getSurname());
            Date startDate = startCal.getTime();
            System.out.println("\nДата и время получения задания\n" + startDate);

            Date currentTime = new Date();
            System.out.println("\nДата и время сдачи задания\n"
                     + currentTime);

        } catch (Exception e) {
            System.err.println("Произошла ошибка " + e);

        }
    }

    public static void insertSort(Student[] input) {
        for (int i = 1; i < input.length; i++) {
            Student key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j].idNumber > key.idNumber) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
    }

    private static SortStudentsByGpa comp = new SortStudentsByGpa();

    public static void qSort(Object[] array, int high, int low) {
        if (array == null || array.length == 0) return;
        if (high <= low) return;

        Object middle = array[(low + high) / 2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (comp.compare(array[i], middle) > 0) {
                right.add(array[i]);
            } else if (comp.compare(array[i], middle) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if (left.size() > 0) {
            leftArr = left.toArray();
            qSort(leftArr, left.size() - 1, 0);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low + left.size(), eq.size());

        if (right.size() > 0) {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low + left.size() + eq.size(), right.size());

        }

    }

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].idNumber < r[j].idNumber) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


    public static void CreateAndSort() {

        int j = 0;
        Student[] a = new Student[15];
        File file = new File("C:\\Users\\ILYA Main\\IdeaProjects\\Javaprog\\src\\prac6\\1.txt");
        try (BufferedReader b = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = b.readLine()) != null) {
                String[] keys = line.split(" ");
                a[j] = new Student(keys[0], keys[1], Integer.parseInt(keys[2]), Integer.parseInt(keys[3]));
                j += 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(a[i]);
        }
        System.out.println("После сортировки:");
        insertSort(a);
        for (int i = 0; i < 15; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println("Сортировка по  GPA");
        qSort(a, a.length - 1, 0);
        for (Student s : a) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Объединённый список");
        Student[] students2 = new Student[]{new Student("Виктория", "Керр", 13450, 2000),
                new Student("Людовик", "Керн", 11950, 2003),
                new Student("Рут", "Холлан", 17150, 2002),
                new Student("Альберт", "Норман", 18458, 2002)};
        Student[] allStudents = new Student[a.length + students2.length];
        System.arraycopy(a, 0, allStudents, 0, a.length);
        System.arraycopy(students2, 0, allStudents, a.length, students2.length);
        mergeSort(allStudents, allStudents.length);
        for (Student s : allStudents) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        CreateAndSort();


    }
}

