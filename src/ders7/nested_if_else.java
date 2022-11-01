package ders7;

import java.util.Scanner;

public class nested_if_else {

    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
        System.out.println("plese enter your heigth: ");
        double height=scan.nextDouble();
        System.out.println("now please pass in your weight: ");
        double weight=scan.nextDouble();

        double BodyMassIndex = weight/(height*height);

        System.out.println("Your body mass index is " + BodyMassIndex);

        if (BodyMassIndex > 30 )
        {
            System.out.println("Obess");
        } else if (BodyMassIndex>25) {

            System.out.println("KİLOLU");

        } else if (BodyMassIndex>20) {

            System.out.println("normal");

        } else if (BodyMassIndex>0) {
            System.out.println("zayıf");

        }else {
            System.out.println("yanlış giriş");

        }
    }
}
