package ders2;

import java.util.Scanner;

public class swapNumberPassedin {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("first one: ");
        double firstNumber=scan.nextDouble();
        System.out.println("second one: ");
        double secondNumber=scan.nextDouble();

        double SubstituteNumber;

        SubstituteNumber=firstNumber;
        firstNumber= secondNumber;
        secondNumber=SubstituteNumber;

        System.out.println("birinci sayı: "+ firstNumber + "\nikinci sayı: "+ secondNumber);

    }
}
