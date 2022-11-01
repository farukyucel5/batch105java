package ders8;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("please pass in a number: ");

        int durum= scan.nextByte();

        switch (durum)
        {
            case 1:
                System.out.println("PAZARTESİ");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("geçersiz gün");
        }
    }
}
