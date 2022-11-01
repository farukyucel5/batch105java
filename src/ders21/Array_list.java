package ders21;

import java.util.ArrayList;
import java.util.List;

public class Array_list {
    public static void main(String[] args) {


        List<Integer> sayılar= new ArrayList<>();
        sayılar.add(4);
        sayılar.add(5);

        System.out.println(sayılar);

        sayılar.add(30);

        System.out.println(sayılar);

        sayılar.add(1,15);

        System.out.println(sayılar);
        sayılar.add(0,1);

        System.out.println(sayılar);

        List<Integer> sayılarekle= new ArrayList<>();

        sayılarekle.add(10);
        sayılarekle.add(23);

        sayılar.addAll(sayılarekle);

        System.out.println(sayılar);

        sayılar.addAll(1,sayılarekle);

        System.out.println(sayılar);
    }
}
