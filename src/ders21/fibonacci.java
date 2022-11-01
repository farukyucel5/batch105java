package ders21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("please enter a count value");
        Scanner scan = new Scanner(System.in);
        int count =scan.nextInt();


      if(count<0)
      {
          System.out.println("0 dan büyük sayı girin:");
      }else if (count==0){

          System.out.println("0'dan küçük fibonacci sayısı yoktur.");
      }else if (count==1){
          System.out.println("1 den küçük tek fibonacci sayısı vardır '0' ");
      }else
      {
          fibonaccicreator(count);
      }
    }

    private static void fibonaccicreator(int count)
    {
       //girilen değerden küçük fibonacci sayılarını bulan kodu yazın.
        List<Integer> fibonacci=new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);
        fibonacci.add(1);
          int newfibonacci=0;
          int index=3;//ilk üç eleman 011 olduğu için 3ten baslıyorz

        while (newfibonacci<count)
        {
            newfibonacci=fibonacci.get(index-2)+fibonacci.get(index-1);
            if (newfibonacci<count)
            {
                fibonacci.add(newfibonacci);


            }
            index++;
        }

        System.out.println(fibonacci);

    }


}
