package Teamwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class merge_k_linked_lists {
    public static void main(String[] args) {
               /*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

 Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
         */

        List<List> linked_list=new ArrayList<>();

        linked_list.add(Arrays.asList(1,4,5));
        linked_list.add(Arrays.asList(1,3,4));
        linked_list.add(Arrays.asList(2,6));

        System.out.println(linked_list);

        List<Integer> merge_list=new ArrayList<>();

        for (List<Integer> each:linked_list)
        {
            for (int eachone:each)
            {
                merge_list.add(eachone);

            }

        }

        System.out.println("unsorted list: "+merge_list);//unsorted list

        Collections.sort(merge_list);//it's being sorted

        System.out.println("sorted list: "+merge_list);//sorted one!


    }
}
