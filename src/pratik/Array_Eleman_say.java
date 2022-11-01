package pratik;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Eleman_say {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the length of array:");
        int length = scan.nextInt();

        System.out.println("please enter " + length + " numbers for the array");

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();

        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < length; i++)
        {
            int count =0;

            for (int j = 0; j < length; j++)
            {
                if(array[i]==array[j])
                {
                    count++;
                }

            }

            if (i==0 && array[i+1]==array[i])
            {
                System.out.println(array[i]+" dizide "+count+" adet var");
            }

            if (i==0 && array[i+1]!=array[i])
            {
                System.out.println(array[i]+" dizide "+count+" adet var");
            }

           /* dizideki elemanlar küçükten
            büyüğe sıralandığından kendinden
            bir önceki eleman ya aynıdır ya
            farklıdır eğer aynı ise bu elemanı tekrar sayma.*/


            if (i != 0 && array[i-1] != array[i])
            {
                System.out.println(array[i]+" dizide"+count+" adet var");
            }




        }

    }

}
