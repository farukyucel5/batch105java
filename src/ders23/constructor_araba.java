package ders23;

public class constructor_araba {
    // bir proje olusturulurken tum classlarda main method olmasina gerek yoktur
    // cogu class obje olusturularak kullanilmak uzere hazirlanmis depolardir
    // Biz de bu class'i araba objeleri icin bir depo olarak dizayn edelim

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;


    public int maxHiz(String yakit) {
        int maxHiz = 120;

        if (yakit.equalsIgnoreCase("dizel")) {
            maxHiz = 200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz = 230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz = 180;
        }
        return maxHiz;

    }

    @Override
    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }
}