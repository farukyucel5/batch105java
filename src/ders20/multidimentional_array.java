package ders20;

import java.util.Arrays;

public class multidimentional_array {
    public static void main(String[] args)
    {

        int[][] array={{1,2,3},{2,7,8,9},{2},{3,6,8}};

        System.out.println(array.length);

        System.out.println(array[2].length);

        System.out.println(array[1]);

        System.out.println(Arrays.toString(array[1]));

        System.out.println(Arrays.deepToString(array));

    }
}
