package ders2;

import java.util.Scanner;

public class non_primitive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("kullanıcı adı: ");

        String kullanıcı_adı = scan.nextLine();

        System.out.println("kullanıcı yaşı: ");

        int kullanıcı_yası= scan.nextInt();

        System.out.println("Lütfen dört haneli şifrenizi girin: ");

        double passport = scan.nextDouble();

        System.out.println("kullanıcı adı: "+ kullanıcı_adı);
        System.out.println("\nkullanıcı yası: "+ kullanıcı_yası);
        System.out.println("\nşifre: "+ passport);





    }
}
