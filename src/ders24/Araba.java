package ders24;

public class Araba {



    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public Araba()
    {

    }

    public Araba(String mrk,String mdl)
    {
        marka=mrk;
        model=mdl;


    }

    public Araba(String model,String marka,int fiyat)
    {
        this.model=model;
        this.marka=marka;
        this.fiyat = fiyat;
    }

    public Araba(String marka, String model, String yakit, int yil, int fiyat)
    {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }


    @Override
    public String toString()
    {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }
    public static void main(String[] args) {


    }

}
