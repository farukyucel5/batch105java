package ders22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {

        /*
        Soru 6- Kullanicidan pozitif bir tamsayi alip,
        o tamsayiyi tam bolebilen tum pozitif tamsayilari bir liste olarak bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        System.out.println(tambolen(input));

    }

    public static List<Integer>tambolen(int input)
    {
        List<Integer> factor=new ArrayList<>();

        for (int i = 1; i < input; i++)
        {
            if (input%i==0)
            {
                factor.add(i);
            }

        }

        return factor;
    }
}
