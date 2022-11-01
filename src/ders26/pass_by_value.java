package ders26;

public class pass_by_value {
    public static void main(String[] args) {

        double fiyat=100;
        System.out.println(indirim(fiyat));//90
        System.out.println(indirim(fiyat));//90
        System.out.println(indirim(fiyat));//90
        System.out.println(indirim(fiyat));//90

        System.out.println(fiyat);//100
        fiyat=indirim(fiyat);

        System.out.println(fiyat);


    }


    private static double indirim(double ahmet)
    {
        ahmet=ahmet*0.9;
        return ahmet;
    }
}
