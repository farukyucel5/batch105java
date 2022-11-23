package Ders43;

import java.util.Deque;
import java.util.LinkedList;

public class A_deque2 {
    public static void main(String[] args) {
        Deque<String> urunler = new LinkedList<>();
        urunler.add("Nutella");
        urunler.add("Cikolatali Gofret");
        urunler.add("Cokoprens");
        // Tum urunlerin basina "Y " ekleyelim
        String eleman="";
        Deque geciciDeque= new LinkedList();


        while(eleman!=null){
            eleman= urunler.poll();
            if (eleman!=null){
                eleman= "Y " + eleman;
                geciciDeque.add(eleman);
            }
        }
        urunler=geciciDeque;
        System.out.println(urunler);
    }
}
