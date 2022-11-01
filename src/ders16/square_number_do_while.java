package ders16;

import java.util.Scanner;

public class square_number_do_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number: ");
        int number = scan.nextInt();
        int kontrol = 1;
        int flag=0;

        do {


            if (kontrol*kontrol == number) {
                System.out.println(true);
                flag++;
                break;
            }

            kontrol++;
        }while (kontrol*kontrol<=number);


        if (flag!=1)
        {
            System.out.println(false);
        }



    }
}
