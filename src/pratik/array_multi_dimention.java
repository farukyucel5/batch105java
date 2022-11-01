package pratik;

public class array_multi_dimention {
    public static void main(String[] args) {

        /*
        Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
         method olusturun.
         */

        int[][] multi_d={{1,2,3,4},{3,6,7,8,1},{4,0}};
         int[] new_array;

        for (int i = 0; i < multi_d.length; i++) {

            for (int j = 0; j <multi_d[i].length; j++)
            {
                System.out.print(multi_d[i][j]+" ");
            }


        }


    }
}
