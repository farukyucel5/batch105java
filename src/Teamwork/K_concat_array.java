package Teamwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K_concat_array {
    public static void main(String[] args) {

        /*
Given an integer array arr and an integer k, modify the array by repeating it k times.

For example, if arr = [1, 2] and k = 3 then the modified array will be [1, 2, 1, 2, 1, 2].

Return the maximum sub-array sum in the modified array.

Note that the length of the sub-array can be 0 and its sum in that case is 0.




Example 1:

Input: arr = [1,2], k = 3
Output: 9
Example 2:

Input: arr = [1,-2,1], k = 5
Output: 2
Example 3:

Input: arr = [-1,-2], k = 7
Output: 0
         */
       int[] arr={-1,-2,4,5};
       int k=3;

       int[] concat_arr=new int[k*arr.length];

        List<Integer> inter_list=new ArrayList<>();

        for (int i = 0; i <k; i++)
        {
            for (int value : arr) {
                inter_list.add(value);
            }
        }


        for (int i = 0; i < inter_list.size(); i++)
        {
            concat_arr[i]=inter_list.get(i);

        }

        System.out.println(Arrays.toString(concat_arr));
        List<Integer> transfer_list=new ArrayList<>();

        for (int i = 0; i < concat_arr.length; i++)
        {
            for (int j = i+1; j < concat_arr.length+1; j++)
            {
                int[] new_array=Arrays.copyOfRange(concat_arr,i,j);
                int sum=0;
                for (int value : new_array) {
                    sum += value;
                    if (sum < 0)
                        sum = 0;
                    if (!transfer_list.contains(sum)) {
                        transfer_list.add(sum);
                    }

                }

            }


        }

        Collections.sort(transfer_list);
        System.out.println("the maximum sub-array sum in the modified array "+
                transfer_list.get(transfer_list.size()-1));



        }





    }