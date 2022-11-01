package ders14;

import java.util.Scanner;

public class methodcreation {

    public static void main(String[] args) {
        System.out.println("enter first number: ");
        Scanner s1=new Scanner(System.in);
        double sayı=s1.nextDouble();

        System.out.println("enter second number: ");
        Scanner s2=new Scanner(System.in);
        double sayı1=s2.nextDouble();

       double result =multiply(sayı,sayı1);
        System.out.println("çarpım sonucu: "+result);

    }

    public static double multiply(double a,double b)
    {

        return a*b;
    }


}
