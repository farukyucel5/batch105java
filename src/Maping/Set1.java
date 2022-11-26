package Maping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {
    /*
SET Sorusu - 1 - Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?
List<Integer> myList = new ArrayList<>();
myList.add(12);
myList.add(21);
myList.add(12);
myList.add(13);
myList.add(12);
myList.add(21);
myList.add(35);
     */

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);


        Set<Integer> set1=new HashSet<>();

        set1.addAll(myList);

        int setlength=set1.size();
        int listlength=myList.size();

        System.out.println(listlength-setlength+" adet tekrar eden ürün vardır");




    }
}
