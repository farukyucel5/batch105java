package ders33;

import pratik.A;

public class Ccorolla extends Btoyota{
    String model="Corolla";
    String uretimYeri="Türkiye";
    int yıl=2023;

    public static void main(String[] args) {
        /*
        bir obje olusturulurken data türü ve constructor aynı sınıftan ise bir değişkenin değerini
        bulmak için o sınıfa gideriz o sınıfta yoksa sırası ile parent sınıflara bakılır ilk bulunan kullanılır.

         */
        Ccorolla corolla1=new Ccorolla();
        System.out.println(corolla1.model);//corolla
        System.out.println(corolla1.uretimYeri);//corolla
        System.out.println(corolla1.yil);//corolla
        System.out.println(corolla1.marka);//Btoyota
        System.out.println(corolla1.motor);//Araba
        System.out.println(corolla1.plaka);//Araba
        System.out.println(corolla1.yakit);//Btoyota

        Btoyota corolla2=new Ccorolla();
        /*
        Data türü ve constructor farklı ise değiskenin değerini bulmak için data türü
        olan sınıfa gidilir varsa kullanılır yoksa o sınıfın paretlarına bakılır bulunamazsa
        cte verir.

         */
        System.out.println(corolla2.model);//Btoyota
        //System.out.println(corolla2.uretimYeri);//cte verir cunku o sınıfta ve parentlarında uretim yeri yok
        System.out.println(corolla2.yil);//Btoyota
        System.out.println(corolla2.marka);//Btoyota
        System.out.println(corolla2.motor);//Araba
        System.out.println(corolla2.plaka);//Araba
        System.out.println(corolla2.yakit);//Btoyota


        Araba corolla3=new Ccorolla();

        //System.out.println(corolla3.model);//cte
        //System.out.println(corolla3.uretimYeri);//cte
        //System.out.println(corolla3.yil);//cte
        //System.out.println(corolla3.marka);//cte
        System.out.println(corolla3.motor);//Araba
        System.out.println(corolla3.plaka);//Araba
        System.out.println(corolla3.yakit);//Araba

        Btoyota toyota1=new Btoyota();

        System.out.println(toyota1.marka);//Btoyota
        System.out.println(toyota1.model);//Btoyota
        System.out.println(toyota1.motor);//Araba
        System.out.println(toyota1.plaka);//Araba
        System.out.println(toyota1.yil);//Btoyota
        System.out.println(toyota1.yakit);//Btoyota

        Araba toyota2=new Btoyota();
        //System.out.println(toyota2.marka);//cte
        //System.out.println(toyota2.model);//cte
        System.out.println(toyota2.motor);//Araba
        System.out.println(toyota2.plaka);//Araba
        //System.out.println(toyota2.yil);//cte
        System.out.println(toyota2.yakit);//Araba

        Araba araba=new Araba();
        System.out.println(araba.motor);//Araba
        System.out.println(araba.plaka);//Araba
        System.out.println(araba.yakit);//Araba


    }
}
