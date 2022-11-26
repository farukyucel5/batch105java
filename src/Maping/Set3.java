package Maping;

import java.util.*;

public class Set3 {
    /*
SET Sorusu 3 : Bir liste ve bir set olusturunuz. Set içerisinde var olan listenin bütün elemanlarını kaldıran
bir kod yazınız.
List<Integer> myList = new ArrayList<>();
myList.add(10);
myList.add(31);
myList.add(15);
myList.add(7);
myList.add(13);
Set<Integer> mySet = new HashSet<>();
mySet.add(10);
mySet.add(7);
mySet.add(35);
mySet.add(13);
       */
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);


        Set<Integer>set_list=new HashSet<>();
        set_list.addAll(myList);

        for (Integer each : myList) {
            if (mySet.contains(each))
                set_list.remove(each);
        }

        System.out.println(set_list);
    }
}
