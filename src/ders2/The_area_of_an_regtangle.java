package ders2;

import java.util.Scanner;

public class The_area_of_an_regtangle {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Kısa kenarı girin: ");
        double kısaKenar=scan.nextDouble();
        System.out.println("uzun kenarı girin: ");

        double uzunKenar=scan.nextDouble();

        double alan =uzunKenar*kısaKenar;

        System.out.println("dikdörtgenin alanı: "+ alan);


    }


}
