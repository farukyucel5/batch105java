package ders37;

import java.util.Scanner;

public class Throw4 {
    public static void main(String[] args) {
        //kullanıcıdan yas istegin eger negatif sayı veya sıfır girerse uyarı olarak
        //illegal argument exception uyarısı verin ancak kodumuz calısmaya devametsin

        Scanner scan=new Scanner(System.in);
        System.out.println("yasınızı girin");

        int yas= scan.nextInt();

        if (yas<=0)
        {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("yas sıfır veya negatif olamaz.");
            }
        }
    }

}
