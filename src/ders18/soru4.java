package ders18;

import java.util.Arrays;
import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve
        // elementlerini alip array’i olusturan ve bize donduren bir method olusturun.

         int[] newarray=array();
        System.out.println(Arrays.toString(newarray));
    }

    public static int[] array()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("boyut girin: ");
        int dimention=scan.nextInt();
        System.out.println(dimention +" adet sayı gir");

        int [] user_array=new int[dimention];

        for (int i = 0; i < dimention; i++) {

            user_array[i]=scan.nextInt();



        }

        return user_array;
    }
}
