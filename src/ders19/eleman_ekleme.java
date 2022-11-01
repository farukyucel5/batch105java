package ders19;

import java.util.Arrays;

public class eleman_ekleme {
    public static void main(String[] args) {

        int[] arr={2,4,6};

        //bu diziye 4. bir element olarak 8 ekleyelim.
        int[] arr2=new int[arr.length+1];//[0,0,0,0]

        for (int i = 0; i < arr.length; i++) {

            arr2[i]=arr[i];

        }

        System.out.println(Arrays.toString(arr2));

        arr2[arr2.length-1]=8;

        System.out.println(Arrays.toString(arr2));

        arr=arr2;

        System.out.println(Arrays.toString(arr));
    }
}
