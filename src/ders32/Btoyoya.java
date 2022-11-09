package ders32;

public class Btoyoya  extends Araba {

    Btoyoya()
    {
        System.out.println("parametresiz toyota const");
    }

    Btoyoya(int pt)
    {
        System.out.println("parametreli toyota constructor");
    }

    Btoyoya(String pt2)
    {
        super("mehmet");
        System.out.println("string parametreli toyota");
    }

}
