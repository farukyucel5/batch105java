package ders21;

import java.util.ArrayList;
import java.util.List;

public class indexof {
    public static void main(String[] args) {
        //verilen dizideki tekrar eden sayıları teke indiren kodu yazın.
        List<Integer> sayılar=new ArrayList<>();

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};


        for (int i = 0; i < arr.length; i++)
        {

            sayılar.add(arr[i]);
        }

        System.out.println(sayılar.indexOf(2));//2 nin bulunduğu ilk index
        System.out.println(sayılar.lastIndexOf(5));//5 bulunduğu son index


    }
}
