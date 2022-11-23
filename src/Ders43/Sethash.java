package Ders43;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sethash {
    //verilen bir array'in tekrar eden elementleri silip
    //her elementin 1 kere kullanıldığı hale getirin

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 6};

        Set<Integer> gecici_set=new HashSet<>();

        for (Integer each: arr)
        {
            gecici_set.add(each);
        }

        arr=new int[gecici_set.size()];


        int index=0;

        for (Integer each: gecici_set) {
            arr[index]=each;
            index++;
        }

        System.out.println(Arrays.toString(arr));


    }
}