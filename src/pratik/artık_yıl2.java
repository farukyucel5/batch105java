package pratik;

import java.time.Year;
import java.util.Scanner;

public class artık_yıl2 {
    public static void main(String[] args) {

        /*Girilen yılın artık yıl olup olmadığını bulan ve eğer artık yıl değilse
         bir sonraki artık yılı bulana kadar devam eden  program yazın.

         */

        /*
    Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

    1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048 vb.
    Ancak bu kuralın iki istisnası vardır:

    1. 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

    Örneğin 1600 ve 2000 yılları artık yıldır ancak 1800 ve 1900 artık yıl değildir.
    Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni,
    bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
         */
        Scanner object = new Scanner(System.in);
        int flag=0;
        int year;

        do {
            System.out.println("please enter a year: ");
            year=object.nextInt();
            //if(year%4==0 && (year%100!=0 || year%400==0))
            if((year<100 && year%4==0)||(year>=100 && year%100==0 && year%400==0)||
                    (year>100 && year%4==0 &&year%100 !=0))
            {
                System.out.println("The year you've just passed in is a leap year");
                flag++;
            }
                //1. ve 2. if de kullanılan algoritmalar aynı kontrolü yapar sadece farklı yazılmıştır
            else
            {
                System.out.println("That's not a leap year!");
                for (int i = 0; i < 4 ; i++) {


                    year += 1;
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)) {
                        System.out.println("The first leap year after this year: " + year);
                    }
                }
            }



        }while (flag==0);





    }
}
