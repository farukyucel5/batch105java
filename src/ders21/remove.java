package ders21;

import java.util.ArrayList;
import java.util.List;

public class remove {
    public static void main(String[] args) {
        //verilen dizideki tekrar eden sayıları teke indiren kodu yazın.
        List<Integer> sayılar=new ArrayList<>();

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};


        for (int i = 0; i < arr.length; i++)
        {

            sayılar.add(arr[i]);
        }

        sayılar.remove(2);//içine yazılan indexdeki değeri kaldırır eğer direk kaldırılacak
        //değeri girmak istiyorsak tanımlanması lazım.ör.Integer r_value2=3;

        System.out.println(sayılar);

        Integer remove_value=4;

        sayılar.remove(remove_value);

        System.out.println(sayılar);

        Integer r_value2=3;

        while (sayılar.contains(r_value2))
        {
            sayılar.remove(r_value2);         //tüm üçleri siler
        }

        System.out.println(sayılar);

        //sayılar.clear();//tüm elemanları siler.

        //System.out.println(sayılar);
        List<Integer> sayılar1=new ArrayList<>();
        sayılar1.add(1);
        sayılar1.add(4);


        sayılar.removeAll(sayılar1);

        System.out.println(sayılar);



    }
}
