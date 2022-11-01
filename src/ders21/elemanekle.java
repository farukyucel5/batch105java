package ders21;

import java.util.ArrayList;
import java.util.List;

public class elemanekle {

    public static void main(String[] args) {
        List<String> harfler= new ArrayList<>();

        //TÜM SESLİ HARFLERİ EKLE;

        String [] arr={"a","e","i","o","u"};

        for (int i = 0; i < arr.length; i++)
        {
            harfler.add(arr[i]);

        }
        System.out.println(harfler);


        System.out.println(harfler.size());//liste boyutu bulma

        System.out.println(harfler.isEmpty());//listenin boş olup olmadığını döndürür true yada false

    }

}
