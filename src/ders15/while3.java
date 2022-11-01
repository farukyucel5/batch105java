package ders15;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int girilen1=0;
        int toplam=0;
        int sayac=0;

        while (toplam<500)
        {

            System.out.println("sayı giriniz: ");

            girilen1=scan.nextInt();
            toplam+=girilen1;
            sayac++;

        }

        System.out.println("girilen "+sayac +" sayının toplamı "+toplam);
    }
}
