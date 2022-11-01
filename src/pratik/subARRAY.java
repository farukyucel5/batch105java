package pratik;

import java.util.Arrays;
import java.util.Scanner;

public class subARRAY {
    public static void main(String[] args) {
        /*
        girilen en küçük ve en büyük değerler arasında ki dizi elementlerini  yazdır.
     */
        int[] array={2,4,3,5,6,7,8,9,1};
        Scanner object=new Scanner(System.in);
        System.out.println("pass in the min value: ");
        int min=object.nextInt();
        System.out.println("pass in the max value: ");
        int max=object.nextInt();

         Arrays.sort(array);
        if (Arrays.binarySearch(array,min)>=0 && Arrays.binarySearch(array,max)>=0)
        {
            for (int i = 0; i <array.length ; i++)
            {
                int min1=min;
                int max1=max;
                if (array[i]>=min1 && array[i]<=max1)
                {
                    System.out.print(array[i]);
                }

            }

        }

        else
        {
            System.out.println("out of range");
        }


    }

}
