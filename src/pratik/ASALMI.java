package pratik;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class ASALMI {

    public static void main(String[] args) {

        System.out.println("pass in an integer: ");
        Scanner scan=new Scanner(System.in);
        int integer = scan.nextInt();

        int bayrak=0;

        for(int i=2;i<=integer-1;i++)
        {
            if(integer % i == 0)
            {
                bayrak++;
                break;
            }

        }


        if (bayrak==0)
            System.out.println("ASALDIR");
        else
            System.out.println("asal değidir");
    }
}
