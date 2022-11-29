package Ders47;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps_methods {

    public static void main(String[] args) {
        Map<String,Integer> mp1=new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        System.out.println(mp1.putIfAbsent("A", 5));// eklemez çünkü var ve hali hazırda mevcut olan değeri döner.
        // Key yok ise value'su ile beraber ekler ve yazdırırsak null döner
        // var ise eklemez yazdırırsanız mevcut değeri döner.

        System.out.println(mp1.putIfAbsent("D",4));//mevcut değil ekler ve null döner.
        System.out.println(mp1);//{A=5, B=3, C=7, D=4}

        List<Integer> liste=new ArrayList<>();
    }



}
