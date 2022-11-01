package pratik;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

       /* Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        dort islemden biri ile isleme koyup sonucunu yazdiriniz*/


       // The code blog in which we get numbers from the user.
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number1: ");
        double number1=scan.nextDouble();
        Scanner scan1=new Scanner(System.in);
        System.out.println("please enter the number2: ");
        double number2=scan.nextDouble();

        // operator section

        Scanner scan2=new Scanner(System.in);
        System.out.println("please enter in the type of operator: ");
        String operator=scan2.next();


        switch (operator) {
            case "summation":

                System.out.println("sum of the numbers you've just passed in is: " + (number1 + number2));
                break;
            case "subtraction":

                System.out.println("if we take number2 out of the number2,we get: " + (number1 - number2));
                break;
            case "multiplying":
                System.out.println("number1 times number2 is : " + (number1 * number2));

                break;
            case "division":
                System.out.println("number1 over number2 is : " + (number1 / number2));

                break;
            default:
                System.out.println("wrong spelling");
                break;
        }


    }
}
