package pratik;

import java.util.ArrayList;
import java.util.List;

public class ARRAR_REVERSE {
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
        The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
        */


        int[] nums ={1,13,1030,12,31,101,33};

        List<Integer> A_list=new ArrayList<>();


        for (int i = 0; i < nums.length; i++)
        {
            A_list.add(nums[i]);   //First,all the elements of the array was put into the list created above.

        }


        for (int i = 0; i < nums.length; i++)
        {
            int last_digit=0;

            int sayı= nums[i];

            while (sayı!=0)
            {
                last_digit=last_digit*10;
                last_digit=last_digit+sayı%10; //inverting the numbers
                sayı/=10;
            }

            A_list.add(last_digit);//And the second step is to place all the inverted numbers in the list.
        }

        System.out.println(A_list);

        //detection of distinct numbers

        List<Integer> A_district=new ArrayList<>();
        /*
        it was created to be able to detect the distinct numbers
         in the list.
         */


        int count=0;

        for (int i = 0; i < A_list.size(); i++)
        {
            if (!A_district.contains(A_list.get(i)))
            {
                A_district.add(A_list.get(i));
                count++;
            }

        }

        System.out.println("Listede "+count+" adet birbirinden farklı tam sayı vardır");





    }
}
