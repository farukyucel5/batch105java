package ders31;

public class Csuv extends Binek_arac{

    public static void main(String[] args) {
        Csuv suv1=new Csuv();
        System.out.println(suv1.marka);
        System.out.println(suv1.model);
        System.out.println(suv1.motor);
        System.out.println(suv1.plaka);
        System.out.println(suv1.yakıt);
        System.out.println(suv1.yil);
        suv1.hız(suv1.yakıt);
        suv1.teker();

        Csuv suv2=new Csuv();
        suv2.marka="toyota";
        suv2.model="hrv";
        suv2.motor="1.6";
        suv2.plaka="06 ank 006";
        suv2.yakıt="benzin";
        suv2.yil=2012;
        suv2.hız(suv2.yakıt);
    }

    public void hız(String yakıt)
    {
        if (yakıt.equalsIgnoreCase("benzin"))
            System.out.println("benzinli SUV'lar 240 km hız yapar");
        else if (yakıt.equalsIgnoreCase("dizel"))
            System.out.println("dizel ise SUV'LAR 200 km hız yapar");
        else if (yakıt.equalsIgnoreCase("hibrit"))
            System.out.println("hibrit SUV'LAR 220 km hız yapar");
        else
            System.out.println("yakıt belli değil hız söyleyemem");
    }
}
