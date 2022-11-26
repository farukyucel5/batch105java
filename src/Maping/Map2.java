package Maping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {
    public static void main(String[] args) {
        /*
 MAP Soru -2 : Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.

Map<String, Integer> product = new HashMap<>();
product.put("Laptop", 12);
product.put("TV", 53);
product.put("Refrigerator", 12);
product.put("Music System", 87
         */

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);


        Set<Map.Entry<String,Integer>> product_sales=product.entrySet();
        double sum=0;

        for (Map.Entry<String,Integer> each:product_sales) {
            sum+=each.getValue();
        }

        System.out.println("Satılan toplam ürün sayısı "+sum);





    }
}
