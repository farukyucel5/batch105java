package pratik;

import java.util.Arrays;
import java.util.Scanner;

public class Array_add_element {

    public static void main(String[] args)
    {
        int[] A={1,2,3,7,2,6,0};
        System.out.println("please enter the number you'd like to add to the array: ");
        Scanner scan= new  Scanner(System.in);
        int num=scan.nextInt();

        int[] new_A=add_value(A,num);

        System.out.println(Arrays.toString(new_A));



    }

    public static int[] add_value(int[] A,int num)
    {
        int[] A1= new int[A.length+1];

        for (int i = 0; i < A.length; i++)
        {

           A1[i]=A[i];


        }

        A1[A1.length-1]=num;

        return A1;



    }
}
