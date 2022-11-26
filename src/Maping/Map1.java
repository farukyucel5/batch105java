package Maping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map1 {
    /*
 MAP Soru -1 - Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
yazınız.
Map<String, Integer> product = new HashMap<>();
product.put("Laptop", 12);
product.put("TV", 53);
product.put("Refrigerator", 12);
product.put("Music System", 87);
     */

    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        Set<String> set1=product.keySet();
       int flag=0;
       for(String each:set1) {
           if (each.equals("Laptop"))
               flag++;
       }

       if (flag!=0)
           System.out.println("This list includes the product 'Laptop' ");
    }

}
