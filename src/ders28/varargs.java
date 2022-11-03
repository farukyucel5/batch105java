package ders28;

public class varargs {
    public static void main(String[] args) {
        topla(1,3);
        //topla(1,3,4);

        //parametre sayısı değiştikçe bizden yeni method oluşturmamızı ister.
    }

    public static void topla(int sayı1, int sayı2)
    {
        System.out.println("2 sayının toplamı: "+(sayı1+sayı2));
    }
}
