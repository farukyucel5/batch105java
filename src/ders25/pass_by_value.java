package ders25;

import java.util.Scanner;

public class pass_by_value {
    public static void main(String[] args) {

        double fiyat=100;
        System.out.println(indirim(fiyat));//90

        System.out.println(fiyat);//100
    }

    private static double indirim(double fiyat)
    {
        fiyat=fiyat*0.9;
        return fiyat;
    }
}
