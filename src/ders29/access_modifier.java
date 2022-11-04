package ders29;

public class access_modifier {
    String isim="ali";
    private static int sayı=10;
    public static void main(String[] args) {
        //access modifier görünmüyor o zamnan default access modifier vardır
        //bu clastan ve ders29 package'ı içerisindeki sınıflardan kullanılabilir
        //default int sayı=10 yanlış olur cte verir
        //private olanlara başka sınıftan ulaşılamaz.

        System.out.println(sayı);//10
   sayı=20;
        System.out.println(sayı);//20

    }
}
