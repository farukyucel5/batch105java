package pratik;

import java.util.ArrayList;
import java.util.List;

public class for_each_repeat {

    public static void main(String[] args) {


        //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        int[] arr={1,2,3,1,2,3,3,4,4,5,6,6,7};

        List<Integer>new_list=new ArrayList<>();

        for (int each:arr)
        {
            if (!new_list.contains(each))
            {
                new_list.add(each);
            }

        }

        System.out.println(new_list);
    }
}
