package prac1;

import java.util.Locale;

public class ConvTest {

    public static void main(String[] args) {

        Convert a=new Convert(554.3, Locale.CHINA);
        a.conv();

        Convert a1=new Convert(554.3, Locale.US);
        a1.conv();

        Convert a2=new Convert(554.3, Locale.FRANCE);
        a2.conv();
    }
}
