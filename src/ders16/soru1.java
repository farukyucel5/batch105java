package ders16;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin
        ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde
        “Sifreniz Kabul edilmistir” yazdirin.
         - Sifre kucuk harf icermelidir
          - Sifre buyuk harf icermelidir
           - Sifre ozel karakter icermelidir
            - Sifre en az 8 karakter olmalidir.
         */
        Scanner scan=new Scanner(System.in);
        int flag;
        int flag1;
        int flag2;
        int flag3;


        do {
            System.out.println("please enter your passport: ");
            String passport=scan.nextLine();
            flag=0;
            flag1=0;
            flag2=0;
            flag3=0;
            for (int i = 0; i <passport.length() ; i++)
            {
                if (passport.charAt(i)>='a'&& passport.charAt(i)<='z')
                {
                    flag1++;
                    break;
                }

            }

            if (flag1==0)
            {
                System.out.println("passport must include a lowercase!!");
            }


            for (int i = 0; i < passport.length(); i++) {

                if (passport.charAt(i)>='A'&& passport.charAt(i)<='Z')
                {
                    flag2++;
                    break;
                }

            }

            if (flag2==0)
            {
                System.out.println("passport must include an uppercase");

            }

            for (int i = 0; i <passport.length() ; i++) {

                if (passport.charAt(i)>='!'&& passport.charAt(i)<='/')
                {
                    flag3++;
                    break;
                }

            }


            if (flag3==0)
            {
                System.out.println("passport must include special char:");
            }


            if ((passport.length()<8))
            {
                System.out.println("passport must include al least 8 chars");
            }

             flag=flag1+flag2+flag3;

        }while (flag!=3);

        System.out.println("you've logged in the system succesfully!!");
      }
}
