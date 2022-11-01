package ders14;

import java.util.Locale;

public class soru {

    public static void main(String[] args) {

        String isim="faruk";
        String souisim="yucel";

        System.out.println(uplow(isim,souisim));
    }

    public static String uplow(String a, String b)
    {


        return a.substring(0,1).toUpperCase() + a.substring(1).toLowerCase() + " "
                + b.substring(0,1).toUpperCase() +b.substring(1).toLowerCase();
    }
}
