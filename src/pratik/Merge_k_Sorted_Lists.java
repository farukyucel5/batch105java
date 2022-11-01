package pratik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_k_Sorted_Lists
{
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

        int[][] array={{1,4,5},{1,3,4},{2,6}};

        List<Integer>merge=new ArrayList<>();

        for (int[] each:array)
        {
            for (int eachone:each)
            {
                merge.add(eachone);  //dizi'nin tüm elemanları yukarıda oluşturulan listenin içine atılır.
            }
        }

        System.out.println(merge);

        int[] newaarray=new int[merge.size()]; //listenin içindeki elemanları tekrar bir dizinin içine atmak için
        //bu dizi oluşturuldu

        for (int i = 0; i < merge.size(); i++)
        {
            newaarray[i]=merge.get(i);      //listedeki elemanlar yukarıda oluşturulan dizinin içine atılıyor.

        }

        System.out.println(Arrays.toString(newaarray));//dizinin son hali yazdırıldı.

        Arrays.sort(newaarray);//dizinin elemanları sıralı olmadığı için bukomutla elemanlar küçükten büyüğe sıralandı

        System.out.println(Arrays.toString(newaarray));//sıralanmış dizinin nihai hali yazdırıldı.


    }

}
