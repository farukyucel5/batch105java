package pratik;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("please enter a count value");
        Scanner scan = new Scanner(System.in);
        int count =scan.nextInt();


        fibonacci(count);
    }

    public static void fibonacci(int number)
    {

        int n1=0,n2=1,n3;
        System.out.print(n1 + " "+ n2);

        for (int i = 0; i < number; i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }

    }


}
