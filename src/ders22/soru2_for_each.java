package ders22;

import java.util.ArrayList;
import java.util.List;

public class soru2_for_each {

    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
 - Kelimenin uzunlugu cift sayi ise ilk yarisini
 - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
 yeni bir listeye ekleyip yazdirin.
         */


        String[] arr={"faruk","mehmet","olmaz","yılmaz","ekrem"};

        List<String> checklist=new ArrayList<>();

        for (String each:
                arr)
        {

            if (each.length()%2==0)
            {
                checklist.add(each.substring(0,each.length()/2));
            }
            else
            {
               checklist.add(each.substring(each.length()/2));
            }

        }

        System.out.println(checklist);
    }
}
