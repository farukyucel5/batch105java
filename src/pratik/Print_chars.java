package pratik;

import java.util.Scanner;

public class Print_chars {
    public static void main(String[] args) {

        /*
        Write a Java method to print characters between two characters (i.e. A to P ).
        Note: Prints 20 characters per line
         */
        Scanner object=new Scanner(System.in);
        System.out.println("please pass in two chars: ");

        char ch1=object.next().charAt(0);
        char ch2=object.next().charAt(0);

        print_char(ch1,ch2,20);

    }

    public static void print_char(char c1,char c2,int period)
    {
        int flag=0;
        if (c1<c2)
        {
            for (int i = c1; i <=c2 ; i++)
            {

                System.out.print((char)i);
                flag++;
                if (flag%20==0)
                {
                    System.out.println();
                }

            }
        }
        else
        {
            for (int i = c2; i <=c1 ; i++)
            {

                System.out.print((char)i);
                flag++;
                if (flag%20==0)
                {
                    System.out.println();
                }

            }

        }



    }

}
