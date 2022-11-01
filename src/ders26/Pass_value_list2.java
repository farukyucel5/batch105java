package ders26;

import java.util.ArrayList;
import java.util.List;

public class Pass_value_list2 {
    public static void main(String[] args) {

        //
        List<Integer> sayılar=new ArrayList<>();

        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);

        System.out.println(artır(sayılar));//[15,25,35]

        System.out.println(sayılar);//[10,20,30]

    }

    public static List<Integer> artır(List<Integer> liste)
    {
        List<Integer> newlist=new ArrayList<>();

        for (int i = 0; i < liste.size(); i++)
        {
            newlist.add(liste.get(i)+5);

        }

        return newlist;
    }
}
