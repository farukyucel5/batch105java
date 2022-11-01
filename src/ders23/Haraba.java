package ders23;

public class Haraba {
    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;


    public Haraba(String mrk,String mdl,String ykt,int yl,int fyt)
    {
        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;

    }

    public Haraba(String mrk,String mdl,int yl)
    {
        //istersek parametreleri azaltarak da constructor oluşturabiliriz.
        marka=mrk;
        model=mdl;
        yil=yl;
    }
    public Haraba()
    {
        //İÇİNE KOD YAZILABİLİR.
        //DEFAULT CONSTRUCTORLA AYNI İŞLEVİ GÖRÜR FAKAT DEFAULT CONSTRUCTOR DEĞİLDİR.
    }
//herhangi bir constructor oluşturulursa java default constructoru sile
// bu durumda  sınıfa parametresiz bir constructor oluşturmamız gerekir
//

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
