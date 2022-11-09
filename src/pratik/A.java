package pratik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A {
    /*
        Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
kismini list olarak bize donduren bir method olusturun
         */
   /*
        Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
kismini list olarak bize donduren bir method olusturun
         */
      public static void main(String[] args) {
        List<String> liste=new ArrayList<>();
        liste.add("ali");
        liste.add("veli");
        liste.add("deli");
        liste.add("yeli");
        String istenmeyenHarf="e";
        System.out.println(liste);
        System.out.println(liste.size());
        System.out.println(temizlenmisListe(liste,istenmeyenHarf));
    }

    public static List<String> temizlenmisListe (List<String> liste, String harf)
    {
        List<String> newlist=new ArrayList<>();

        for (int i = 0; i < liste.size(); i++)
        {
            if (!liste.get(i).contains(harf)) //harfi içermeyen isimleri ayrı bir listeye atıp
            {                                 // o listeyi döndürmeniz lazım
                newlist.add(liste.get(i));    //aksi takdirde ufak bir mantık hatası ortaya çıkıyor
            }
        }

        return newlist;
    }

}
