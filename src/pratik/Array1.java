package pratik;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        /*
         Write a Java program to print the following grid.

Expected Output :
               - - - - - - - - - -
               - - - - - - - - - -
               - - - - - - - - - -
               - - - - - - - - - -
               - - - - - - - - - -
               - - - - - - - - - -
               - - - - - - - - - -
               - - - - - - - - - -
               - - - - - - - - - -
               - - - - - - - - - -
*/

        char[] array={'-','-','-','-','-','-','-','-','-'};

        hyphen(array);//oluşturduğumuz methodu çağırdık.
    }

    public static void hyphen(char[] arr)
    {
        for (int i = 0; i <10 ; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[j]+" ");//içteki for döngüsü dizinin elemanlarını yanyana yazdırır
                        //dıştaki ise bu işlemi 10 defa tekrarlar ki yukarıda istenen şekil ortaya çıksın.

            }
            System.out.println();//diziyi her yazdırdığında yeni diziyi yazmak için bir alt satıra geçer.

        }

    }

}
