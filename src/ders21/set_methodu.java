package ders21;

import java.util.ArrayList;
import java.util.List;

public class set_methodu {
    public static void main(String[] args) {

        //verilen dizideki tekrar eden sayıları teke indiren kodu yazın.
        List<Integer> sayılar=new ArrayList<>();

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};


        for (int i = 0; i < arr.length; i++)
        {

            sayılar.add(arr[i]);
        }
        System.out.println( sayılar.set(0,8));//bu şekilde herhangi bir indexteki eski değere ulaşabiliriz
        //mesela yukarıda 0.indexteki eski değere eriştik.

        sayılar.set(0,8);//0.indexdekini 8 yapar eski değer gider

        sayılar.set(1,9);

        System.out.println(sayılar);

    }
}
