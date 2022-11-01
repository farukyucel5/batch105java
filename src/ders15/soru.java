package ders15;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {

        /*
        : Kullanicidan Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
         kullanicinin yeni sifre girmesi isteyin
      Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre yazilinca
      “sifreniz basari ile kaydedildi” yazdirin
      sartlar :
      - sifrenin ilk karakteri kucuk harf olmali
             - sifrenin son karakteri sayi olmali
         */

        int sayac=0;

        while (sayac<10)
        {
            System.out.println("enter the passport: ");

            Scanner scan =new Scanner(System.in);

            String passport=scan.next();

            int lastin =passport.length()-1;
            if(passport.charAt(0)>='a' && passport.charAt(0)<='y'&& passport.charAt(lastin)>'0'&&
                    passport.charAt(lastin)<'9')

            {
                System.out.println("sifre basarılı");

            }
            else
                System.out.println("yanlıs giriş");

        }
    }
}
