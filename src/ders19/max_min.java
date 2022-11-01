package ders19;

import java.util.Arrays;

public class max_min {

    public static void main(String[] args) {
        //verilen arrray'de en küçük ve en büyük sayıları yazdır;

        int[] arr={3,8,9,2,98,1};
        maxmin(arr);
    }

    public static void maxmin(int[]arr)
    {
        Arrays.sort(arr);

        System.out.println("max value: "+ arr[arr.length-1]+" min value "+ arr[0]);
    }
}
