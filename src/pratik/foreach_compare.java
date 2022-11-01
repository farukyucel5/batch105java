package pratik;

import java.util.ArrayList;
import java.util.List;

public class foreach_compare {
    public static void main(String[] args) {

        /*
        Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
        ayri bir liste olarak veren bir program yazin.
         */

        int[] a1={1,2,3,4,5,6,7,8,9};
        int[] a2={5,6,7,8,9,12,34,67};

        List<Integer> new_list=new ArrayList<>();


        if (a2.length<a1.length)
        {
            for (int each:a2)
            {

                for (int i = 0; i < a1.length; i++)
                {
                    if (a1[i]==each)
                    {
                        new_list.add(each);
                    }

                }

            }
        }

        else
        {
            for (int each:a1)
            {
                for (int i = 0; i < a2.length; i++)
                {
                    if (a2[i]==each)
                    {
                        new_list.add(each);
                    }

                }

            }
        }


        System.out.println(new_list);
    }
}
