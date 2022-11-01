package ders26;

import java.util.ArrayList;
import java.util.List;

public class pass_by_value_list {
    public static void main(String[] args) {
//method olustur listdeki sayıları beş artır
        List<Integer> sayılar=new ArrayList<>();

        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);
        ıncrement(sayılar);
        //method call sonrası main içinde listi yazdır
        System.out.println(sayılar);
    }

    public static void ıncrement(List<Integer>sayılar)
    {
        for (int i = 0; i < sayılar.size(); i++)
        {
            sayılar.set(i,sayılar.get(i)+5);

        }
        System.out.println(sayılar);
    }
}
