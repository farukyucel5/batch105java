package ders26;

import java.util.Arrays;

public class passbyvalue_array {
    public static void main(String[] args) {
        int[] arr={3,4,5};


        artır(arr);
        artır(arr);
        artır(arr);

        System.out.println("methodlar sonrası "+Arrays.toString(arr));
    }

    public static void artır(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=arr[i]+5;


        }

        System.out.println(Arrays.toString(arr));
    }
}
