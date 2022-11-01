package ders19;

import java.util.Arrays;

public class string_split {

    public static void main(String[] args) {

        String str="java gerçekten cok cok guzel";
        //verilen stringte kaç e harfi var bulunuz.
        String[] allchars=str.split("");//verilen stringi girilen chara göre ayırır ve dizi döndürür.
        //mesela burada biz "" göre yani hiçliğe göre yaptık tüm elemanları tek tek yazdırdı dizi içinde.
          // [j, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l]
        System.out.println(Arrays.toString(allchars));
        int count=0;

        for (int i = 0; i <allchars.length ; i++) {

            if (allchars[i].equals("e"))
            {
                count++;
            }


        }
        System.out.println(count);


       /* String[] tumKarakterlerArr= str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));
        // [j, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l]
        int sayac=0;
        // bir loop ile tum karakterleri kontrol edelim
        for (int i = 0; i <tumKarakterlerArr.length ; i++) {
            if (tumKarakterlerArr[i].equals("e")){
                sayac++;
            }
        }
        System.out.println("Metindeki e sayisi : " + sayac);*/


    }
}
