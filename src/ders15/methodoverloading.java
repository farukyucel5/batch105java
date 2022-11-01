package ders15;

public class methodoverloading {

    public static void main(String[] args) {

        carpım(3,4);
        carpım(3.4,8);

    }

    public static void carpım(int sayı1,int sayı2)
    {
        System.out.println("iki integerin çarpımı: "+ sayı1*sayı2);
    }


    public static void carpım(int sayı1,int sayı2,int sayı3)
    {
        System.out.println("üç integerin çarpımı: "+ sayı1*sayı2*sayı3);
    }

    public static void carpım(double sayı1,int sayı2)
    {
        System.out.println("bir double ve bir integerin çarpımı: "+ sayı1*sayı2);
    }

    public static void carpım(int sayı1,double sayı2)
    {
        System.out.println("bir integer ve bir double çarpımı: "+ sayı1*sayı2);
    }

}
