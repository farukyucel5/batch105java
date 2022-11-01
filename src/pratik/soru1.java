package pratik;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

        System.out.println("how many cups of tea do you drink in a day");
        Scanner scan=new Scanner(System.in);
        int dailyTea= scan.nextInt();
        System.out.println("Cubes of sugar per cup");
        Scanner scan1=new Scanner(System.in);
        int sugarPerCup= scan1.nextInt();

        double sugarperyear=dailyTea*sugarPerCup*2.7*365;
        double fortyyears_consumptions=40*sugarperyear;

        System.out.println("sugar consumption per year: " + sugarperyear);
        System.out.println("sugar consumption per 40 years "+ fortyyears_consumptions);

    }
}
