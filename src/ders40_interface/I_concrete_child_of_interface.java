package ders40_interface;

public class I_concrete_child_of_interface implements Interface1 {
    //bir sınıfı bir arayüzün çocuğu yapmak için implements anahtar kelimesi kullanılır.
    public static void main(String[] args) {
        System.out.println(MESAJ);
       // sayı2=40; değisiklik yapamazsın çünkü default olarak final'dir.

        System.out.println(Integer.MAX_VALUE);
        //normalde değişken isimleri küçük harfle baslar camelcase yapılır
        //ancak static ve final olarak işaretlenen değişkenler tamamen büyük harfle başlar ORTAK KABUL OLARAK..
        System.out.println(Math.PI);
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
