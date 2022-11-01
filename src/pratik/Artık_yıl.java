package pratik;

import java.util.Scanner;

public class Artık_yıl {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int flag=0;

        do {
            System.out.println("please enter a year: ");
            int year=object.nextInt();
            if(year%4==0 && (year%100!=0 || year%400==0))
            {
                System.out.println("The year you've just passed in is a leap year");
                flag++;
            }
            else
            {
                System.out.println("That's not a leap year");
            }


        }while (flag==0);

    }
}
