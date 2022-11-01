package pratik;

import java.util.Scanner;

public class FLOTİNG_NUMBERS {

    public static void main(String[] args) {

        /*
         Write a Java program that accepts two floating-point numbers
         and checks whether they are the same up to two decimal places
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two number: ");

        double number1=scan.nextDouble();
        double number2=scan.nextDouble();

        double difference=number1-number2;


       if ((difference<0.01 && difference>0) || (difference>(-0.01) && difference<0))
           System.out.println("The difference " + "is "+ difference +"so " +"These two numbers are the same!");


       else
           System.out.println("They are different from each other because the difference is "+difference);

    }

}
