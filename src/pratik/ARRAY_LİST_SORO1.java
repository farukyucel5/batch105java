package pratik;

import java.util.ArrayList;
import java.util.List;

public class ARRAY_LİST_SORO1 {

    public static void main(String[] args) {


        /*You are given an array nums consisting of positive integers.

        You have to take each integer in the array, reverse its digits, and add it to the end of the array.
        You should apply this operation to the original integers in nums.

         Return the number of distinct integers in the final array.

          Example 1:

        Input: nums = [1,13,10,12,31]
        Output: 6

        Explanation: After including the reverse of each number,
        the resulting array is [1,13,10,12,31,1,31,1,21,13].
        The reversed integers that were added to the end of the array are underlined.
        The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).*/

        int[] nums ={1,13,103,12,31};

        List<Integer> A_list=new ArrayList<>();
        List<String> A_list1=new ArrayList<>();

        for (int i = 0; i <nums.length ; i++)
        {
            A_list.add(nums[i]);

        }
        System.out.println(A_list);

        for (int i = 0; i <A_list.size() ; i++)
        {
            String str1="";
            str1+=A_list.get(i);

            A_list1.add(str1);
        }




        for (int i = 0; i < A_list.size(); i++)
        {
            int sayı=A_list.get(i);
            String str="";

            while (sayı>0)
            {
                int ldigit=sayı%10;
                sayı/=10;
                str+=ldigit;
            }
            A_list1.add(str);

        }

        System.out.println(A_list1);










    }

}
