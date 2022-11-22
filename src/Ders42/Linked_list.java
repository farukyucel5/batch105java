package Ders42;

import java.util.LinkedList;
import java.util.List;

public class Linked_list {
    public static void main(String[] args) {

        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("k");
        ll1.add("t");
        //Linkedlist 3 tane interface'i implement etmiştir
        //list,queue ve Deque interface'leridir
        //bu 3 interface'deki tüm özellikleri override etmiştir.
        //hangisi data türü seçilirse onun özelliklerini alır ama data türü linkedlist olursa hepsinin özelliklerini
        //alır.

        List<String>ll2=new LinkedList<>();
        /*
        Daha önceden arrayList olustururken List<> interface'ini data türü olarak
        kullandıgımızdan bu sekılde olusturulan LinkedList'lerin ozellıklerını biliyoruz.
         */
        ll2.add("a");
        ll2.add("z");
        ll2.add(0,"b");
        ll2.addAll(2,ll1);
        ll2.set(3,"m");
        System.out.println(ll2.get(1));
        System.out.println(ll2);
        ll2.add("k");
        ll2.add("t");
        System.out.println(ll2.retainAll(ll1));//ll1 da olmayanları siler gerisini tutar.

        System.out.println(ll2);

        System.out.println(ll2.subList(2, 3));//2.indexten 3 e kadar olanları liste yapar 3 dahil değil.
    }
}
