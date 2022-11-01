package ders21;

import java.util.ArrayList;
import java.util.List;

public class contains_methodu {
    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>();

        int[] arr ={2,3,4,5,66,7,8,9,0,0,8,9};

        for (int i = 0; i < arr.length; i++)
        {
            sayılar.add(arr[i]);


        }

        System.out.println(sayılar.contains(3));//bir sayının içerip içermediğini söyler

        System.out.println(sayılar.contains(6));
    }
}
