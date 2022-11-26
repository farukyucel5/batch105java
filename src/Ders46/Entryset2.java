package Ders46;

import Ders44.MapDepo;

import java.util.*;

public class Entryset2 {
    public static void main(String[] args) {
        // Ogrenci map'inde sirali olarak
        // tum ogrencilerin
        // bolum, sinif, sube, isim, soyisim ve numaralarini yazdirin

        Map<Integer,String> ogrenciMapi= MapDepo.ornekMapOlustur();
        ogrenciMapi.put(109,"Adem-Demir-11-D-Soz");

        // Soz, 11, D, Adem Demir, 109
        // Bu formatta String'ler olusturup bir treeSet'e atayan
        // ve bu set'i bize donduren bir Method olusturalim

        Set<String> siraliOgrenciListesi =siraliOgrenciListesiOlustur(ogrenciMapi);

        System.out.println(siraliOgrenciListesi);
        /*
        [
        MF, 10, H, Ali Can, 101,
        MF, 10, H, Ayse Can, 104,
        Soz, 10, K, Fatma Han, 106,
        Soz, 11, D, Adem Demir, 109,
        Soz, 11, M, Veli Cem, 102,
        TM, 11, H, Ali Cem, 103,
        TM, 11, M, Ayse Cem, 105
        ]
         */

    }

    public static Set<String> siraliOgrenciListesiOlustur(Map<Integer, String> ogrenciMapi) {

        Set<String> siraliOgrenciSeti=new TreeSet<>();

        // tum elementlerin key ve value'lerine birlikte ihtiyac oldugundan
        // Entry kullanmaliyiz

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMapi.entrySet();
        System.out.println(ogrenciEntrySeti);

        // Her bir entry'i elden gecirip
        // bilgileri istedigimiz formatta alalim
        String istenenBilgi;
        String value;
        String[] valueArr;
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
        ) {
            //  101=Ali-Can-10-H-MF   Entry
            // bolum, sinif, sube, isim, soyisim ve numaralarini yazdirin
            value=eachEntry.getValue();
            valueArr=value.split("-"); // [Ayse, Can, 10, H, MF]

            istenenBilgi= valueArr[4]+", " + valueArr[2]+", " + valueArr[3]+", " +
                    valueArr[0]+" " +valueArr[1]+", " + eachEntry.getKey();

            siraliOgrenciSeti.add(istenenBilgi);
            // Map'de herhangi bir degisiklik istenmediginden
            // arrayi yeniden birlestirip, entry.setValue() yapmamiza gerek yok
        }
        return siraliOgrenciSeti;
    }
}
