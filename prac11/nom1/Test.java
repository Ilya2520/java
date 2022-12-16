package prac11.nom1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws ParseException {
        Task first = new Task("Emelyanov", (new SimpleDateFormat("dd.MM.yyyy")).parse("20.12.2010"));
        first.setEndDate(new Date());
        System.out.println(first);
    }}