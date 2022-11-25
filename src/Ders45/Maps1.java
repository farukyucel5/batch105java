package Ders45;

import java.util.HashMap;
import java.util.Map;

public class Maps1 {
    public static void main(String[] args) {
        //verilen bir cümlede kullanılan herbir harfi ve o harfin kullanım miktarını
        //A=5 b=3 gibi yazdırın.

        String input="hello java what have you been getting up to now";

        Map<String,Integer> map=new HashMap<>();
        String input1=input.replace(" ","");
        String[] inputstr=input1.split("");

        System.out.println(input1);
        int count=0;

        for (int i = 0; i < inputstr.length; i++) {

           if(map.containsKey(inputstr[i]))
           {
               continue;
           }
           else
           {

               for (int j = i; j < inputstr.length; j++) {

                   if (inputstr[i].equals(inputstr[j])) {
                       count++;
                   }
               }
           }

            map.put(inputstr[i],count);

            count=0;
        }



        System.out.println(map);
    }
}
