package pratik;

import java.util.Scanner;

public class max_number {
    public static void main(String[] args) {

        Scanner object=new Scanner(System.in);
        System.out.println("Please enter in three numbers: ");

        double number1=object.nextDouble();
        double number2=object.nextDouble();
        double number3=object.nextDouble();

        double max=0;



            if (number1>=number2 && number1>=number3)
                max=number1;

            else if (number2>=number1 && number2>=number3)
                max=number2;

            else max=number3;


        System.out.println("The greatest one is "+max);
    }
}
