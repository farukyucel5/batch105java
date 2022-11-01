package ders24;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        System.out.println(arb1);


        Araba arb2 =new Araba("volvo","CX60");
        System.out.println(arb2);

        Araba arb3=new Araba("hyundai","i10",10000);

        System.out.println(arb3);

        Araba arb4=new Araba("porche","cayan","benzin",1990,12000);
        System.out.println(arb4);
    }
}
