package ders18;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {

        String [] arr={"ali","faruk","nesrin"};

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");//tüm elemanları yazdırır

        }
        System.out.println("");

        //array olarak yazdıralım

        System.out.println(arr);//non-primitive olduğundan referanlar yazdırılır.

        //array olarak yazdırmak istersek arrays sınıfından yardım alırız.
        System.out.println(Arrays.toString(arr));
    }
}
