package ders19;

import java.util.Arrays;

public class saga_kaydır {
    public static void main(String[] args) {

        /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de basa tasiyacak
        bir method olusturun, array’i yeni haliyle kaydedin.
         Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]
         */

        int[] arr={4,5,6,7};


        int[] newarray=move_right(arr);

        System.out.println(Arrays.toString(newarray));
    }

    public static int[] move_right(int[] arr)
    {
        int bos=arr[arr.length-1];//son element boş'a atadım.

        for (int i =arr.length-2; i >=0 ; i--) {

            arr[i+1]=arr[i];
        }
        arr[0]=bos;

        return arr;

    }
}
