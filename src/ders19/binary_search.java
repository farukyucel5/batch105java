package ders19;

import java.util.Arrays;

public class binary_search {

    public static void main(String[] args) {

        int[] arr={1,8,5,3,9,0,34,32};


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//arraydeki bir elemanın hangi indexte olduğunu söyler

        System.out.println(Arrays.binarySearch(arr,8));
        /*
        binarysearch methodunun doğru sonuç vermesi için ilk başta sort edilmelidir
        eğer sort edilmeden kullanılırsa doğru sonuçta verebilir yanlışta.
         */

        int[] arr1={1,2,3,434,5,56};
    }
}
