package ders35;

import java.util.Scanner;

public class array_indexout_of_exeption {
    public static void main(String[] args) {

        int[] arr={3,4,5,66,7,8,9,0};
        Scanner scan=new Scanner(System.in);

        try {
            System.out.println("sayı girin");
            int index= scan.nextInt();
            System.out.println(arr[index]);
        } catch (Exception e) {
            System.out.println("lütfen 0 ile 7 arasında bir sayı girin");
        }
    }
}
