package pratik;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {


        System.out.println("Please enter A word or a sentence: ");

        Scanner scan=new Scanner(System.in);

        String statement_entered=scan.nextLine();

        palindrome(statement_entered);

    }


    public  static void palindrome(String statement)
    {

        String inverseString="";

        for (int i =statement.length()-1 ; i>=0; i--)
        {
            inverseString=inverseString+statement.charAt(i);

        }

        if (statement.equals(inverseString))
        {
            System.out.println(statement+" is a palindrome statement ");
        }
        else
        {
            System.out.println("NOT A PALINDROME ");

        }

    }
}
