package ders31;

public class Gcorolla extends Ftoyota {

    String model="corolla";
    String uretim_yeri="Turkiye";
    Gcorolla()
    {
        super();//parent sınıftaki parametresiz contructor'a git demek,bunu biz eklemesek bile java ekler.
        System.out.println("corolla constructor calıstı");
    }
    public static void main(String[] args) {
        Gcorolla corolla1=new Gcorolla();
        System.out.println(corolla1.marka);//toyota yazar

        /*
        Bir child sınıfdan nesne olusturduğumuzda olusturulan nesne sadece child
         sınıfın özelliği değil tüm atanın özelliklerini tasır
         tasıması içinde tüm parent claslardaki constructorlar calısır.

         */

    }
}
