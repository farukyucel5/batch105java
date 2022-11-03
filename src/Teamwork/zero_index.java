package Teamwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class zero_index {
    public static void main(String[] args) {
        /*
You are given a 0-indexed integer array nums. In one operation, you may do the following:

Choose two integers in nums that are equal.
Remove both integers from nums, forming a pair.
The operation is done on nums as many times as possible.

Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs
that are formed and answer[1] is the number of leftover integers in nums
after doing the operation as many times as possible.



Example 1:

Input: nums = [1,3,2,1,3,2,2]
Output: [3,1]
Explanation:
Form a pair with nums[0] and nums[3] and remove them from nums. Now, nums = [3,2,3,2,2].
Form a pair with nums[0] and nums[2] and remove them from nums. Now, nums = [2,2,2].
Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [2].
No more pairs can be formed. A total of 3 pairs have been formed, and there is 1 number leftover in nums.
Example 2:

Input: nums = [1,1]
Output: [1,0]
Explanation: Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [].
No more pairs can be formed. A total of 1 pair has been formed, and there are 0 numbers leftover in nums.
Example 3:

Input: nums = [0]
Output: [0,1]
Explanation: No pairs can be formed, and there is 1 number leftover in nums.
         */

        int[] nums={1,3,2,1,3,2,2,3,1,9};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i]==nums[i - 1])
            {                            //Now checking for the duplicate and if we have found one then changing
                nums[i] = -1;            //their values out of the range of nums[i]
                nums[i - 1] = -1;        //so that they cannot be used again for pairing
                pairs++; //Increasing the pair count
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(pairs);

        int count=0;
        for (int num : nums)
        {
            if (num != -1) {
                count++;//it counts the number of single numbers
            }

        }

        List<Integer> asist=new ArrayList<>();

        asist.add(pairs);
        asist.add(count);

        System.out.println("we have "+pairs+" pairs"+" and "+" we have "+count+ " leftovers:  "+asist);





    }
}
