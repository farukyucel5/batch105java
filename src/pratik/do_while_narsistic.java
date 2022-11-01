package pratik;

import java.util.Scanner;

public class do_while_narsistic {

    public static void main(String[] args) {
       /*
       Girilen bir sayının narsistik sayı olup olmadığını kontrol eden program yazın.
       Armstrong sayı olarak da bilinen Narsistik sayı, n haneli bir sayının
       tüm basamaklarının n'nci kuvvetlerinin toplamı,
       sayının kendisine eşit olur. İşte bu sayılara ise narsistik sayılar denmektedir.

     örnek olarak,
        153=1+125+27
        370=27+343+0
        9474=6561 + 256 + 2401 + 256
        */
        Scanner scan=new Scanner(System.in);//scan nesnesi oluşturultu


        int number,number1;//aşağıda yerel değişken olarak kullanacağım iki değisken tanımladım
        int narsistic=0;
        do {
            System.out.println("please enter a number");
            number=scan.nextInt();

            String strnumb=""+number;/*
            girilen sayıyının basamak sayısını aşağıda bulabilmek için sayıyı stringe çevirdim.*/

            int units_digit;//basamak diye değişken tanımladım.
            number1=number;/*
            number değişkenini number1'a atadım ki for döngüsünün içindeki işlem bitince number değişmemiş
            olsun.*/
            int len=strnumb.length();//sayının basamak sayısını buldum.

            for (int i = 0; i <len; i++) {
                units_digit=number1 % 10;
                units_digit=power(len,units_digit); //döngünün içinde narsistik sayı olup olmadiğini kontrol ettim
                narsistic=units_digit+narsistic;
                number1/=10;
                /*döngünün içinde, girilen sayının herhangi bir kuvvetini hesaplayan
                power adında method  oluşturuldu.
                */
            }

            if (narsistic!=number)
            {
                System.out.println("try again");
                narsistic=0;

            }

        }while (narsistic!=number);


        System.out.println("it is a perfectly narsistic number!! ");

    }

    public static int power(int pow,int base)
    {
        int sonuc=1;
        for (int i = 0; i <pow ; i++) {

            sonuc*=base;

        }
        return sonuc;
    }
}
