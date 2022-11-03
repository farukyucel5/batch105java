package ders28;

public class varargs2 {
    public static void main(String[] args) {
        topla(1,3);
        topla(1,3,4);
        topla(1,2,3,4,5,6);

        /*
        bir method'da parametre sayısını sınırlandırmak istemezsek standart bir variable yerine
         varargs kullanırız.
         int...=sayısı belli olmayan int parametreler olan bir dizi'dir.

         */
    }

    public static void topla(int... sayılar)
    {
      int sum=0;
        for (int each:sayılar)
        {
            sum+=each;
        }

        System.out.println(sum);
    }
}
