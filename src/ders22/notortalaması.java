package ders22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class notortalaması {

    public static void main(String[] args) {

        //// Ogretmenden ogrenci notlarini alip bir list olusturun
        //// ogretmen 100 den büyük bir sayı'ya basip bitirdiginde
        //// sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin
        List<Double> notlar=listeOlustur();
        System.out.println(notlar);

        raparla(notlar);

    }

    private static void raparla(List<Double> notlar)
    {
        int thenumber_of_student=notlar.size();
        double sumofgrades=0.0;
        double average=0.0;
        int theofstudentwhopassed=0;

        for (int i = 0; i < notlar.size(); i++)
        {
            sumofgrades+=notlar.get(i);

        }

        average=sumofgrades/thenumber_of_student;

        for (int i = 0; i < notlar.size(); i++)
        {
            if (notlar.get(i)>average)
            {
                theofstudentwhopassed++;
            }

        }

        System.out.println("girilen not sayısı: "+ thenumber_of_student+
                "\ngirilen notların ortalaması: "+ average+
                "\nortalamanın üzerindekiler : "+theofstudentwhopassed);
    }

    public static List<Double> listeOlustur()
    {
        List<Double> notlar = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        Double girilenNot =5.0;

        while (girilenNot<=100)
        {
            System.out.println("Lutfen listeye eklemek icin NOT giriniz" +
                    "\nBitirmek icin 100 den büyük sayıya basin");
            girilenNot = scan.nextDouble();

            if (girilenNot<=100) {
                notlar.add(girilenNot);
            }
        }
        return notlar;
    }
}
