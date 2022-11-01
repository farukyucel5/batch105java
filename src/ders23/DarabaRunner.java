package ders23;

public class DarabaRunner
{
    public static void main(String[] args) {
        constructor_araba arb1=new constructor_araba();


        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);//null
        System.out.println(arb1.yil);//0
        System.out.println(arb1.fiyat);//0

        arb1.marka="tofas";
        arb1.model="kartal";
        arb1.yakit="benzin";
        arb1.fiyat=50000;
        arb1.yil=1991;
        arb1.maxHiz(arb1.yakit);

        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);//null
        System.out.println(arb1.yil);//0
        System.out.println(arb1.fiyat);//0
        System.out.println(arb1.maxHiz(arb1.yakit));


        constructor_araba arb2=new constructor_araba();
        System.out.println(arb2);//default değerler gelir
        System.out.println(arb1);//atadığımız değerler gelir.


    }
}
