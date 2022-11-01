package ders20;

public class soru {

    public static void main(String[] args) {

        //Soru 5- Verilen 2 katli bir array’de
        // her bir inner array’in son elementlerinin toplaminini yazdiran bir method olusturun

        int[][] arr = {{5, 7}, {5, 8, 9}, {0, 1}};

        toplam(arr);

    }

    public static void toplam(int[][] arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {

           sum+= arr[i][arr[i].length-1];


        }
        System.out.println(sum);

    }
}
