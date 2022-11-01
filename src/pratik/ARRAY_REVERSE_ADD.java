package pratik;

import java.util.Arrays;
import java.util.Map;

public class ARRAY_REVERSE_ADD {
    public static void main(String[] args) {

        /*
        You are given an array nums consisting of positive integers.

        You have to take each integer in the array, reverse its digits, and add it to the end of the array.
        You should apply this operation to the original integers in nums.

        Return the number of distinct integers in the final array.

                  Example 1:

         Input: nums = [1,13,10,12,31]
         Output: 6

        Explanation: After including the reverse of each number,
        the resulting array is [1,13,10,12,31,1,31,1,21,13].
        The reversed integers that were added to the end of the array are underlined.
        Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
        The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
        */

        int[] nums ={1,13,10,12,31};
        String[] merge=new String[10];

        for (int i = 0; i < nums.length; i++)
        {
            merge[i]=""+nums[i];

        }


        for (int i =nums.length; i <merge.length; i++)
        {

               int digit= nums[i-nums.length]%10;
               int digit1=nums[i-nums.length]/10;

               if (digit1==0)
               {
                   merge[i]=""+digit;
               }
               else if (digit==0)
               {
                   merge[i]=""+digit1;
               }
               else
               {
                   merge[i]=""+digit+digit1;
               }


        }

        System.out.println(Arrays.toString(merge));

    }

}
