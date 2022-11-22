package Ders42;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //Soru : Kullanicidan deger alarak iki String liste olusturun. Kullanici deger girmeyi birakmak icin 0’a basmalidir.
        // Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        // liste1 : …….
        // liste2 : …….
        // ortak elementler : …….
        System.out.println("Önce List1'i oluşturalım");
        List<String> list1 = kullanicidanAlarakListOlustur();
        System.out.println("Şimdi ikinci listeyi oluşturalım");
        List<String> list2 = kullanicidanAlarakListOlustur();
        System.out.println("Liste1 : " + list1);
        System.out.println("Liste2 : " + list2);
        list1.retainAll(list2);
        System.out.println("Ortak elemanlar : " + list1);

    }

    public static List<String> kullanicidanAlarakListOlustur() {
        List<String> isimListesi = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String isim = "";

        while (!isim.equalsIgnoreCase("0")) {

            System.out.println("Listeye eklemek için isim giriniz \nBitirmek için 0'a basınız ");
            isim = scan.nextLine();
            if (!isim.equalsIgnoreCase("0")) {
                isimListesi.add(isim);

            }
        }
        return isimListesi;
    }
}