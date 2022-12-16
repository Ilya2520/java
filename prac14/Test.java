package prac14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {

    public static void main(String[] args) {
        System.out.println(Task6("@my.ru"));
        System.out.println(Task6("ewdhef@my.ru"));
        System.out.println(Task6("my.ru"));
        System.out.println(Task6("adqwefedw@my.ru"));
        System.out.println(Task6("adqwefedwmy@"));
        System.out.println(Task6("adqwefedw@.com"));
    }


    public static void Task1(String stForSplit) {
        String[] splitString = stForSplit.split("\\s+");
        for (String word : splitString) System.out.println(word);
    }

    public static boolean Task2(String stTaskTwo) {
        return stTaskTwo.matches("abcdefghijklmnopqrstuv18340");
    }

    public static boolean Task3(String stTaskThree) {
        return stTaskThree.matches("^[0-9]{1,}.[0-9]{1,2}\\s(USD|RUB|EU)");
    }


    public static boolean Task4(String stTaskFour) {
        return stTaskFour.matches(".*(\\+)\\s*[0-9]{1,}.*");
    }

    public static boolean Task5(String stTaskFive) {
        return stTaskFive.matches("(0[1-9]|[12][0-9]|3[01])[/](0[13578]|1[02])[/](([0-9]{2})[0-9]{2})|0[1-9]|[12][0-9]|30[/](0[469]|11)[/](([0-9]{2})[0-9]{2})|(0[1-9]|1[0-9]|2[0-8])[/](02)[/](([0-9]{2})[0-9]{2})|29[/](02)[/]((([0-9]{2})(04|08|[2468][048]|[13579][26]))|2000|1000)");
    }

    public static boolean Task6(String stTaskSix) {
        return stTaskSix.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)(()|(\\.([a-zA-Z]{2,5})))$");
    }
}