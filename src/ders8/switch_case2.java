package ders8;

import java.util.Scanner;

public class switch_case2 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("please pass in a number: ");

        int ay= scan.nextByte();

        switch (ay)
        {
            case 1:
            case 2:
            case 12:
                System.out.println("kış ayındasınız");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar ayındasınız");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz ayındasınız");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("güz ayındasınız");
                break;
            default:
                System.out.println("1-12 arasında olmayan bir sayı girdiniz ..");
        }


    }

}
