package ders40_interface;

public class Concrete_child_of_two_classes implements Interface2,Interface3{

 /*
   1 Bir  class sadece bir class'a extends edilebilir
   ANCAK birden fazla interface'e implements edilebilir.

   2-Concrete child class implement ettigi tüm interface'lerdeki abstract methodları
   override etmek zorunda  olduğundan iki interface'deki tüm methodları override etmek gerekir.
   - İki interface'de aynı isimde ve aynı return type sahip method'lardan hangisini override ettiği
   önemli değildir.
   - ancak isimler aynı return type'lar farklı oldugundan  iki interface'i birden implement etmemiz
   mümkğn olmayacaktır
        *) ya chıld class'dan bu iki interface'i implement etmekten vazgecmelisiniz
        *) veya sisteme müdahale imkanınız varsa bu conlict(karısıklık)'ı çözmelisiniz.

    3- Chıld class'dan parent interface'lerdeki veriable'ları kullanmak istersek
       * AYNI İsimde iki interface'de de veriable varsa tercihinizi belirtmelisiniz.
       interfaceIsmi.veriableIsmi seklinde tercihinizi belirtmelisiniz
       Kullancagımız veriable sadece bir interface'de varsa
       sadece veriable ismini yazmak yeterli olacaktır.



    */

    public static void main(String[] args) {
        System.out.println(Interface3.MESAJ);
        System.out.println(Interface2.SAYI);
        System.out.println(SAYI2);
    }
    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
