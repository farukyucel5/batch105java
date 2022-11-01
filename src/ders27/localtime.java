package ders27;

import java.time.LocalTime;

public class localtime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println(saat);

        LocalTime saat1=LocalTime.of(16,10,20);

        System.out.println(saat.compareTo(saat1));


    }
}
