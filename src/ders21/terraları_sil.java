package ders21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class terraları_sil {

    public static void main(String[] args) {


        //verilen dizideki tekrar eden sayıları teke indiren kodu yazın.
        List<Integer> liste=new ArrayList<>();

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};


        for (int i = 0; i < arr.length; i++)
        {
            if (liste.contains(arr[i])==false)
                liste.add(arr[i]);


        }


        int[] newarr=new int[liste.size()];

        for (int i = 0; i < liste.size(); i++)
        {
           newarr[i]= liste.get(i);//listenin i.indexindeki elemani newarr'e atıyoruz.
        }

        System.out.println(Arrays.toString(newarr));
    }
}
