package ders36;

public class class_cast_exception {
    public static void main(String[] args) {
        short sayı1=24;
        //Integer sayı2=sayı1; integer ve short arasında parent child iliskisi olmadıgından birbirine atama
        //yapamazsınız.


        //aralarında parent child iliskisi var olanlar için
        //auto widening veya explicit-narrowing yapılabilir.

        Object obj=sayı1;

        System.out.println("shorttan objeye cast edince "+obj);

        Integer sayı3=(Integer) obj;

        System.out.println("short veriyi obje üzerinden integere cevirince"+sayı3);
        //ClassCastException olur


    }
}
