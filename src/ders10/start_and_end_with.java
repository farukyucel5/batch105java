package ders10;

import java.util.Scanner;

public class start_and_end_with {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your email adress: ");

        String email= scan.nextLine();

        if(!email.contains("@"))
        {
            System.out.println("geçersiz mail");

        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adesi giriniz");


        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazım hatası");

        }

        else{
            System.out.println("your email adress :  "+ email);
        }
    }
}
