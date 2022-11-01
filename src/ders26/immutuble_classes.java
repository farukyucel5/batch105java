package ders26;

import java.util.ArrayList;
import java.util.List;

public class immutuble_classes {
    public static void main(String[] args) {

        String str="java güzeldir";

        System.out.println(str.toUpperCase());//JAVA GUZELDIR.
        System.out.println(str);//java güzeldir
        //string immutubable olduğu için stringi kalıcı değiştiremeyiz.

        List<String> harf=new ArrayList<>();//list ve array mutubable bu yüzden methodla yapılan değişiklikler kalıcı


        harf.add("a");
        harf.add("b");
        harf.remove(0);
        System.out.println(harf);



    }
}
