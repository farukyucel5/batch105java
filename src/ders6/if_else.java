package ders6;

import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir kelime girin..");

        char ilkharf= scan.next().charAt(0);

        if(ilkharf=='O'|| ilkharf=='o');
        {
            System.out.println("Ocak");
        }
    }
}
