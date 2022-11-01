package ders18;

import java.util.Arrays;

public class soru1 {

    public static void main(String[] args) {

        //Soru 1- Verilen bir int array’in tum elemanlarini
        // 2 artirip bize donduren bir method olusturun. Eski array’i yeni haliyle kaydedin.

        int[] arr = {1, 2, 34, 45};

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + 2;

        }

        System.out.println(Arrays.toString(arr));//method kullanmadan

        arr = iki_artır(arr);//methodla yaptık

        System.out.println(Arrays.toString(arr));
    }

    public static int[] iki_artır(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + 2;

        }

        return arr;

    }
}