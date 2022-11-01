package ders15;

import java.util.Scanner;

public class whileUS {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.

        Scanner scan=new Scanner(System.in);

        boolean key=true;
        while(key)

        {
            System.out.println("enter the power: ");
            int power=scan.nextInt();
            System.out.println("enter the base: ");
            int base=scan.nextInt();

            int result =power_culculate(power,base);

            System.out.println("the result is:  "+result);

        }

    }

    public static int power_culculate(int pow,int base1)
    {

        int sonuc=1;

        for (int i = 0; i <pow ; i++) {

            sonuc *=base1;

        }

        return sonuc;



    }



}
