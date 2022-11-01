package pratik;

import java.util.Arrays;
import java.util.Scanner;

public class foreach_cumle_al {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter in a sentence: ");
        String sentence=scan.nextLine();
        System.out.println("please pass in a word: ");
        String letter=scan.next();
        String[] arr=sentence.split("");

        System.out.println(Arrays.toString(arr));
       int count=0;
       for (String each:arr
             ) {

            if (each.equals(letter))
            {
                count++;
            }
       }


       if (count>0)
       {
           System.out.println("Girdiğiniz kelime cümlede "+ count+" defa kullanılmıştır");
       }
       else
       {
           System.out.println("bu harf cümlede kullanılmamıştır!!");
       }


    }
}
