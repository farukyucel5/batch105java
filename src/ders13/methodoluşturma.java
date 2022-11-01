package ders13;

import java.util.Scanner;

public class methodoluşturma {
    public static void main(String[] args) {


        summation();



    }


    public static void summation()
    {
        Scanner scan=new Scanner(System.in);
        double num1=scan.nextDouble();

        Scanner scan1=new Scanner(System.in);
        double num2=scan1.nextDouble();

        System.out.println(num1+num2);
    }
}

