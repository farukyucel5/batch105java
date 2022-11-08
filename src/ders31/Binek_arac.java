package ders31;

public class Binek_arac extends Arac{
    protected String marka="Binek aracların markası vardır";
    protected String model="Binek arcların modeli olur";
    protected int yil=1900;

    protected void hız(String yakıt)
    {
        System.out.println("binek aracların hızı modele göre degisir");
    }

    protected void teker()
    {
        System.out.println("binek aracların dört tekeri olur");
    }
}
