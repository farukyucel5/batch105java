package ders23;

public class Haraba_runner {
    public static void main(String[] args) {

        Haraba arb1=new Haraba();

        arb1.marka="toyota";
        arb1.model="corolla";
        arb1.yakit="dizel";
        arb1.yil=2010;
        arb1.fiyat=12000;
        System.out.println(arb1);

        Haraba arb2=new Haraba("HONDA","civic","benzin",2011,11800);
        System.out.println(arb2);
        Haraba arb3=new Haraba("opel","corsa","dizel",2013,10000);
        System.out.println(arb3);

        Haraba arb4=new Haraba("tesla","x",2020);
        System.out.println(arb4);
    }
}
