package pratik;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
/*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u

        Scanner scan = new Scanner(System.in);
        System.out.println("Please pass in the visaGrade required: ");
        double visaGrade = scan.nextDouble();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please pass in the finalGrade required: ");
        double finalGrade = scan.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please pass in the attendanceGrade required: ");
        double attendanceGrade = scan.nextDouble();

        double averageGrade = visaGrade * 0.1 + finalGrade * 0.8 + attendanceGrade * 0.1;
        System.out.println(averageGrade);

        if (averageGrade >= 70) {
            System.out.println("you passed succusfully");
        } else if (averageGrade>=60) {
            System.out.println("you pasedd it conditionaly");
        }
        else
        {

            System.out.println("you failed!!");
        }
    }

}