package Maping;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set2 {
    public static void main(String[] args) {
        /*
       SET Sorusu 2 : Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
Örnek: ‘Mississippi’ ´ Misp
         */
        String str="Hello Java! what have you been getting up to this weekend?";

        String[] strarr=str.split("");

        Set<String> set1=new TreeSet<>();//doğal sıralı elde etmek için yaptım Hashset de olabilirdi.

        set1.addAll(Arrays.asList(strarr));//dizi listeye çevrilip toplu olarak set'in içine atılır ve bu şekilde
        //farklı elemanlar elde edilir.

        StringBuilder ultimate_str= new StringBuilder();
        for (String eachone:set1) {
            ultimate_str.append(eachone);
        }

        System.out.println(ultimate_str);

    }
}
