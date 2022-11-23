package Ders43;

import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;

public class A_deque {
    public static void main(String[] args) {
        Deque<String> urunler=new LinkedList<>();

        urunler.add("nutella");
        urunler.add("gofret");
        urunler.add("cokoprens");
        //tüm ürünlerin basına "Y " ekleyin.

        System.out.println(urunler);

        ListIterator itr= (ListIterator) urunler.iterator();

        Deque<String>temporary_deque=new LinkedList<>();

        while (itr.hasNext()) {
            String str= (String) itr.next();
            String y="Y ";
            y+=str;
            temporary_deque.add(y);
        }

        urunler=temporary_deque;

        System.out.println(urunler);

    }
}
