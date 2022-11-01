package pratik;

import java.util.Arrays;

public class array_multi_dimentional_2 {

    public static void main(String[] args) {

        /*
           Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
           olusturacagimiz tek katli bir array’e bu toplamlari atayin.
           input : int[][] arr = {{3,4,5}, {2,3,6,7}};
           output: [5, 7, 11]

         */
        int[][] ary = {{3,4,5}, {2,3,6,7}};

        int[] newarr=new int[3];

        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < 3; j++)
            {
                newarr[j]=ary[i][j]+ary[i+1][j];

            }

        }
        System.out.println(Arrays.toString(newarr));


    }
}
