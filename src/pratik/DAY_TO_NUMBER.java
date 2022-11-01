package pratik;

import java.util.Scanner;

public class DAY_TO_NUMBER {

    public static void main(String[] args) {

        /*
          Write a Java program that keeps a number from the user and generates an integer between 1 and 7
          and displays the name of the weekday.
       */

        Scanner object=new Scanner(System.in);
        System.out.println("please enter a number between 1 and 7");

        int number=object.nextInt();

        switch ( number)
        {
            case 1:
                System.out.println("Today is monday");
                break;

            case 2:
                System.out.println("Today is tuesday");
                break;

            case 3:
                System.out.println("Today is wednesday");
                  break;

            case 4:
                System.out.println("Today is thursday");
                 break;
            case 5:
                System.out.println("Today is friday");
                break;
            case 6:
                System.out.println("Today is saturday");
                 break;
            case 7:
                System.out.println("Today is sunday");
                break;

            default:
                System.out.println("out of range!!");
        }



    }
}
